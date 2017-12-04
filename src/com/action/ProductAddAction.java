package com.action;

import java.math.BigDecimal;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.bean.Product;
import com.dao.ProductDao;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class ProductAddAction extends ActionSupport implements ModelDriven<Product> {
	private Product product;

	public String execute() {
		if (product == null) {
			System.out.println("product is null");
			return ERROR;
		}
		if (product.getName().equals("") || product.getPrice().compareTo(new BigDecimal(0)) <= 0) {
			System.out.println("name or price error");
			return ERROR;
		}
		ProductDao.save(product);

		return SUCCESS;
	}
    
    @Override
    public Product getModel() {
       if(product == null){
    	   product = new Product();
       }
       return product;
    }
}
