/**
  * Copyright 2018 aTool.org 
  */
package com.geostar.wuhancitymsgboard.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.codehaus.jackson.annotate.JsonProperty;

@Entity
public class Threads {

	@Id
	private int tid;
	private int fid;
	@JsonProperty("typeId")
	private int typeid;
	@JsonProperty("domainId")
	private int domainid;
	@JsonProperty("topicId")
	private int topicid;
	@JsonProperty("nickName")
	private String nickname;
	@JsonProperty("userId")
	private int userid;
	private String subject;
	private String content;
	@JsonProperty("anonymousCode")
	private String anonymouscode;
	private int dateline;
	private String ip;
	@JsonProperty("viewsNum")
	private int viewsnum;
	@JsonProperty("favNum")
	private int favnum;
	@JsonProperty("threadState")
	private int threadstate;
	@JsonProperty("checkNum")
	private int checknum;
	private int attachment;
	@JsonProperty("processState")
	private int processstate;
	@JsonProperty("handleState")
	private int handlestate;
	@JsonProperty("traceState")
	private int tracestate;
	@JsonProperty("markState")
	private int markstate;
	private int source;
	private String mobile;
	@JsonProperty("leaderAnswer")
	private int leaderanswer;
	private int satisfaction;
	private int lastupdate;
	@JsonProperty("lastAnswerTime")
	private int lastanswertime;
	@JsonProperty("lastFeedbackTime")
	private String lastfeedbacktime;
	@JsonProperty("availableTime")
	private int availabletime;
	@JsonProperty("checkReason")
	private String checkreason;
	private String info;
	@JsonProperty("deleteInfo")
	private String deleteinfo;
	@JsonProperty("fdFailCount")
	private int fdfailcount;
	private int recommend;
	@JsonProperty("reportState")
	private int reportstate;
	@JsonProperty("ansCheckState")
	private int anscheckstate;
	@JsonProperty("forumName")
	private String forumname;
	@JsonProperty("forumPath")
	private String forumpath;
	@JsonProperty("typeName")
	private String typename;
	@JsonProperty("domainName")
	private String domainname;
	@JsonProperty("sourceName")
	private String sourcename;
	@JsonProperty("topicName")
	private String topicname;
	@JsonProperty("attachmentList")
	private String attachmentlist;
	@JsonProperty("reviewGetTime")
	private String reviewgettime;
	private int lastcheck;
	@JsonProperty("timelyAnswered")
	private int timelyanswered;
	@JsonProperty("caseNum")
	private String casenum;
	private String jd;
	private String wd;
	@JsonProperty("postCode")
	private String postcode;
	@JsonProperty("streetCode")
	private String streetcode;
	@JsonProperty("courtCode")
	private String courtcode;
	private int overt;
	private String gids;
	@JsonProperty("hiddenInfo")
	private String hiddeninfo;
	@JsonProperty("logInfo")
	private String loginfo;
	private String preview;

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

	public void setTypeid(int typeid) {
		this.typeid = typeid;
	}

	public int getTypeid() {
		return typeid;
	}

	public void setDomainid(int domainid) {
		this.domainid = domainid;
	}

	public int getDomainid() {
		return domainid;
	}

	public void setTopicid(int topicid) {
		this.topicid = topicid;
	}

	public int getTopicid() {
		return topicid;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getNickname() {
		return nickname;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public int getUserid() {
		return userid;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getContent() {
		return content;
	}

	public void setAnonymouscode(String anonymouscode) {
		this.anonymouscode = anonymouscode;
	}

	public String getAnonymouscode() {
		return anonymouscode;
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

	public void setViewsnum(int viewsnum) {
		this.viewsnum = viewsnum;
	}

	public int getViewsnum() {
		return viewsnum;
	}

	public void setFavnum(int favnum) {
		this.favnum = favnum;
	}

	public int getFavnum() {
		return favnum;
	}

	public void setThreadstate(int threadstate) {
		this.threadstate = threadstate;
	}

	public int getThreadstate() {
		return threadstate;
	}

	public void setChecknum(int checknum) {
		this.checknum = checknum;
	}

	public int getChecknum() {
		return checknum;
	}

	public void setAttachment(int attachment) {
		this.attachment = attachment;
	}

	public int getAttachment() {
		return attachment;
	}

	public void setProcessstate(int processstate) {
		this.processstate = processstate;
	}

	public int getProcessstate() {
		return processstate;
	}

	public void setHandlestate(int handlestate) {
		this.handlestate = handlestate;
	}

	public int getHandlestate() {
		return handlestate;
	}

	public void setTracestate(int tracestate) {
		this.tracestate = tracestate;
	}

	public int getTracestate() {
		return tracestate;
	}

	public void setMarkstate(int markstate) {
		this.markstate = markstate;
	}

	public int getMarkstate() {
		return markstate;
	}

	public void setSource(int source) {
		this.source = source;
	}

	public int getSource() {
		return source;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getMobile() {
		return mobile;
	}

	public void setLeaderanswer(int leaderanswer) {
		this.leaderanswer = leaderanswer;
	}

	public int getLeaderanswer() {
		return leaderanswer;
	}

	public void setSatisfaction(int satisfaction) {
		this.satisfaction = satisfaction;
	}

	public int getSatisfaction() {
		return satisfaction;
	}

	public void setLastupdate(int lastupdate) {
		this.lastupdate = lastupdate;
	}

	public int getLastupdate() {
		return lastupdate;
	}

	public void setLastanswertime(int lastanswertime) {
		this.lastanswertime = lastanswertime;
	}

	public int getLastanswertime() {
		return lastanswertime;
	}

	public void setLastfeedbacktime(String lastfeedbacktime) {
		this.lastfeedbacktime = lastfeedbacktime;
	}

	public String getLastfeedbacktime() {
		return lastfeedbacktime;
	}

	public void setAvailabletime(int availabletime) {
		this.availabletime = availabletime;
	}

	public int getAvailabletime() {
		return availabletime;
	}

	public void setCheckreason(String checkreason) {
		this.checkreason = checkreason;
	}

	public String getCheckreason() {
		return checkreason;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getInfo() {
		return info;
	}

	public void setDeleteinfo(String deleteinfo) {
		this.deleteinfo = deleteinfo;
	}

	public String getDeleteinfo() {
		return deleteinfo;
	}

	public void setFdfailcount(int fdfailcount) {
		this.fdfailcount = fdfailcount;
	}

	public int getFdfailcount() {
		return fdfailcount;
	}

	public void setRecommend(int recommend) {
		this.recommend = recommend;
	}

	public int getRecommend() {
		return recommend;
	}

	public void setReportstate(int reportstate) {
		this.reportstate = reportstate;
	}

	public int getReportstate() {
		return reportstate;
	}

	public void setAnscheckstate(int anscheckstate) {
		this.anscheckstate = anscheckstate;
	}

	public int getAnscheckstate() {
		return anscheckstate;
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

	public void setTypename(String typename) {
		this.typename = typename;
	}

	public String getTypename() {
		return typename;
	}

	public void setDomainname(String domainname) {
		this.domainname = domainname;
	}

	public String getDomainname() {
		return domainname;
	}

	public void setSourcename(String sourcename) {
		this.sourcename = sourcename;
	}

	public String getSourcename() {
		return sourcename;
	}

	public void setTopicname(String topicname) {
		this.topicname = topicname;
	}

	public String getTopicname() {
		return topicname;
	}

	public void setAttachmentlist(String attachmentlist) {
		this.attachmentlist = attachmentlist;
	}

	public String getAttachmentlist() {
		return attachmentlist;
	}

	public void setReviewgettime(String reviewgettime) {
		this.reviewgettime = reviewgettime;
	}

	public String getReviewgettime() {
		return reviewgettime;
	}

	public void setLastcheck(int lastcheck) {
		this.lastcheck = lastcheck;
	}

	public int getLastcheck() {
		return lastcheck;
	}

	public void setTimelyanswered(int timelyanswered) {
		this.timelyanswered = timelyanswered;
	}

	public int getTimelyanswered() {
		return timelyanswered;
	}

	public void setCasenum(String casenum) {
		this.casenum = casenum;
	}

	public String getCasenum() {
		return casenum;
	}

	public void setJd(String jd) {
		this.jd = jd;
	}

	public String getJd() {
		return jd;
	}

	public void setWd(String wd) {
		this.wd = wd;
	}

	public String getWd() {
		return wd;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setStreetcode(String streetcode) {
		this.streetcode = streetcode;
	}

	public String getStreetcode() {
		return streetcode;
	}

	public void setCourtcode(String courtcode) {
		this.courtcode = courtcode;
	}

	public String getCourtcode() {
		return courtcode;
	}

	public void setOvert(int overt) {
		this.overt = overt;
	}

	public int getOvert() {
		return overt;
	}

	public void setGids(String gids) {
		this.gids = gids;
	}

	public String getGids() {
		return gids;
	}

	public void setHiddeninfo(String hiddeninfo) {
		this.hiddeninfo = hiddeninfo;
	}

	public String getHiddeninfo() {
		return hiddeninfo;
	}

	public void setLoginfo(String loginfo) {
		this.loginfo = loginfo;
	}

	public String getLoginfo() {
		return loginfo;
	}

	public void setPreview(String preview) {
		this.preview = preview;
	}

	public String getPreview() {
		return preview;
	}

	@Override
	public int hashCode() {
		return String.valueOf(this.getTid()).hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return this.getTid() == (((Threads) obj).getTid());
	}

}