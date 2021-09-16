package com.lt.business;


import java.util.List;

import com.lt.DAO.GreadImplDao;
import com.lt.DAO.GreadInterface;
import com.lt.bean.Course;
import com.lt.bean.Student;


public class GradesImplService  implements GradesInterface {

	
	private int courseId;
	private String courseName;
	private String courseDescription;
	private double courseFee; 
	private long professorId;
	private long noOfStudent; 
	GreadInterface gradeDao= new GreadImplDao();
	@Override
	public void displayGrades(Student student) {
		System.out.println("***********************************REPORT CARD******************************");	
		System.out.println("COURSE ID                    GRADE");
		List<Course> courses = gradeDao.displayGrades(student);

		courses.forEach(course -> System.out.println(course.getCourseId()+"        "+course.getCourseName()));

		
	}
 
	@Override
	public void uploadGrades(int studentId, int courseId, String grade) {
		gradeDao.uploadGrades(studentId, courseId, grade);

		
	}

	
	

}
