package com.geostar.wuhancitymsgboard.crawler;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.geostar.wuhancitymsgboard.dao.AnswerRepository;
import com.geostar.wuhancitymsgboard.dao.MsgRepository;
import com.geostar.wuhancitymsgboard.pojo.Newestanswer;
import com.geostar.wuhancitymsgboard.pojo.Threads;

@Component
public class DetailCrawler {

	private static final Logger logger = LoggerFactory.getLogger(DetailCrawler.class);

	private static final String URL = "http://liuyan.cjn.cn/threads/content?tid=";

	@Autowired
	private MsgRepository msgRepository;

	@Autowired
	private AnswerRepository answerRepository;

	public void crawlerDetail(int tid, boolean hasAns) {
		logger.info("爬取[{}]详细内容,是否有回答:{}",tid,hasAns);
		Threads msg = msgRepository.findById(tid).get();
		List<String> picPath = new ArrayList<String>();
		Document document = null;
		try {
			document = Jsoup.connect(URL + tid).get();
		} catch (IOException e) {
			logger.error("连接到{}异常", URL + tid);
		}
		Element questionDetailEle = document.getElementById("zoom");
		String questionDetail = questionDetailEle.html();
	
		Elements questionPicEles = document.getElementsByAttributeValue("class", "pic");
		for (Element element : questionPicEles) {
			Elements aEles = element.getElementsByTag("a");
			for (Element element2 : aEles) {
				String picUrl = element2.attr("href");
				picPath.add("http://liuyan.cjn.cn" + picUrl);
			}
		}
		msg.setDetail(questionDetail);
		msg.setPicUrl(String.join(",", picPath));
		msgRepository.save(msg);

		//回答部分
		String answerDetail = null;
		if (hasAns) {
			Element answerDetailEle = document.selectFirst("html > body > div.clearfix.liuyan_box05.w1200 > ul > li >p");
			answerDetail = answerDetailEle == null ? null : answerDetailEle.html();
			Newestanswer na = answerRepository.findByTid(tid);
			na.setDetail(answerDetail);
			answerRepository.save(na);
		}

		logger.info("获取到[{}][详细内容]{},[附件数量]{}\n[详细回复]{}", tid, questionDetail, picPath.size(), answerDetail);
	}

}
