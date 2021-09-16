package com.lt.DAO;

import java.util.List;

import com.lt.bean.Course;
import com.lt.bean.Student;

public interface CourseDaoInterface {
	
	public List<Course> displayCourses(Student student);
	public void insertCourse(Course course) ;
	public void deleteCourse(int courseId) ;
	public List<Course> displayCoursesProfessor();
}
