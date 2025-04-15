package com.Quries;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int sid;
	String Sname;
	Double marks;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public Double getMarks() {
		return marks;
	}
	public void setMarks(Double marks) {
		this.marks = marks;
	}
	public Student(int sid, String sname, Double marks) {
		super();
		this.sid = sid;
		Sname = sname;
		this.marks = marks;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", Sname=" + Sname + ", marks=" + marks + "]";
	}
	
	
	
}
