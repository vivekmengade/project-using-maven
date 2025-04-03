package com.Embadable2;

import javax.persistence.Embeddable;

@Embeddable
public class Course2 {

	
	int No;
	String CName;
	public int getNo() {
		return No;
	}
	public void setNo(int no) {
		No = no;
	}
	public String getCName() {
		return CName;
	}
	public void setCName(String cName) {
		CName = cName;
	}
	public Course2(int no, String cName) {
		super();
		No = no;
		CName = cName;
	}
	public Course2() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Course2 [No=" + No + ", CName=" + CName + "]";
	}
	
	
}
