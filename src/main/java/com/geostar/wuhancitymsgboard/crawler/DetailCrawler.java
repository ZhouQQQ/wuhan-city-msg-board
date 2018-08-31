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
import org.springframework.stereotype.Component;

@Component
public class DetailCrawler {

	private static final Logger logger = LoggerFactory.getLogger(DetailCrawler.class);
	
	private static final String URL = "http://liuyan.cjn.cn/threads/content?tid=";
	
	public void crawlerDetail(int tid) {
		List<String> picPath = new ArrayList<String>();
		Document document = null;
		try {
			document = Jsoup.connect(URL+tid).get();
		} catch (IOException e) {
			logger.error("连接到{}异常",URL+tid);
		}
		Element questionDetailEle = document.getElementById("zoom");
		String questionDetail = questionDetailEle.html();
		Elements questionPicEles =document.getElementsByAttributeValue("class", "pic");
		for (Element element : questionPicEles) {
			Elements aEles = element.getElementsByTag("a");
			for (Element element2 : aEles) {
				String picUrl = element2.attr("href");
				picPath.add("http://liuyan.cjn.cn"+picUrl);
			}
		}
		
		///html/body/div[7]/ul/li/p
		String answerDetail = document.selectFirst(".liuyan_box05").selectFirst("ul").selectFirst("li").selectFirst("p").html();
		logger.info("获取到[{}][详细内容]{},[附件数量]{}\n[详细回复]{}",tid,questionDetail,picPath.size(),answerDetail);
	}
	
	public static void main(String[] args) {
		new DetailCrawler().crawlerDetail(192635);
	}
}
