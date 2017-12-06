package com.action;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.bean.Customer;
import com.bean.CustomerAdmin;
import com.bean.CustomerMessage;
import com.bean.CustomerUser;
import com.opensymphony.xwork2.ActionSupport;

public class CustomerAction extends ActionSupport {
	public String execute() {

		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml")
				.build();
		SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();

		Session session = sessionFactory.openSession();
		Transaction t = session.beginTransaction();

		Customer c1 = new Customer();
		c1.setName("测试用户1");
		
		ArrayList<CustomerMessage> list = new ArrayList<CustomerMessage>();
		
		CustomerMessage msg = new CustomerMessage();
		msg.setMsg("消息1");
		list.add(msg);
		msg = new CustomerMessage();
		msg.setMsg("消息2");
		list.add(msg);
		
		c1.setMessage(list);
		

//		CustomerAdmin c2 = new CustomerAdmin();
//		c2.setPermission("管理员");
//		c2.setRole(1);
//
//		CustomerUser c3 = new CustomerUser();
//		c3.setEmail("11@11.com");
//		c3.setPhone("13111111111");

		session.persist(c1);
//		session.persist(c2);
//		session.persist(c3);

		t.commit();
		session.close();
		System.out.println("success");

		return SUCCESS;
	}
}
