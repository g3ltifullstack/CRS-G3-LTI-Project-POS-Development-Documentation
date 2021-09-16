package com.lt.DAO;

import java.util.List;

import com.lt.bean.Course;
import com.lt.bean.Professor;


public interface ProfessorDaoInterface {
	public List<Professor> professorDetails();
	public boolean validateLogin(int userId,String pass) ;
	public void selectCourse(int courseId ,Professor professor);
	public List<Course> displaySelectedCoursesProfessor(Professor professor);
	
	

}
