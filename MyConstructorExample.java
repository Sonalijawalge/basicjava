package my_oops_project;

class Myconstr{
	int i,j, k;
	Myconstr(){
		System.out.println("Inside Constructor");
		i=5;
		j=6;
		k=9;
		System.out.println("i="+i+" and j="+j+ "and k=" +k);
	}
	Myconstr(int i,int j){
		System.out.println("with argument");
		 this.i=i;
		this.j=j;
	}
	Myconstr(int i, int j,int k){
		System.out.println("largest is= " +k);
		this.i=i;
		this.j=j;
		this.k=k;
	}
	 public Myconstr(Myconstr ob2) {
		 this.i=ob2.i;
		 this.j=ob2.k;
		 this.k=ob2.k;
		 System.out.println("i="+this.i+ "j="+this.j+ "k="+this.k);
		 
	}
	void laregetNumber() {
		 int l=(i>j)?i:j;
		 System.out.println("largest is = "+l);
	 }
	  void Largestthree() {
		  int l= (i>j && i>k)?i:(j>i && j>k)?j:k ;
		  System.out.println("largest of three number is = " +l);
		  
	  }
	
}

public class MyConstructorExample {

	public static void main(String[] args) {
		Myconstr ob = new Myconstr();
		Myconstr ob1 = new Myconstr(1,2);
		Myconstr ob2 = new Myconstr(1,2,3);
		ob.laregetNumber();
		ob1.laregetNumber();
		ob2.laregetNumber();
		Myconstr ob3 = new Myconstr(ob2);
	}

}
