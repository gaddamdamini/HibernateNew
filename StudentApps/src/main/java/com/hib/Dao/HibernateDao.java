package com.hib.Dao;

import java.util.ArrayList;

import com.hib.entity.Student;

public interface HibernateDao 
{

	void insertStudent(Student s);
	
	void fetchAll1();
	ArrayList<Student> fetchAll();
	Student fetchOne(int sid);
	public void delete(int i);
	public void updateStudent(String string, int i);
}
