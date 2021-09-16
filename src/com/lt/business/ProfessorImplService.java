package com.lt.business;

import java.util.ArrayList;
import java.util.List;


import com.lt.DAO.ProfessorDaoImpl;
import com.lt.DAO.ProfessorDaoInterface;
import com.lt.DAO.StudentDAO;
import com.lt.bean.Professor;
import com.lt.bean.Student;



public  class ProfessorImplService implements ProfessorInterface {

	StudentDAO stdao=new StudentDAO();
	Professor prof =new Professor(); 
	UserInterface user=new UserImplService();
	ProfessorDaoInterface professordao=new ProfessorDaoImpl();
	
	
	

//calling dao method to display registred student
	@Override
	public void displayRegisteredStudent() {
		List<Student> student=new ArrayList<Student>();
		ProfessorDaoInterface professordao=new ProfessorDaoImpl();
		student=professordao.displayRegistredStudent();
		for (Student students : student) {
			
		System.out.println("student id-->"+students.getStudentId()+" student name-->"+students.getName()+" gender-->"+students.getGender()+
				"semester-->"+students.getSemester()
				+ " branch-->"+students.getBranch()+" phonenumber-->"+students.getPhoneNumber() );
		}
		
		
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

	



	

