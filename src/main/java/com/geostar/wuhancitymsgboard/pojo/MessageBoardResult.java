/**
  * Copyright 2018 aTool.org 
  */
package com.geostar.wuhancitymsgboard.pojo;

import java.util.List;


import org.codehaus.jackson.annotate.JsonProperty;

public class MessageBoardResult {

	private String result;
	@JsonProperty("responseData")
	private List<Responsedata> responsedata;

	public void setResult(String result) {
		this.result = result;
	}

	public String getResult() {
		return result;
	}

	public void setResponsedata(List<Responsedata> responsedata) {
		this.responsedata = responsedata;
	}

	public List<Responsedata> getResponsedata() {
		return responsedata;
	}

}