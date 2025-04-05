package com.onetoone.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {
	
	@Id
	int pincode;
	String area;
	String colony;
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getColony() {
		return colony;
	}
	public void setColony(String colony) {
		this.colony = colony;
	}
	public Address(int pincode, String area, String colony) {
		super();
		this.pincode = pincode;
		this.area = area;
		this.colony = colony;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Address [pincode=" + pincode + ", area=" + area + ", colony=" + colony + "]";
	}
	
}
