package com.geostar.wuhancitymsgboard.pojo.vo;

public class CrawlerStatus {

	public CrawlerStatus(boolean status, long time, int count) {
		this.status = status;
		this.time = time;
		this.count = count;
	}

	private boolean status;
	private int count;
	private long time;

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}
