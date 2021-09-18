package com.lt.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;

import com.lt.bean.Course;
import com.lt.bean.Student;
import com.lt.bean.User;
import com.lt.business.ProfessorImplService;
import com.lt.constants.CommonData;
import com.lt.exception.ParentKeyNotFoundException;
import com.lt.exception.StudentNotFoundException;
import com.lt.utils.DBUtils;

public class GreadImplDao implements GreadInterface {
	private static Logger logger = Logger.getLogger(GreadImplDao.class);

	@Override
	public List<Course> displayGrades(Student student) {

		return null;
	}

	@Override
	public void uploadGrades(int studentId, int courseId, String grade) {

		Connection connection = DBUtils.getConnection();
		PreparedStatement stmt = null;
		// GREAD_UPLOAD="INSERT INTO GRADE VALUES (?,?,?)";
		try {

			// Declaring prepared statement
			stmt = connection.prepareStatement(CommonData.GREAD_UPLOAD);
			stmt.setInt(1, courseId);
			stmt.setInt(2, studentId);
			stmt.setString(3, grade);
			ResultSet rs = stmt.executeQuery();

			try {
				if (rs.next()) {
					logger.debug("Grade inserted for student id-->" + studentId);

				} else {
					throw new StudentNotFoundException("student not available for student id-->" + studentId);
				}
			} catch (StudentNotFoundException ex) {
 
				logger.error(ex.getMessage());
			}
 
		} catch (SQLException ex) {
			//logger.error(ex.getMessage());
			logger.error("such student not exist  not exist"+ex.getMessage());
		}

//		

	}

}
