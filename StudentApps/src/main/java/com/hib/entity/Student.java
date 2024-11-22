package com.hib.entity;



import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Student")

public class Student {
  	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="studentId")
	private int sid;
	@Column(name="studentName")
	private String sname;
	@Column(name="studentEmail")
	private String email;
	@Column(name="studentAddress")
	private String address;
	@Column(name="studentPincode")
    private int pincode;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="studentdetailsid")
	private StudentDetails studentDetails;
	
	
	
	public StudentDetails getStudentDetails() {
		return studentDetails;
	}
	public void setStudentDetails(StudentDetails studentDetails) {
		this.studentDetails = studentDetails;
	}
	
	@OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
	private List<Subject> subjects;
	

	public List<Subject> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public Student(int sid, String sname, String email, String address, int pincode) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.email = email;
		this.address = address;
		this.pincode = pincode;
		
	}
	public Student(String sname, String email, String address, int pincode) {
		super();
		this.sname = sname;
		this.email = email;
		this.address = address;
		this.pincode = pincode;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return sid + "    " + sname + "     " + email +"      "+  address 
				
	
			+"       " + pincode + "       "+ studentDetails;
	}
		
	
	
	
}
