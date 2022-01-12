package myelectricity;

import java.util.Scanner;

public class MyElectricityBill {

	public static void main(String[] args) {
		int unit;
		float  amount;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter electricity unit");
		unit = sc.nextInt();
		if (unit<100) {
			 amount = unit*0.8f;		
		}
		else if(unit>=100 && unit<=300) {
			amount = 100*0.8f+(unit-100)*1;
		}
		else {
			amount =( 100*0.8f+ 200* (unit-300)*2.50f);
		}
		System.out.println("amount you pay ur electricity unit" +unit +" in Rs." +amount);

	}

}
