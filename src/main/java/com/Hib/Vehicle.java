package com.Hib;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="Vehicle_info")
public class Vehicle {
	
	
	@Id
	@Column(name="V_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	
	
	@Column(name="V_Name")
	String name;
	
	@Column(name="V_Milage")
	int milage;
	
	@Column(name="V_Price")
	double price;
	
	
	@Transient
	int x;
	
	
	@Temporal(TemporalType.DATE)
	Date date;
	
	
	
	@Lob
	byte img[] ;



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getMilage() {
		return milage;
	}



	public void setMilage(int milage) {
		this.milage = milage;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public int getX() {
		return x;
	}



	public void setX(int x) {
		this.x = x;
	}



	public Date getDate() {
		return date;
	}



	public void setDate(Date date) {
		this.date = date;
	}



	public byte[] getImg() {
		return img;
	}



	public void setImg(byte[] img) {
		this.img = img;
	}



	public Vehicle(int id, String name, int milage, double price, int x, Date date, byte[] img) {
		super();
		this.id = id;
		this.name = name;
		this.milage = milage;
		this.price = price;
		this.x = x;
		this.date = date;
		this.img = img;
	}



	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}



	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", name=" + name + ", milage=" + milage + ", price=" + price + ", x=" + x
				+ ", date=" + date + ", img=" + Arrays.toString(img) + "]";
	}
	
	
	
	
	
}
