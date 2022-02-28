package myloopproject;

public class NestedLoop {

	public static void main(String[] args) {
		int i , j, K=1;
		for (i=1; i<=7; i++) {
			for(j=1; j<=i; j++) {
				//System.out.println("i="+i+ " "+"j="+j);
				System.out.print(K+" ");
				K=K+1;
			}
			System.out.println();
		}
	}

}
