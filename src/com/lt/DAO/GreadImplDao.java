package com.lt.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.lt.bean.Course;
import com.lt.bean.Student;
import com.lt.bean.User;
import com.lt.utils.DBUtils;

public class GreadImplDao implements GreadInterface{

	static String GREAD_UPLOAD=null;
	@Override
	public List<Course> displayGrades(Student student) {
		
		return null;
	}

	@Override
	public void uploadGrades(int studentId, int courseId, String grade) {
		
		Connection connection = DBUtils.getConnection();
		PreparedStatement stmt= null;
		 GREAD_UPLOAD="INSERT INTO GRADE VALUES (?,?,?)";
		try {
           
			//Declaring prepared statement
			stmt=connection.prepareStatement(GREAD_UPLOAD);
			stmt.setInt(1, studentId);
			stmt.setInt(2,courseId);
			stmt.setString(3, grade);
			ResultSet rs = stmt.executeQuery();
			

			if(rs.next() )
			{
				System.out.println("Grade inserted");
				
			}

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
//		
		
	}

}
