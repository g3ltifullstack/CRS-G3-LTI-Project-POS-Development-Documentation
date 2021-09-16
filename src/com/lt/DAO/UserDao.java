package com.lt.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


import com.lt.bean.Professor;
import com.lt.bean.User;
import com.lt.utils.DBUtils;

public class UserDao  implements UserDaoInterface {
 
	@Override
	public User validateUser(int userid, String pass) {
		Connection connection = DBUtils.getConnection();
		PreparedStatement stmt= null;
		final String VALIDATE_USER="SELECT UserID, RollID FROM crsuser WHERE userid=? AND userpassword=?";
		try {
           
			//Declaring prepared statement
			stmt=connection.prepareStatement(VALIDATE_USER);
			stmt.setInt(1, userid);
			stmt.setString(2,pass);
			ResultSet rs = stmt.executeQuery();
			

			if(rs.next() )
			{
				System.out.println("resultset getting data");
				User checkeduser = new User();
				checkeduser.setUserId( rs.getInt("UserID") );
				checkeduser.setRoleId(rs.getInt("RollID"));

				return checkeduser;
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
