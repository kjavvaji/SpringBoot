package com.learn.io.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Alien {
    @Id
	private int aid;
	private String aName;
	private String tech;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}
	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", aName=" + aName + ", tech=" + tech + "]";
	}
	
	 
}
