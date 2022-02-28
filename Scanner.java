package vaeiable;

import java.io.InputStream;

public class Scanner {

	public Scanner(InputStream in) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System .out.println("Enter some number");
		int user_input_number =scan.nextInt();
		System.out.println("The entered value is");
		System.out.print(user_input_number);
		
		
		

	}

	private int nextInt() {
		// TODO Auto-generated method stub
		return 6;
	}

}
