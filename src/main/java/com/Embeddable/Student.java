package com.Embeddable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String Name;
	private Course Course;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Course getCourse() {
		return Course;
	}
	public void setCourse(Course course) {
		Course = course;
	}
	public Student(int id, String name, com.Embeddable.Course course) {
		super();
		this.id = id;
		Name = name;
		Course = course;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", Name=" + Name + ", Course=" + Course + "]";
	}
	
	
}
