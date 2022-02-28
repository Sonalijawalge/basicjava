package exception_project;

public class StrigException {

	public static void main(String[] args) {
		String s =  null;
		System.out.println("Before Lgength");
		//NumberFormatException
		String num = "asdf";
		int n = Integer.parseInt(num); //Number
		 try {
			 int l =s.length();		
		}catch (NullPointerException e) {
			e.printStackTrace();
			
		}
		 
		 System.out.println("After length");
		

	}

}
