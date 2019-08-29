package com.learn.io.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {
	public int id;
	public String eName;
	public String tech;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String eName, String tech) {
		super();
		this.eName = eName;
		this.tech = tech;
	}

	public Employee(int id, String eName, String tech) {
		super();
		this.id = id;
		this.eName = eName;
		this.tech = tech;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", eName=" + eName + ", tech=" + tech + "]";
	}
	
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	
	
}
