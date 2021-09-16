package com.lt.bean;

public class Payment {
	private int paymentId;
	private int amount;
	private String paymntstatus;
	private int paymntmode;
	private String cardnumber;
	private int paymntpin;
	private String paymntremark;
	private String studentname;
	
	
	
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getPaymntstatus() {
		return paymntstatus;
	}
	public void setPaymntstatus(String paymntstatus) {
		this.paymntstatus = paymntstatus;
	}
	public int getPaymntmode() {
		return paymntmode;
	}
	public void setPaymntmode(int paymntmode) {
		this.paymntmode = paymntmode;
	}
	public String getCardnumber() {
		return cardnumber;
	}
	public void setCardnumber(String cardnumber) {
		this.cardnumber = cardnumber;
	}
	public int getPaymntpin() {
		return paymntpin;
	}
	public void setPaymntpin(int paymntpin) {
		this.paymntpin = paymntpin;
	}
	public String getPaymntremark() {
		return paymntremark;
	}
	public void setPaymntremark(String paymntremark) {
		this.paymntremark = paymntremark;
	}
	
	

	

}
