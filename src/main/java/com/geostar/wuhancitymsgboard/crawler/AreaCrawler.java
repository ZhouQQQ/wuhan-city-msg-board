package com.geostar.wuhancitymsgboard.crawler;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.geostar.wuhancitymsgboard.dao.AreaRepository;
import com.geostar.wuhancitymsgboard.pojo.Area;

@Component
public class AreaCrawler {

	@Autowired
	private AreaRepository areaRepository;

	public static Map<Integer, String> AREA_DATAS = new HashMap<Integer, String>();

	private static final Logger logger = LoggerFactory.getLogger(AreaCrawler.class);

	private static final String URL = "http://liuyan.cjn.cn/index.html";

	public void crawlerAllArea() {
		Document document = null;
		try {
			document = Jsoup.connect(URL).get();
		} catch (IOException e) {
			logger.error("连接到{}异常",URL);
		}
		Elements es = document.getElementsByAttributeValueContaining("href", "/threads/list?fid=");
		for (Element element : es) {
			Area area = new Area();
			String href = element.attr("href");
			int code = Integer.parseInt(href.split("=")[1]);
			String name = element.text();
			logger.info("爬取到-【{}】{}", code, name);
			area.setCode(code);
			area.setName(name);
			AREA_DATAS.put(code, name);
			areaRepository.save(area);
		}

	}

}
