package com.lt.business;

import java.util.List;
import java.util.Scanner;

import com.lt.DAO.PayDaoImpl;
import com.lt.DAO.PayDaoInterface;
import com.lt.bean.Payment;
import com.lt.bean.Student;

public class PaymentImplService implements PaymentInterface {

	
	
	Scanner sc=new Scanner(System.in);
	@Override
	public boolean payment(String name) {
		Payment paymnt=new Payment();
		System.out.println("inter paymnt details");
		
		System.out.println(" enter paymntId");
		int paymentId=sc.nextInt();
		System.out.println(" enter amount--> enter only numeric value");
		int amount=sc.nextInt();
		System.out.println(" paymnt mode -->101 for debit card ---> 102 for credit card");
		int paymntmode=sc.nextInt();
		System.out.println("enter card number -->card number should be 16 degit");
		String cardnumber=sc.next();
		System.out.println("enter card pin ");
		int paymntpin=sc.nextInt();
		System.out.println("enter paymnt remark");
		String paymntremark=sc.next();
		
		PayDaoInterface paydao=new PayDaoImpl();
		paydao.payBill(name,paymnt);
		
	
		return false;
	}


	@Override
	public List<Payment> viewrecept(String  name) {
		PayDaoInterface paydao=new PayDaoImpl();
		return paydao.viewrecept(name);
		
	}
	
	
	

}
