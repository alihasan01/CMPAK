package com.employee.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

public class Employee {

	private String ID;
	private String name;
	private String designation;
	private String age;
	
	
	public String getName() {
		return name;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	
}
