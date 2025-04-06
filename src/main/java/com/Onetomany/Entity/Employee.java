package com.Onetomany.Entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Employee {
	
	@Id
	int Eid;
	String EName;
	
	@OneToMany
	List<Project> Project;

	public int getEid() {
		return Eid;
	}

	public void setEid(int eid) {
		Eid = eid;
	}

	public String getEName() {
		return EName;
	}

	public void setEName(String eName) {
		EName = eName;
	}

	public List<Project> getProject() {
		return Project;
	}

	public void setProject(List<Project> project) {
		Project = project;
	}

	public Employee(int eid, String eName, List<com.Onetomany.Entity.Project> project) {
		super();
		Eid = eid;
		EName = eName;
		Project = project;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [Eid=" + Eid + ", EName=" + EName + ", Project=" + Project + "]";
	}
	
	
}
