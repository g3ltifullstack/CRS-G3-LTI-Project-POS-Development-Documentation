package com.lt.business;

import java.util.List;

import com.lt.DAO.ProfessorDao;
import com.lt.DAO.StudentDAO;
import com.lt.bean.Professor;
import com.lt.bean.Student;



public  class ProfessorImplService implements ProfessorInterface {

	StudentDAO stdao=new StudentDAO();
	Professor prof =new Professor(); 
	UserInterface user=new UserImplService();
	ProfessorDao professordao=new ProfessorDao();
	
	@Override
	public void provideGrade(int studentid, Student student) {
		// TODO Auto-generated method stub 
		
	}

	
	

	@Override
	public List<Student> displayRegisteredStudent() {
		System.out.println("list of student");
		return stdao.studentDetails;
		
	}

	@Override
	public void selectCourse(int courseId, Professor professor) {
		// TODO Auto-generated method stub
		
	} 

	
	@Override
	public void displaySelectedCoursesProfessor(Professor professor) {
		// TODO Auto-generated method stub
		
	}

	
		
		
	}

	



	

