package com.action;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.opensymphony.xwork2.ActionSupport;

public class HelloAction extends ActionSupport {
	private String message;

	@Override
	public String execute() throws Exception {
		Configuration cfg = new Configuration().configure();

		SessionFactory factory = cfg.buildSessionFactory();

		Session session = null;
		session = factory.openSession();
		session.beginTransaction();

		com.bean.User user = new com.bean.User();
		user.setUsername("hibernate");
		user.setPassword("123456");
		user.setCreateTime(new Date());
		user.setExpireTime(new Date());

		session.save(user);
		session.getTransaction().commit();
		session.close();

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
