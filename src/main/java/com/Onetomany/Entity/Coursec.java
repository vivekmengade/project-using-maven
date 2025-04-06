package com.Onetomany.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Coursec {
	
	@Id
	int Cno;
	
	String course;
	double fees;
	
	@OneToMany
	StudentC S_Id;

	public int getCno() {
		return Cno;
	}

	public void setCno(int cno) {
		Cno = cno;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public StudentC getS_Id() {
		return S_Id;
	}

	public void setS_Id(StudentC s_Id) {
		S_Id = s_Id;
	}

	public Coursec(int cno, String course, double fees, StudentC s_Id) {
		super();
		Cno = cno;
		this.course = course;
		this.fees = fees;
		S_Id = s_Id;
	}

	public Coursec() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Coursec [Cno=" + Cno + ", course=" + course + ", fees=" + fees + ", S_Id=" + S_Id + "]";
	}
	
}
