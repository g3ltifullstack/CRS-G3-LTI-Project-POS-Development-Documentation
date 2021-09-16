package com.lt.business;



import com.lt.bean.Admin;
import com.lt.bean.Professor;
import com.lt.bean.Student;
import com.lt.bean.User;

public interface UserInterface {
	public User manageUser(String username, String password);

	public Student fetchStudent(int studentId);
	public User validateUser(int userid,String password);
	
	public Admin fetchAdmin(int adminId);

	public Professor fetchProfessor(int professorId);

	public void displayStudents();

	public void displayProfessors();
	
	public void updateProfessor();

	public void displayAdmins();


	public void signUp();

}
