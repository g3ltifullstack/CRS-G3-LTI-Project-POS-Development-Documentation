package com.lt.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;

import com.lt.bean.Professor;
import com.lt.bean.User;
import com.lt.constants.CommonData;
import com.lt.exception.UserNotFoundException;
import com.lt.utils.DBUtils;

public class UserDaoImpl  implements UserDaoInterface {
 
	private static Logger logger = Logger.getLogger(UserDaoImpl.class);
	@Override
	public User validateUser(String userid, String pass) {
		Connection connection = DBUtils.getConnection();
		PreparedStatement stmt= null;
		
		try {
           
			//Declaring prepared statement
			stmt=connection.prepareStatement(CommonData.VALIDATE_USER);
			stmt.setString(1, userid);
			stmt.setString(2,pass);
			ResultSet rs = stmt.executeQuery();
			
            try {
			if(rs.next() ) 
			{
				System.out.println("resultset getting data");
				User checkeduser = new User();
				checkeduser.setUserId( rs.getInt("UserID") );
				checkeduser.setRoleId(rs.getInt("RoleID"));

				return checkeduser;
			}
			else {
				 throw new  UserNotFoundException("user not found for -->"+userid);
			}
            }
			catch(UserNotFoundException ex) {
				logger.error(ex.getMessage());
			}
			

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
//		
		return null;
	}
	

	@Override
	public Professor fetchProfessor(int professorId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createProfessor(Professor professor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateProfessor(int professorId, Professor professor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Professor> displayProfessors() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public User signup(int professorId, String name, String department, String email, String gender,
			String password, String role) {
		// TODO Auto-generated method stub
		return null;
	}

}
