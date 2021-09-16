package com.lt.DAO;

import java.util.List;

import com.lt.bean.Professor;
import com.lt.bean.User;



public interface UserDaoInterface {

	public User validateUser(int userid, String pass);
	
	 public Professor fetchProfessor(int professorId);
	
	 public void createProfessor(Professor professor);
	 
	  public void updateProfessor(int professorId, Professor professor) ;
	  public User signup(int professorId,String name,String department,String email,String gender,String password,String role); //created
		
	  
	 
	  public List<Professor> displayProfessors();
	 
}
