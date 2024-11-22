package com.hib.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="subject")
public class Subject {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="subId")
	private int subId;
	@Column(name="subName")
	private String subName;
	@Column(name="noOfHrs")
	private int noOfHrs;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="studentId")
	private Student student;
	
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Subject(int subId, String subName, int noOfHrs) {
		super();
		this.subId = subId;
		this.subName = subName;
		this.noOfHrs = noOfHrs;
	}
	public Subject(String subName, int noOfHrs) {
		super();
		this.subName = subName;
		this.noOfHrs = noOfHrs;
	}
	public Subject() {
		super();
	}
	public int getSubId() {
		return subId;
	}
	public void setSubId(int subId) {
		this.subId = subId;
	}
	public String getSubName() {
		return subName;
	}
	public void setSubName(String subName) {
		this.subName = subName;
	}
	public int getNoOfHrs() {
		return noOfHrs;
	}
	public void setNoOfHrs(int noOfHrs) {
		this.noOfHrs = noOfHrs;
	}
	
	
	
}
