package string_project;

public class String_Function2 {

	public static void main(String[] args) {
		String s = "Hello Friends Hello";
		String s1=s.substring(3,8);
		System.out.println(s1);
		System.out.println(s.substring(6));
		
		System.out.println(s.substring(s.length()-1));
		System.out.println(s.charAt(s.length()-1));
		
		System.out.println(s.lastIndexOf("l"));
		System.out.println(s.contains("Hellohedjsn"));

	}

}
