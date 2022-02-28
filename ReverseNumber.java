package MyName;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		int num, i, digit;
		int rev = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		num= sc.nextInt();
		
		while(num> 0) {
			digit = num % 10;
			//System.out.print(digit);
			rev = rev * 10 +digit;
			num = num/ 10;
		}
		System.out.println("Reversed number"+rev);
		if(num==rev) {
			System.out.println(num+"is pallandrome");
		}
		else {
			System.out.println(num+"is not pallandrome");
		}
		
	}

}
