package string_project;

import java.util.Scanner;

public class Password_Login {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Username");
		String username = sc.next();
		System.out.println("Enter The Password");
		String Password = sc.next();
		if(username.equals("Sonali") && Password.equals("Sonali@123"))
	        System.out.println("Login Successful");
	      else
		  System.out.println("Invalid user");
		sc.close();
		
			 
		

	}

}
