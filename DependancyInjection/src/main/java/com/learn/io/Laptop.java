package com.learn.io;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("lap1")
//@Qualifier("lap1")
public class Laptop {

	private int lid;
	private String Brand;
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", Brand=" + Brand + "]";
	}
	public void compile() {
		System.out.println("Compiling");
	}
	
	
}
