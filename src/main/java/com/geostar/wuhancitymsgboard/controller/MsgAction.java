package com.geostar.wuhancitymsgboard.controller;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.geostar.wuhancitymsgboard.crawler.AreaCrawler;
import com.geostar.wuhancitymsgboard.crawler.MsgCrawler;
import com.geostar.wuhancitymsgboard.dao.AreaRepository;
import com.geostar.wuhancitymsgboard.pojo.Area;
import com.geostar.wuhancitymsgboard.pojo.Responsedata;
import com.geostar.wuhancitymsgboard.pojo.vo.CrawlerStatus;

@RestController
public class MsgAction {

	@Autowired
	private AreaRepository areaRepository;

	@Autowired
	private AreaCrawler areaCrawler;

	@Autowired
	private MsgCrawler msgCrawler;

	@RequestMapping("asycCrawlall")
	public void asycCrawlerAllData() {
		areaCrawler.crawlerAllArea();
		ExecutorService es = Executors.newCachedThreadPool();
		List<Area> allArea = areaRepository.findAll();
		for (Area area : allArea) {
			es.execute(new Runnable() {
				@Override
				public void run() {
					msgCrawler.getAllMsg(area.getCode());
				}
			});
		}
	}

	@RequestMapping("sycCrawlall")
	public CrawlerStatus sycCrawlerAllData() {
		Instant start = Instant.now();
		areaCrawler.crawlerAllArea();
		List<Area> allArea = areaRepository.findAll();
		List<Responsedata> resData = new ArrayList<Responsedata>();
		for (Area area : allArea) {
			msgCrawler.getAllMsg(area.getCode());
		}
		Instant end = Instant.now();
		CrawlerStatus cs = new CrawlerStatus(!resData.isEmpty(), Duration.between(start, end).getSeconds(), resData.size());
		return cs;
	}

	@RequestMapping("crawl/{areacode}")
	public CrawlerStatus crawlByAreaCode(@PathVariable("areacode") Integer areacode) {
		Instant start = Instant.now();
		List<Responsedata> resData = msgCrawler.getAllMsg(areacode);
		Instant end = Instant.now();
		CrawlerStatus cs = new CrawlerStatus(!resData.isEmpty(), Duration.between(start, end).getSeconds(), resData.size());
		return cs;
	}

}
