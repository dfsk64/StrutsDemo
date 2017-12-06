package com.bean;

import java.util.List;

public class Customer {
	private String id;
	private String name;
	private List<CustomerMessage> message;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public List<CustomerMessage> getMessage(){
		return message;
	}
	
	public void setMessage(List<CustomerMessage> message) {
		this.message = message;
	}
}
