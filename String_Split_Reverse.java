package string_project;

public class String_Split_Reverse {

	public static void main(String[] args) {
    String s ="Java ia a programming language";
    String sp[]= s.split(" ");
    System.out.println();
    for(int i=sp.length-1;i>=0;i--) {
    	System.out.print(sp[i]+" ");
    }
	}

}
