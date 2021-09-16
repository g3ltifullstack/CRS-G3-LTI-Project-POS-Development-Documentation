package com.lt.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.lt.bean.Payment;
import com.lt.bean.Student;
import com.lt.constants.CommonData;
import com.lt.utils.DBUtils;

public class PayDaoImpl implements PayDaoInterface{

	

	@Override
	public List<Payment> viewrecept(String  name) {
		Connection connection = DBUtils.getConnection();
		PreparedStatement stmt= null;
		 List <Payment> payrecept=new ArrayList<Payment>();
		try {
			//paymentid,amount,paymntstatus,studentname,paymntmode
			//Declaring prepared statement
			stmt=connection.prepareStatement(CommonData.PAYMENT_RECEPT);
		    //liststd.add(getInt(1, studentid));
			
			ResultSet rs = stmt.executeQuery();
			
			if(rs.next()) {
				Payment payment =new Payment();
				payment.setPaymentId( rs.getInt("paymentid"));
				payment.setAmount( rs.getInt("amount"));
				payment.setPaymntstatus( rs.getString("paymntstatus"));
				payment.setStudentname( rs.getString("studentname"));
				payment.setPaymntmode( rs.getInt("paymntmode"));
				
				payrecept.add( payment);
			 
			 
			 System.out.println("data fetched");
			
			}
			

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
//		
		
		return payrecept;
	}
		
		
	

	
	@Override
	public void payBill(String student, Payment payment) {
		
		Connection connection = DBUtils.getConnection();
		PreparedStatement stmt= null;
		;
		try {
           
			//Declaring prepared statement
			stmt=connection.prepareStatement(CommonData.PAYMNT_UPDATE);
			stmt.setInt(1,payment.getPaymentId());
			stmt.setInt(2,payment.getAmount());
			stmt.setString(3, "done");
			stmt.setInt(4,payment.getPaymntmode());
			stmt.setString(5,payment.getCardnumber());
			stmt.setInt(6,payment.getPaymntpin());
			stmt.setString(7,payment.getPaymntremark());
			stmt.setString(8,student);
		  
			ResultSet rs = stmt.executeQuery();
			if(rs.next()) {
				System.out.println("payment done");
				
				
			}
			

			

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
//		
		
	}
		
	}


