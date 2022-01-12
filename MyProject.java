package todaysassinment512022;

import java.util.Scanner;

public class MyProject {

	public static void main(String[] args) {
		float num1, num2;
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number");
		num1 = sc.nextFloat();
		System.out.println("enter second number");
		num2 = sc.nextFloat();
		System.out.println("enter ur choice");
		choice = sc.nextInt();

		System.out.println("1. Addition");
		System.out.println("2. Substraction");
		System.out.println("3. Multipication");
		System.out.println("4. division");
		System.out.println("enter ur choice");

		choice = sc.nextInt();

		switch (choice) {
		case 1:
			float add = num1 + num2;
			System.out.println("Addition of first number" + num1 + "and second number" + num2 + "is" + add);
			break;
		case 2:
			float sub = num1 - num2;
			System.out.println("Substraction of first number" + num1 + "and second number" + num2 + "is" + sub);
			break;
		case 3:
			float mul = num1 * num2;
			System.out.println("Multipication of first number" + num1 + "and second number" + num2 + "is" + mul);
			break;
		case 4:
			float div = num1 / num2;
			System.out.println("Division of first number" + num1 + "and second number" + num2 + "is" + div);
			break;

		default:

			System.out.println("invalid Data");

		}

	}

}
