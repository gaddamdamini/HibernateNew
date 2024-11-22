package com.hib.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hib.DaoImp.HibernateDaoImp;
import com.hib.entity.Student;
import com.hib.entity.StudentDetails;
import com.hib.entity.Subject;

public class Main {
private static HibernateDaoImp hdao;

public static void main(String[] args) 
{
	 
	
	
Student stu= new Student("usha","usha@gmail.com","ATP",516767);
	           
	hdao = new HibernateDaoImp(); 
	
	Subject sb1 = new Subject("HTML", 10);
	Subject sb2 = new Subject("CSS", 20);
	Subject sb3 = new Subject("JAVASCRIPT", 30);
	Subject sb4 = new Subject("HIBERNATE", 40);
	Subject sb5 = new Subject("SPRING", 50);
	
	List<Subject> set1 = new ArrayList<Subject>();
	set1.add(sb1);
	set1.add(sb2);
	set1.add(sb3);
	
	List<Subject> set2 = new ArrayList<Subject>();
	set2.add(sb3);
	set2.add(sb4);
	set2.add(sb5);
	
	Student sd=new Student("Madhu","madu@gmail.com","ballari",5677787);
	
	StudentDetails sds=new StudentDetails("98767656657","kolkata","WestBengal");
	
	sd.setStudentDetails(sds);
	sds.setStudent(sd);
	sd.setSubjects(set1);
	sb1.setStudent(sd);
	sb2.setStudent(sd);
	sb3.setStudent(sd);
	
//    Student sd1=new Student("Madhu","madu@gmail.com","Ballari",6788787);
//	
//	StudentDetails sds1=new StudentDetails("98765456779","Beemavrama","Tamilnadu");
//	
//	sd1.setStudentDetails(sds1);
//	sds1.setStudent(sd1);
//	sd1.setSubjects(set2);
//	sb3.setStudent(sd1);
//	sb4.setStudent(sd1);
//	sb5.setStudent(sd1);
	
	
//	hdao.insertStudent(sd1);
	
	
	hdao.insertStudent(sd);
	System.out.println("Success");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	ArrayList<Student> sList = hdao.fetchAll();
//	
//	Iterator itr = sList.iterator();
//	
//	while(itr.hasNext())
//		{
//		 Student s = (Student) itr.next();
//		 
//		 System.out.println(s);
//		 System.out.println("Id : " +s.getSid());
//		 System.out.println("Name : " +s.getSname());
//		 System.out.println("Email : " +s.getEmail());
//		 System.out.println("Address : " +s.getAddress());
//		 System.out.println("Pincode : " +s.getPincode());
//		 
//		 StudentDetails sd = s.getStudentDetails();
//		 
//		 System.out.println("SDID : " +sd.getSdid());
//		 System.out.println("Mobile : " +sd.getMobile());
//		 System.out.println("City : " +sd.getCity());
//		 System.out.println("State : " +sd.getState());
		 
		}
	

//	

//	hdao.updateStudent("vani@gmail.com",2);
	
//	hdao.delete(52);
	
	
//	System.out.println(hdao.fetchOne(2));
//	ArrayList<Student> sList=hdao.fetchAll();
//	
//	for(Student s:sList)
//	{
//		System.out.println(s);
//	}
	
//	 hdao.insertStudent(stu);          
//hdao.updateStudentWithSD("Asuku@yahoo.com","pune",102);	           
	
}
	
