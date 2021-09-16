package com.lt.DAO;

import java.util.ArrayList;
import java.util.List;

import com.lt.bean.Student;

public class StudentDAO {
	public static List<Student> studentDetails = new ArrayList<>();
	
	public List<Student> signUpStudent(Student student) {
		studentDetails.add(student);
		System.out.println(studentDetails);
		return studentDetails;

	}
	
	public void studentDetails() {
		System.out.println("going in professor details");
		System.out.println(studentDetails);
		
	}
	
	

}
