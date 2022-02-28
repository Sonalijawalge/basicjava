package string_project;

public class String_Vowels {

	public static void main(String[] args) {
		String s = "Hello how are you";
		System.out.println("Numbers of characters ="+s.length());
		System.out.println("charector at 3rd position "+s.charAt(1));
		System.out.println("Last character "+s.charAt(s.length()-2));
		int c =0;
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
			 c++;	
			}
		}
		 System.out.println("Number of vowels="+c);

	}

}
