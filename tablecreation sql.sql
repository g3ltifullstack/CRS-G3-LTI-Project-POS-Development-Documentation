table name                 column name
user            (userid,username,userpassword,rollid);
CREATE TABLE user (
    userid int NOT NULL,
    username varchar2(35) NOT NULL,
    userpassword varchar2(35),
	rollid int (10),
    PRIMARY KEY (userid)
    
);
admin           (adminid,name,gender,phonenumber);
CREATE TABLE admin ( 
 adminid int NOT NULL,
    name varchar2(35) NOT NULL,
    gender varchar2(10),
	phonenumber int (10),
    PRIMARY KEY (adminid)
);
professor      (professorid,professorname,department,email,gender);
CREATE TABLE professor ( 
    professorid int NOT NULL,
    professorname varchar2(35) NOT NULL,
    department varchar2(35),
	email varchar2(35),
	gender varchar2(10)
    PRIMARY KEY (adminid)
);
student        (studentid,studentname,gender,phonenumber,semester,branch,grade);
CREATE TABLE student (   
   studentid int NOT NULL,
    studentname varchar2(35) NOT NULL,
    gender varchar2(10),
	phonenumber varchar2(15),
	semester int(3),
	branch varchar2(35),
	grade varchar2(15)
    PRIMARY KEY (adminid),
    FOREIGN KEY (PersonID) REFERENCES Persons(PersonID)
	);

course         (courseid,coursename,coursedescription,coursefee,professorid,numberofstudent);
CREATE TABLE course (   
   courseid int NOT NULL,
    coursename varchar2(35) NOT NULL,
    coursedescription varchar2(75),
	coursefee varchar2(15),
	professorid int(10),
	numberofstudent int (2),
    PRIMARY KEY (courseid),
    FOREIGN KEY (professorid) REFERENCES professor(professorid)
	);
catalog        (courseid,professorid,coursecatalogid,cour)
CREATE TABLE catalog (   
   courseid int (15),
	professorid int(10),
	coursecatalogid int not null,
    PRIMARY KEY (coursecatalogid)
   -- FOREIGN KEY (courseid) REFERENCES course(courseid)
	);

registeredcourse   (courseid,coursename,coursedescription,numberofstudent,professorid);

CREATE TABLE registeredcourse (   
   courseid int not null
	coursename varchar2(35),
	coursedescription varchar2(75),
	numberofstudent int(3)
	professorid varchar2(15),
    PRIMARY KEY (courseid)
	);
notification   (notificationid,notificationstatus,notificationmessage,studentid);
CREATE TABLE notification (   
   notificationid int not null
	notificationstatus varchar2(35),
	notificationmessage varchar2(75),
	studentid int(3)
    PRIMARY KEY (notificationid),
	FOREIGN KEY (studentid) REFERENCES student(studentid)
	);

grade           (courseid,studentid,grade,);

CREATE TABLE grade (   
   courseid int not null
	studentid int(15),
	grade varchar2(15),
    PRIMARY KEY (courseid),
	FOREIGN KEY (studentid) REFERENCES student(studentid)
	);

gradecard       (gradecardid,studentid,gradename)
CREATE TABLE gradecard (   
   gradecardid int not null
	studentid int(15),
	gradename varchar2(15),
    PRIMARY KEY (gradecardid),
	FOREIGN KEY (studentid) REFERENCES student(studentid)
	);

payment         (paymentid,amount,);        
