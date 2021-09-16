package com.lt.DAO;

import java.util.List;

import com.lt.bean.Course;
import com.lt.bean.Student;

public class CourseDao implements CourseDaoInterface {
	
	private int courseId;
	private String courseName;
	private String courseDescription;
	private double courseFee;
	private long professorId;
	private long noOfStudent;
	@Override
	public List<Course> displayCourses(Student student) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void insertCourse(Course course) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteCourse(int courseId) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<Course> displayCoursesProfessor() {
		// TODO Auto-generated method stub
		return null;
	}



}
