package myloopproject;

public class ForContinue {

	public static void main(String[] args) {
		int i,j;
		for (i=1; i<=3; i++) {
			inner:
			for(j=1; j<=5; j++) {
				if(i==3) {
					//break inner;
					//continue inner; //break the innerloop
				}
				else {
					System.out.println("i="+i+ "j="+j);
				}
			} //inner loop end
			System.out.println();
		}

	}

}
