package com.learn.io.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Alien {
	@Id
	@GeneratedValue
	private int aid;
	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", aName=" + aName + ", tech=" + tech + "]";
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	private String aName;
	private String tech;
}
