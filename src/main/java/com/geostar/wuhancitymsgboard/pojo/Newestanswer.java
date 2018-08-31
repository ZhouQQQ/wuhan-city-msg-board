/**
  * Copyright 2018 aTool.org 
  */
package com.geostar.wuhancitymsgboard.pojo;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.codehaus.jackson.annotate.JsonProperty;

@Entity()

public class Newestanswer {

	@Id
    private int asid;
    private int tid;
    private int fid;
    @JsonProperty("asContent")
    private String ascontent;
    private int official;
    private String organization;
    private int dateline;
    private String ip;
    @JsonProperty("groupId")
    private int groupid;
    @JsonProperty("userId")
    private int userid;
    @JsonProperty("nickName")
    private String nickname;
    @JsonProperty("answerState")
    private int answerstate;
    private int fdid;
    private int attachment;
    private int lastupdate;
    @JsonProperty("asOrder")
    private int asorder;
    private int recommend;
    @JsonProperty("refusedReason")
    private String refusedreason;
    private String auditor;
    private String audittel;
    private String auditclass;
    private String operat;
    private String operatortel;
    @JsonProperty("operatProcess")
    private String operatprocess;
    @JsonProperty("operatorSituation")
    private String operatorsituation;
    @JsonProperty("forumName")
    private String forumname;
    @JsonProperty("forumPath")
    private String forumpath;
    private String threads;
    @JsonProperty("groupName")
    private String groupname;
    @JsonProperty("attachmentList")
    private String attachmentlist;
    public void setAsid(int asid) {
         this.asid = asid;
     }
     public int getAsid() {
         return asid;
     }

    public void setTid(int tid) {
         this.tid = tid;
     }
     public int getTid() {
         return tid;
     }

    public void setFid(int fid) {
         this.fid = fid;
     }
     public int getFid() {
         return fid;
     }

    public void setAscontent(String ascontent) {
         this.ascontent = ascontent;
     }
     public String getAscontent() {
         return ascontent;
     }

    public void setOfficial(int official) {
         this.official = official;
     }
     public int getOfficial() {
         return official;
     }

    public void setOrganization(String organization) {
         this.organization = organization;
     }
     public String getOrganization() {
         return organization;
     }

    public void setDateline(int dateline) {
         this.dateline = dateline;
     }
     public int getDateline() {
         return dateline;
     }

    public void setIp(String ip) {
         this.ip = ip;
     }
     public String getIp() {
         return ip;
     }

    public void setGroupid(int groupid) {
         this.groupid = groupid;
     }
     public int getGroupid() {
         return groupid;
     }

    public void setUserid(int userid) {
         this.userid = userid;
     }
     public int getUserid() {
         return userid;
     }

    public void setNickname(String nickname) {
         this.nickname = nickname;
     }
     public String getNickname() {
         return nickname;
     }

    public void setAnswerstate(int answerstate) {
         this.answerstate = answerstate;
     }
     public int getAnswerstate() {
         return answerstate;
     }

    public void setFdid(int fdid) {
         this.fdid = fdid;
     }
     public int getFdid() {
         return fdid;
     }

    public void setAttachment(int attachment) {
         this.attachment = attachment;
     }
     public int getAttachment() {
         return attachment;
     }

    public void setLastupdate(int lastupdate) {
         this.lastupdate = lastupdate;
     }
     public int getLastupdate() {
         return lastupdate;
     }

    public void setAsorder(int asorder) {
         this.asorder = asorder;
     }
     public int getAsorder() {
         return asorder;
     }

    public void setRecommend(int recommend) {
         this.recommend = recommend;
     }
     public int getRecommend() {
         return recommend;
     }

    public void setRefusedreason(String refusedreason) {
         this.refusedreason = refusedreason;
     }
     public String getRefusedreason() {
         return refusedreason;
     }

    public void setAuditor(String auditor) {
         this.auditor = auditor;
     }
     public String getAuditor() {
         return auditor;
     }

    public void setAudittel(String audittel) {
         this.audittel = audittel;
     }
     public String getAudittel() {
         return audittel;
     }

    public void setAuditclass(String auditclass) {
         this.auditclass = auditclass;
     }
     public String getAuditclass() {
         return auditclass;
     }

    public void setOperat(String operat) {
         this.operat = operat;
     }
     public String getOperat() {
         return operat;
     }

    public void setOperatortel(String operatortel) {
         this.operatortel = operatortel;
     }
     public String getOperatortel() {
         return operatortel;
     }

    public void setOperatprocess(String operatprocess) {
         this.operatprocess = operatprocess;
     }
     public String getOperatprocess() {
         return operatprocess;
     }

    public void setOperatorsituation(String operatorsituation) {
         this.operatorsituation = operatorsituation;
     }
     public String getOperatorsituation() {
         return operatorsituation;
     }

    public void setForumname(String forumname) {
         this.forumname = forumname;
     }
     public String getForumname() {
         return forumname;
     }

    public void setForumpath(String forumpath) {
         this.forumpath = forumpath;
     }
     public String getForumpath() {
         return forumpath;
     }

    public void setThreads(String threads) {
         this.threads = threads;
     }
     public String getThreads() {
         return threads;
     }

    public void setGroupname(String groupname) {
         this.groupname = groupname;
     }
     public String getGroupname() {
         return groupname;
     }

    public void setAttachmentlist(String attachmentlist) {
         this.attachmentlist = attachmentlist;
     }
     public String getAttachmentlist() {
         return attachmentlist;
     }

}