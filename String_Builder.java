package string_project;

public class String_Builder {

	public static void main(String[] args) {
		StringBuilder strSB = new StringBuilder("Thise is example of ");
		strSB.append("Java programming.");
		System.out.println(strSB);
		
		StringBuilder strSB1 = new StringBuilder("Thise is a program");
		strSB1.replace(0, 9, "java");
		System.out.println(strSB1);
		
		StringBuilder strSB2 = new StringBuilder("Thise is a program");
		strSB2.insert(10,"java");
		System.out.println(strSB2);
		
		StringBuilder strSB3 = new StringBuilder("Thise is a program");
		strSB3.delete(0, 10);
		System.out.println(strSB3);
		
		StringBuilder strSB4 = new StringBuilder("thise is a program");
		strSB4.reverse();
		System.out.println(strSB4);
		
		StringBuilder strSB5 = new StringBuilder("thise is a java program");
		strSB5.deleteCharAt(6);
		System.out.println(strSB5);
		
		StringBuilder strSB6 = new StringBuilder("thise is a java program");
		strSB6.setCharAt(8, 'n');
		System.out.println(strSB6);
	}

}
