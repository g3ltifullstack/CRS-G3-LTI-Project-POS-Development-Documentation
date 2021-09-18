package com.lt.business;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.lt.DAO.ProfessorDaoImpl;
import com.lt.DAO.ProfessorDaoInterface;
import com.lt.DAO.StudentDAO;
import com.lt.bean.Professor;
import com.lt.bean.Student;

public class ProfessorImplService implements ProfessorInterface {
	private static Logger logger = Logger.getLogger(ProfessorImplService.class);

	StudentDAO stdao = new StudentDAO();
	Professor prof = new Professor();
	UserInterface user = new UserImplService();
	ProfessorDaoInterface professordao = new ProfessorDaoImpl();
	Scanner sc = new Scanner(System.in);

//calling dao method to display registred student
	@Override
	public void displayRegisteredStudent() {
		List<Student> student = new ArrayList<Student>();
		ProfessorDaoInterface professordao = new ProfessorDaoImpl();
		student = professordao.displayRegistredStudent();
		logger.info("below showing registred student details");
		for (Student students : student) {

			logger.info("student id-->" + students.getStudentId() + " student name-->" + students.getName()
					+ " gender-->" + students.getGender() + "semester-->" + students.getSemester() + " branch-->"
					+ students.getBranch() + " phonenumber-->" + students.getPhoneNumber());
		}

	}

	@Override
	public List<Professor> professorDetails(Professor professor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void displaySelectedCoursesProfessor(Professor professor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void studentByName() {
		List<Student> stdinfo = new ArrayList();
		ProfessorDaoInterface professordao = new ProfessorDaoImpl();
		logger.debug("enter name of student");
		String name = sc.next();

		logger.debug("calling studentByName for getting data of " + name);
		stdinfo = professordao.studentByName(name);
		for (Student students : stdinfo) {

			logger.info("student id-->" + students.getStudentId() + " student name-->" + students.getName()
					+ " gender-->" + students.getGender() + "semester-->" + students.getSemester() + " branch-->"
					+ students.getBranch() + " phonenumber-->" + students.getPhoneNumber());
		}
	}

}
