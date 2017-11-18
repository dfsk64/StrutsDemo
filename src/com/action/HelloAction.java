package com.action;

import com.opensymphony.xwork2.ActionSupport;

public class HelloAction extends ActionSupport {
	private String message;
	
	@Override
	public String execute() throws Exception {
		this.message = "struts2";
		return SUCCESS;
	}
	
	public String getMessage()
	{
		return message;
	}
	
	public void SetMessage(String message)
	{
		this.message = message;
	}
	
}
