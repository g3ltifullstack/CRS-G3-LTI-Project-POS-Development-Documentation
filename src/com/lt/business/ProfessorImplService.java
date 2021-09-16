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
	
	
	
	

	@Override
	public List<Student> displayRegisteredStudent() {
		List<Student> list=new ArrayList<Student>();
		ProfessorDaoInterface professordao=new ProfessorDaoImpl();
		list=professordao.displayRegistredStudent();
		for (Student student : list) {
			
		System.out.println(list);
		}
		return  list;
		
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

	



	

