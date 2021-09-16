package com.lt.DAO;

import java.util.ArrayList;
import java.util.List;

import com.lt.bean.Course;
import com.lt.bean.Professor;
import com.lt.bean.Student;

public class ProfessorDao implements ProfessorDaoInterface {
	
	Professor pfd=new Professor();
	
	public  List<Professor> professorDetails = new ArrayList<>();
	 {
		professorDetails.add(new Professor(101, "Akhilesh", "CSE", "akhilesh@gmail.com", "M", "proff", "professor"));
		professorDetails.add(new Professor(102, "Srinivash", "CSE", "srinivas@gmail.com", "M", "proff", "professor"));
		professorDetails.add(new Professor(103, "professor", "CSE", "professor@gmail.com", "M", "proff", "professor"));
		
	}
	 
	

	public List<Professor> signUp(Professor professor) {
		professorDetails.add(professor);
		System.out.println(professorDetails);
		return professorDetails; 

	}
	
	

	public List<Professor> professorDetails() {
		System.out.println("going in professor details");
		System.out.println(professorDetails);
		System.out.println(pfd.getDepartment()+"department showing ");
		return professorDetails;
		
	}
	
	public boolean validateLogin(int id,String pass) {
		for (Professor professor : professorDetails) {
			
		if(id==professor.getProfessorId()) {
		return true;
		}
		}
		return false;
	
	}



	@Override
	public void selectCourse(int courseId, Professor professor) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public List<Course> displaySelectedCoursesProfessor(Professor professor) {
		// TODO Auto-generated method stub
		return null;
	}



	
}
