package com.lt.DAO;

import java.util.List;

import com.lt.bean.Payment;
import com.lt.bean.Student;

public interface PayDaoInterface {
	
	public void payBill(String student,Payment payment);
	public List<Payment> viewrecept(String name);

}
