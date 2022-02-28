package myloopproject;

import java.util.Scanner;

public class SumofEvenNumbers {

	public static void main(String[] args) {
		int i;
		int even_sum=0;
		int odd_sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int num = sc.nextInt();
		for (i=1;i<=num;i++) {
			if(num%2==0) {
			even_sum=even_sum+i;
			}
			else {
				odd_sum=odd_sum+i;
			}
		}
		System.out.println("even sum"+even_sum);
		System.out.println("odd sum"+odd_sum);
	}

}
