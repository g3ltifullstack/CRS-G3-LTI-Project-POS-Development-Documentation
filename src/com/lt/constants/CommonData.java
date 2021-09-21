package com.lt.constants;

public class CommonData {
	
	public final static String  GREAD_UPLOAD="INSERT INTO GRADE VALUES (grade_seq.nextval,?,?,?)";
	//CREATE SEQUENCE grade_seq START WITH 1  INCREMENT by 1    MINVALUE  1    MAXVALUE 1000;
	 public final static String VALIDATE_USER="SELECT userid, roleid FROM crsuser WHERE username=? AND userpassword=?";
   public final static String SELECT_STUDENT_PROF="select studentid,studentname,gender,semester,branch,phonenumber from student";
    public final static String PAYMNT_UPDATE="INSERT INTO paymnt VALUES (paymnt_seq.nextval,?,?,?,?,?,?,?)";
    //CREATE SEQUENCE paymnt_seq START WITH 101  INCREMENT by 1    MINVALUE  101    MAXVALUE 99999;
    public final static String PAYMENT_RECEPT="select paymentid,amount,paymntstatus,studentname,paymntmode where studentname=?";
    public final static String SELECT_STUDENT_BY_NAME="select studentid,studentname,gender,semester,branch,phonenumber from student where studentname=?";
}
 
//CREATE SEQUENCE user_seq START WITH 1  INCREMENT by 1    MINVALUE  1    MAXVALUE 1000;