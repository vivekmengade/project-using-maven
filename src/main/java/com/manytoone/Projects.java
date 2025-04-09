package com.manytoone;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Projects {
	
	@Id
	int Pid;
	String Name;
	
	
	@ManyToOne
    @JoinColumn(name = "student_id")  // Ensures that the foreign key is properly mapped
    Student Sid;
	public int getPid() {
		return Pid;
	}
	public void setPid(int pid) {
		Pid = pid;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Student getStudent() {
		return Sid;
	}
	public void setStudent(Student student) {
		Sid = student;
	}
	public Projects(int pid, String name, Student student) {
		super();
		Pid = pid;
		Name = name;
		Sid = student;
	}
	public Projects() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Projects [Pid=" + Pid + ", Name=" + Name + ", Student=" + Sid + "]";
	}
	
}
