package com.Embeddable;

import javax.persistence.Embeddable;

@Embeddable
public class Course {

	
	private String cname;
	private double price;
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Course(String cname, double price) {
		super();
		this.cname = cname;
		this.price = price;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Course [cname=" + cname + ", price=" + price + "]";
	}
	
	
}
