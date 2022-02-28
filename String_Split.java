package string_project;

public class String_Split {

	public static void main(String[] args) {
		String s = "java Programming Language";
		String sp []  = s.split(" ");
		System.out.println();
		for(int i=0;i<sp.length;i++) {
			System.out.print(sp[i]+" ");
		}
	}

}
