/**
  * Copyright 2018 aTool.org 
  */
package com.geostar.wuhancitymsgboard.pojo;

import org.codehaus.jackson.annotate.JsonProperty;

public class Responsedata {

    private Threads threads;
    @JsonProperty("newestAnswer")
    private Newestanswer newestanswer;
    public void setThreads(Threads threads) {
         this.threads = threads;
     }
     public Threads getThreads() {
         return threads;
     }

    public void setNewestanswer(Newestanswer newestanswer) {
         this.newestanswer = newestanswer;
     }
     public Newestanswer getNewestanswer() {
         return newestanswer;
     }

}