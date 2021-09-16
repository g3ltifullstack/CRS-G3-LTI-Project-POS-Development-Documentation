package com.lt.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.lt.bean.Course;
import com.lt.bean.Professor;
import com.lt.bean.Student;
import com.lt.bean.User;
import com.lt.constants.CommonData;
import com.lt.utils.DBUtils;

public class ProfessorDaoImpl implements ProfessorDaoInterface {
	
	Professor pfd=new Professor();
	


	public List<Professor> professorDetails() {
		return null;
		
		
	}

	@Override
	public void selectCourse(int courseId, Professor professor) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public List<Course> displayProfessorCourses(Professor professor) {
		
		return null;
	}
	//"select studentid,studentname,gender,semester,branch,phonenumber from student";

	@Override
	public List<Student> displayRegistredStudent() {
		Connection connection = DBUtils.getConnection();
		PreparedStatement stmt= null;
		List <Student> liststd=new ArrayList<Student>();
		 int countdata=0;
		try {
			
          
			//Declaring prepared statement
			stmt=connection.prepareStatement(CommonData.SELECT_STUDENT_PROF);
			
			
			ResultSet rs = stmt.executeQuery();
		
			while(rs.next()) {
				 
				Student student =new Student();
			    student.setStudentId( rs.getInt("studentid"));
				student.setName( rs.getString("studentname"));
				student.setGender( rs.getString("gender"));
				student.setSemester( rs.getInt("semester"));
				student.setBranch( rs.getString("branch"));
				student.setPhoneNumber( rs.getString("phonenumber"));
				liststd.add(student);
			
			
			}
			 System.out.println("data fetched");
			
			//return liststd;}
			

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
//		
		
		return liststd;
	}



	
}
