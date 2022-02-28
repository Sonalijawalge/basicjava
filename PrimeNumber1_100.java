package myloopproject;

import java.util.Scanner;

public class PrimeNumber1_100 {

	public static void main(String[] args) {
		int i,j, n, s=0;
		Scanner sc = new Scanner (System.in) ;
		System.out.println("enter the start value");
		n=sc.nextInt();
		System.out.println("enter end value");
		n=sc.nextInt();
		for(i=s; i<=n; i++) { //1 2 3 4 5 .......1000
			s=0;
			for(j=1; j<=i; j++) { //i=1
				if(i%j==0) {
					s++;
				}
			}
			if(s==2) {
				  System.out.print(i+ "  ");
			}
		}
		 //System.out.println();

	}

}
