package com.Embadable2;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student2 {
	
	@Id
	@Column(name = "ID")
	private int id;
	
	@Column(name = "Student")		//name of column
	private String name;
	
	@Column(name = "Course")		//name of column
	Course2 cname;
	
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
	public Course2 getCname() {
		return cname;
	}
	public void setCname(Course2 cname) {
		this.cname = cname;
	}
	public Student2(int id, String name, Course2 cname) {
		super();
		this.id = id;
		this.name = name;
		this.cname = cname;
	}
	public Student2() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", cname=" + cname + "]";
	}
	
	
	
	
}
