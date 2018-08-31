package com.geostar.wuhancitymsgboard.crawler;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSONObject;
import com.geostar.wuhancitymsgboard.dao.AnswerRepository;
import com.geostar.wuhancitymsgboard.dao.AreaRepository;
import com.geostar.wuhancitymsgboard.dao.MsgRepository;
import com.geostar.wuhancitymsgboard.pojo.MessageBoardResult;
import com.geostar.wuhancitymsgboard.pojo.Newestanswer;
import com.geostar.wuhancitymsgboard.pojo.Responsedata;
import com.geostar.wuhancitymsgboard.pojo.Threads;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

@Component
@Scope(scopeName="prototype")
public class MsgCrawler {
	
	private static final Logger logger = LoggerFactory.getLogger(MsgCrawler.class);

	@Autowired
	private MsgRepository msgRepository;
	
	@Autowired
	private AreaRepository areaRepository;
	
	@Autowired
	private DetailCrawler detailCrawler;
	
	@Autowired
	private AnswerRepository answerRepository;

	private OkHttpClient okhttpclient = new OkHttpClient();

	private static final String URL = "http://liuyan.cjn.cn/threads/queryThreadsList";

	private static final String REFER = "http://liuyan.cjn.cn/threads";

	public static final MediaType MT = MediaType.parse("application/x-www-form-urlencoded");

	public List<Responsedata> getAllMsg(int areaCode) {
		List<Responsedata> allDataList = new ArrayList<Responsedata>();
		logger.info("正在爬取[{}]-[{}]数据",areaCode,areaRepository.findById(areaCode));
		getMsg(allDataList, 0, areaCode);
		return allDataList;
	}

	private List<Responsedata> getMsg(List<Responsedata> resDataList, int lastTid, int areaCode) {
		JSONObject jo = new JSONObject();
		jo.put("fid", areaCode);
		jo.put("lastTid", lastTid);
		RequestBody body = RequestBody.create(MT, jsonToUrlQueryString(jo));
		Request request = new Request.Builder().url(URL).post(body).addHeader("Referer", REFER).build();
		Response response;
		String bodys = null;
		try {
			response = okhttpclient.newCall(request).execute();
			bodys = response.body().string();
		} catch (IOException e) {
			e.printStackTrace();
		}
		MessageBoardResult mbr = JSONObject.parseObject(bodys, MessageBoardResult.class);
		List<Responsedata> tmpData = mbr.getResponsedata();
		if (!tmpData.isEmpty()) {
			for (Responsedata responsedata : tmpData) {
				Threads msgItem = responsedata.getThreads();
				Newestanswer answerItem = responsedata.getNewestanswer();
				msgRepository.save(msgItem);
				if(answerItem!=null) {
					answerRepository.save(answerItem);
				}
				detailCrawler.crawlerDetail(responsedata.getThreads().getTid(),answerItem!=null);
				//logger.info("获取到[{}]{}", responsedata.getThreads().getTid(), responsedata.getThreads().getSubject());
			}
			
			resDataList.addAll(mbr.getResponsedata());
			lastTid = mbr.getResponsedata().get(mbr.getResponsedata().size() - 1).getThreads().getTid();
			getMsg(resDataList, lastTid, areaCode);
		}
		return resDataList;

	}

	private static String jsonToUrlQueryString(JSONObject jo) {
		StringBuilder sb = new StringBuilder();
		Iterator<String> it = jo.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();
			sb.append(key).append("=").append(jo.getString(key)).append("&");
		}
		return sb.toString().substring(0, sb.toString().length() - 1);
	}

}
