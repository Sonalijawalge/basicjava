package marks;

import java.util.Scanner;

public class Gradeofstudent {

	public static void main(String[] args) {
		int marks;
		Scanner sc =  new Scanner (System.in);
		System.out.println("enter your marks");
		marks=sc.nextInt();
		if (marks>=90 && marks<=100) {
		System.out.println("grade A");
		}
		else if(marks>= 60 && marks <= 89) {
			System.out.println(marks+"grade B");
		}
		else if(marks >= 40 &&  marks<= 59) {
			System.out.println(marks+"grade C");
		}
		else if (marks >= 0 && marks <= 39) {
			System.out.println(marks+"grade D");
		}
		else {
			System.out.println(marks+"invalid marks");
		}
		
		

	}

}