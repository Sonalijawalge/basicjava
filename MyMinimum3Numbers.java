package myassigment;

import java.util.Scanner;

public class MyMinimum3Numbers {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("input the first number");
		double x = in.nextDouble();
		System.out.print("input the second number");
		double y = in.nextDouble();
		System.out.print("input the third number");
		double z = in.nextDouble();
		System.out.print("the smallest value is"+smallest(x,y,z)+"\n");
		
	}

	private static double smallest(double x, double y, double z) {
		// TODO Auto-generated method stub
		return Math.min(Math.min(x,y),z);
		
		
	}

}
