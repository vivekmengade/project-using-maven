package com.Onetomany.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Project {
	@Id
	int Pid;
	String Pname;
	
	@ManyToOne
	Employee EId;


	public int getPid() {
		return Pid;
	}


	public void setPid(int pid) {
		Pid = pid;
	}


	public String getPname() {
		return Pname;
	}


	public void setPname(String pname) {
		Pname = pname;
	}


	public Employee getEId() {
		return EId;
	}


	public void setEId(Employee eId) {
		EId = eId;
	}


	public Project(int pid, String pname, Employee eId) {
		super();
		Pid = pid;
		Pname = pname;
		EId = eId;
	}


	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Project [Pid=" + Pid + ", Pname=" + Pname + ", EId=" + EId + "]";
	}
	
}
