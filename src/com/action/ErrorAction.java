package com.action;

import com.opensymphony.xwork2.ActionSupport;

public class ErrorAction extends ActionSupport {
	private String errMsg;
	
	@Override
	public String execute() throws Exception {
		//this.errMsg = "This is my custom error page";
		return SUCCESS;
	}
	
	public String getErrMsg() {
		return this.errMsg;
	}
	
	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}
}
