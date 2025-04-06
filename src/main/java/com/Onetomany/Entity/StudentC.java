package com.Onetomany.Entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class StudentC {
	
	
	@Id
	int id;
	String Name;
	
	@ManyToOne
	List<Coursec> course;
	
	
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
	public List<Coursec> getCourse() {
		return course;
	}
	public void setCourse(List<Coursec> course) {
		this.course = course;
	}
	public StudentC(int id, String name, List<Coursec> course) {
		super();
		this.id = id;
		Name = name;
		this.course = course;
	}
	public StudentC() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "StudentC [id=" + id + ", Name=" + Name + ", course=" + course + "]";
	}
	
}
