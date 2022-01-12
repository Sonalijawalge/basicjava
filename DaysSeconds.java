package myprojct;

import java.util.Scanner;

public class DaysSeconds {

	public static void main(String[] args) {
		int Total_seconds;
		Scanner sa = new Scanner(System.in);
		System.out.println("enter numbers of hours in day");
		int ds= sa.nextInt();
		Total_seconds = ds*24*60*60;
		System.out.println("Total second in "+ds+"days is"+Total_seconds);
		
	}

}
