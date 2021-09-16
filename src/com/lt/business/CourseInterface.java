package com.lt.business;

import com.lt.bean.Course;
import com.lt.bean.Student;


public interface CourseInterface {
	
	public void displayCourses(Student student);
	public void insertCourse(Course course) ;
	public void deleteCourse(int courseId);
	public void displayCoursesProfessor();
}
