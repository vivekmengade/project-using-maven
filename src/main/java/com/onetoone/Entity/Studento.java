package com.onetoone.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Studento {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sid;
	private String name;
	@OneToOne
	private Address add;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	public Studento(int sid, String name, Address add) {
		super();
		this.sid = sid;
		this.name = name;
		this.add = add;
	}
	public Studento() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", add=" + add + "]";
	}
	
}
