package com.action;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.util.SubsetIteratorFilter.Decider;

import com.bean.Employee;
import com.opensymphony.xwork2.ActionSupport;

public class TagsAction extends ActionSupport {
	private String name;
	private List employees;

	public String execute() {
		this.name = "Mark";

		employees = new ArrayList();
		employees.add(new Employee("George", "Recruitment"));
		employees.add(new Employee("Danielle", "Accounts"));
		employees.add(new Employee("Melissa", "Melissa"));

		return SUCCESS;
	}

	public Decider getRecruitmentDecider() {
		return new Decider() {
			public boolean decide(Object element) throws Exception {
				Employee employee = (Employee) element;
				return employee.getDepartment().equals("Recruitment");
			}
		};
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List getEmployees() {
		return employees;
	}

	public void setEmployees(List employees) {
		this.employees = employees;
	}
}
