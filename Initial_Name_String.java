package string_project;

public class Initial_Name_String {

	public static void main(String[] args) {
		String s="Mahatama Karmachand Gandhi";//M. K. G.
		
		for(int i=0;i<s.length();i++) {
			if(i==0) {
				 System.out.print(s.charAt(i)+".");
				 
			}
			else if(s.charAt(i)==' ') {
				System.out.print(s.charAt(i+1)+".");
			}
		}

	}

}
