package com.manytoone;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Student {
	
	@Id
	int Rno;
	String Name;
	
	
	 @OneToMany(mappedBy = "Sid")  // mappedBy indicates the inverse side (Projects class)
	    List<Projects> Project;
	public int getRno() {
		return Rno;
	}
	public void setRno(int rno) {
		Rno = rno;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public List<Projects> getProject() {
		return Project;
	}
	public void setProject(List<Projects> project) {
		Project = project;
	}
	public Student(int rno, String name, List<Projects> project) {
		super();
		Rno = rno;
		Name = name;
		Project = project;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [Rno=" + Rno + ", Name=" + Name + ", Project=" + Project + "]";
	}
	
	
}
