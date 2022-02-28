// for loop and while loop are using in this project//

package myloopproject;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		int i, fact = 1, num;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any to find factorial");
		num = sc.nextInt();
		/*for(i = num; i >= 1; i--) {
			fact = fact* i;	
		}
		System.out.println("Factorial of"+num+ "is " +fact);*/
		i = num;
		while (i>=1) {
			fact = fact *i;
			i--;
		}
		System.out.println("Factorial of"+num+ "is" +fact);
	}

}
