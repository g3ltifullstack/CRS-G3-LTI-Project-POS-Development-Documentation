package com.lt.client;

import java.util.Scanner;

import com.lt.DAO.UserDaoInterface;
import com.lt.bean.Professor;
import com.lt.bean.User;
import com.lt.business.ProfessorImplService;
import com.lt.business.ProfessorInterface;
import com.lt.business.UserImplService;
import com.lt.business.UserInterface;

public class UserClient {
	
public static void main(String[] args) {
		
		UserInterface userOperation= new UserImplService();
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("*******WELCOME TO CRS MANAGEMENT SYSTEM***********");
			
				ProfessorInterface proff = new ProfessorImplService();
				
				System.out.println("Choose an Option ");
				System.out.println("1. SignUp ");
				System.out.println("2. Login ");
				System.out.println("3. Manage Password ");
				System.out.println("4. Exit ");
				
				int operation = sc.nextInt();
				switch (operation) {
				case 1:
					System.out.println("SignUp Portal");
					System.out.println("data");
					
					
                    System.out.println("Enter ProfessorID");
					int professorId = sc.nextInt();

					System.out.println("Enter professor Name");
					String professorName = sc.next();
					
					System.out.println("Enter professor Department");
					String department = sc.next();
					
					System.out.println("Enter professor email");
					String email = sc.next();
			         
					System.out.println("Enter professor gender");
					String gender = sc.next();
					
					System.out.println("Enter password");
					String pass = sc.next();
					
					System.out.println("Enter password");
					String role = sc.next();
					System.out.println("Signed up Successfully");
					
					UserDaoInterface user=signup(professorId, professorName, department, email, gender, pass, role);
					
					continue;
					
					

				case 2:
					System.out.println("Login Portal");
					System.out.println("Enter your credentials");

					// fetching input for user credentials
					System.out.println("Enter Username");                          
					String userid= sc.next();
					System.out.println("Enter password");
					String password= sc.next();
					
					User checkedUser= userOperation.validateUser(userid, password);
					int profile= checkedUser.getRoleId();
					int userId=  checkedUser.getUserId();
					
					switch(profile) {
					// if user is a student
					case 102:
						System.out.println("enter professor operation");
						
						Professor professor= userOperation.fetchProfessor(userId);
						ProfessorClient professorClient= new ProfessorClient();
						//redirecting to professor client landing page
						professorClient.professorOperation(professor);
						continue;
					}
			
					break;

				case 3:
					System.out.println("Manage User Portal");
					System.out.println("Enter UserName: ");
					String userName = sc.next();
					System.out.println("Enter Password: ");
					String password1 = sc.next();
					// Manage User method
					//proff.manageUser(userName, password);
					System.out.println("Username and Password submitted Successfully");
					break;

				case 4:
					System.out.println("You have successfully logged out and exited from system. thank you!");
					break;

				default:
					System.out.println("Choose valid user type client");
				}

				sc.close();


		

			
			
			
			

	
	

}
	}

	private static UserDaoInterface signup(int professorId, String professorName, String department, String email,
			String gender, String pass, String role) {
		// TODO Auto-generated method stub
		return null;
	}

}
