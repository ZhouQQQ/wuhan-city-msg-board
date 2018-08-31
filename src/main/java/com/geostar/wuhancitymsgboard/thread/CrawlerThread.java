package com.geostar.wuhancitymsgboard.thread;

import com.geostar.wuhancitymsgboard.crawler.MsgCrawler;

public class CrawlerThread implements Runnable {

	private int areaCode;

	public CrawlerThread(int areaCode) {
		this.areaCode = areaCode;
	}

	@Override
	public void run() {
		MsgCrawler mc = new MsgCrawler();
		mc.getAllMsg(areaCode);
	}

}
