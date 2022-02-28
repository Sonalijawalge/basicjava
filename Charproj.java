package ifelse;

import java.util.Scanner;

public class Charproj {

	public static void main(String[] args) {
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a char to cheak vowel or not");
		ch = sc.next().charAt(0);
		switch(ch) {
		case 'a':
		case 'A':
		case 'e':
		case 'E':
		case 'I':
		case 'i':
		case 'o':
		case 'O':
		case 'u':
		case 'U':System.out.println(ch + "is an Vowel");
			     break;
		 default:
			     System.out.println("not an Vowel");
			     
		}

	}

}
