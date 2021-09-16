package com.lt.DAO;

import java.util.List;

import com.lt.bean.Course;
import com.lt.bean.Professor;
import com.lt.bean.Student;


public interface ProfessorDaoInterface {
	public List<Professor> professorDetails();

	public void selectCourse(int courseId ,Professor professor);
	public List<Course> displayProfessorCourses(Professor professor);
	public List<Student> displayRegistredStudent();
	
	

}
