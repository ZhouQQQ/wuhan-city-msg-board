package com.geostar.wuhancitymsgboard.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Area {
	@Id
	private int fid;
	private String name;

	public int getCode() {
		return fid;
	}

	public void setCode(int fid) {
		this.fid = fid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
