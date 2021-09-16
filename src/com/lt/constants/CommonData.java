package com.lt.constants;

public class CommonData {
	
	public final static String  GREAD_UPLOAD="INSERT INTO GRADE VALUES (?,?,?)";
	 public final static String VALIDATE_USER="SELECT userid, roleid FROM crsuser WHERE username=? AND userpassword=?";
   public final static String SELECT_STUDENT_PROF="select studentid,studentname,gender,semester,branch,phonenumber from student";
    public final static String PAYMNT_UPDATE="INSERT INTO paymnt VALUES (?,?,?,?,?,?,?,?)";
    public final static String PAYMENT_RECEPT="select paymentid,amount,paymntstatus,studentname,paymntmode where studentname=?";

}
