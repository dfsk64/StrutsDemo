package com.action;

import com.opensymphony.xwork2.ActionSupport;

public class HelloAction extends ActionSupport {
	private String message;

	@Override
	public String execute() throws Exception {
		if ("SECRET".equals(message)) {
			return SUCCESS;
		}
		return ERROR;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
