package Myproject;

import java.util.Scanner;

public class MyClass {
public static void main(String[] args) {
				int age;
				String name;
				float fees;
				char gen;
				double loan;
				Scanner input = new Scanner(System.in);
				System.out.println("enter the name");
				name=  input.nextLine();
				System.out.println("enter the age");
				age = input.nextInt();
				System.out.println("enter the fees");
				fees = input.nextFloat();
				System.out.println("enter the gender M/F");
				gen = input.next().charAt(0);
				System.out.println("enter the loan amount");
				loan = input.nextDouble();
				System.out.println("Age ="+age);
				System.out.println("Fess ="+fees);
				System.out.println("Gender"+gen);
				System.out.println("Your loan ="+loan);
				System.out.println("Name ="+name);
				
			}

		private double nextDouble() {
			// TODO Auto-generated method stub
			return 0;
		}

		private String netx() {
			// TODO Auto-generated method stub
			return null;
		}

		private float nextFloat() {
			// TODO Auto-generated method stub
			return 0;
		}

		private int nextInt() {
			// TODO Auto-generated method stub
			return 0;
		}

		private String nextLine() {
			// TODO Auto-generated method stub
			return null;
		}

		

	}


