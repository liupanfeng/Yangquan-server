package com.yangquan.server.bean;

import java.beans.Beans;
import java.util.Date;

public class TmiPushMessageVo {

	public TmiPushMessageVo(){

	}

	private long pushId=0l;
	private int pushType=0;
	private int contentType=0;
	private String content="";
	private long relatedId=0l;
	private String title="";
	private String targetId="";
	private Date initDate=new Date();
	private int result=0;

	public TmiPushMessageVo(Long _pushId){
		this.pushId=_pushId;
	}

	public TmiPushMessageVo(Long _pushId,Integer _pushType,Integer _contentType,String _content,Long _relatedId,String _title,String _targetId,Date _initDate,Integer _result){
		this.pushId=_pushId;
		this.pushType=_pushType;
		this.contentType=_contentType;
		this.content=_content;
		this.relatedId=_relatedId;
		this.title=_title;
		this.targetId=_targetId;
		this.initDate=_initDate;
		this.result=_result;
	}

	public long getPushId() {
		return pushId;
	}

	public void setPushId(long pushId) {
		this.pushId = pushId;
	}

	public int getPushType() {
		return pushType;
	}

	public void setPushType(int pushType) {
		this.pushType = pushType;
	}

	public int getContentType() {
		return contentType;
	}

	public void setContentType(int contentType) {
		this.contentType = contentType;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public long getRelatedId() {
		return relatedId;
	}

	public void setRelatedId(long relatedId) {
		this.relatedId = relatedId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTargetId() {
		return targetId;
	}

	public void setTargetId(String targetId) {
		this.targetId = targetId;
	}

	public Date getInitDate() {
		return initDate;
	}

	public void setInitDate(Date initDate) {
		this.initDate = initDate;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}





	
}
