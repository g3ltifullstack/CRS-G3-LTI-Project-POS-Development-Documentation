package com.lt.business;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.lt.DAO.PayDaoImpl;
import com.lt.DAO.PayDaoInterface;
import com.lt.bean.Payment;

public class PaymentImplService implements PaymentInterface {

	private static Logger logger = Logger.getLogger(PaymentImplService.class);
	
	Scanner sc=new Scanner(System.in);
	//iniitiate payment when student provide name by student class rest details taken fro here
	@Override
	public boolean payment(String name) {
		Payment paymnt=new Payment();
		logger.debug("inter paymnt details");
	    logger.debug(" enter amount--> enter only numeric value");
		int amount=sc.nextInt();
		logger.debug(" paymnt mode -->101 for debit card ---> 102 for credit card");
		int paymntmode=sc.nextInt();
		logger.debug("enter card number -->card number should be 16 degit");
		String cardnumber=sc.next();
		logger.debug("enter card pin ");
		int paymntpin=sc.nextInt();
		logger.debug("enter paymnt remark");
		String paymntremark=sc.next();
		
		logger.debug("setting valuse in object");
		paymnt.setAmount(amount);
		paymnt.setPaymntmode(paymntmode);
		paymnt.setCardnumber(cardnumber);
		paymnt.setPaymntpin(paymntpin);
		paymnt.setPaymntremark(paymntremark);
		
		PayDaoInterface paydao=new PayDaoImpl();
		logger.debug("going to payment");
		paydao.payBill(name,paymnt);
		logger.debug("going to payment");
	
		return false;
	}


	@Override
	public void viewrecept(String  name) {
		List <Payment> recept=new ArrayList();
		PayDaoInterface paydao=new PayDaoImpl();
		recept= paydao.viewrecept(name);
		for (Payment payment : recept) {
			logger.info("payment id="+payment.getPaymentId()+"student name="+payment.getStudentname()+" amount="
					+payment.getAmount()+" payment status"+payment.getPaymntstatus()+" payment mode ="+payment.getPaymntmode());
			
		}
		
	}
	
	
	

}
