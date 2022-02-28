package myproject;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		int age;
		Scanner sc = new Scanner(System.in);
		age =sc.nextInt();
		System.out.println("enter the age");
		if( age >=18 ) {
			System.out.println("your eligible");
			
		}
		if(age<18) {
			System.out.println("yournot eligible");

			
		}

	}

}
