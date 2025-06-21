package natWestJohnty;

public class IntroToJava {
	
	//Variables
	
	byte ab=123;
	short bc=1234;
	int cd=1234567890;
	long d1=12345678999999l;
	
	float d=134.99f;
	double e=12345.989898;
	
	char c1='c';
	String st = "Java Leaning";
	boolean value = true;
	
	// operator 
	
	//Arithmetic operator;
	public static void arithmetic () {
	
		 int a =10, b=15;
		System.out.println(a+b);	
		System.out.println(a-b);
		System.out.println(a/b);
		System.out.println(a%b);
	}
	
	
	public static void assignment() {
		
		int x=10, y=10;
				
		
		System.err.println(x+=y); // x = x+y
		System.out.println((x-=y)); // x=x-y
		System.out.println(x*=y); // x=x*y
		System.out.println(x/=y); //x=x/y
	}
	
	
	public static void relational() {
		int r1=56, r2=70;
		
		System.out.println(r1<r2);
		System.out.println(r1>r2);
		System.out.println(r2==r1);
		System.out.println(r2!=r1);
		
	}
	

	public static void logical() {
		int mark1=20;
		int mark2=30;
		int mark3=40;
		int mark4=50;
		
		//and 
		//true, true = true
		//true, false = false
		//false,false = false
		
		//or
		
		//true, true = true
		//false, true = true
		//false, false = true
		
		//not
		
		//true = false
		//false = true
		
		System.out.println((mark1>mark2 && mark1<mark2));//false
		System.out.println((mark3==mark4 || mark3!=mark4));//true
		System.out.println(!(mark3==mark4 && mark3<mark4));//true
		System.out.println(!(mark1==mark2)||!(mark1<mark2));//true
		
	}
	
	public static void unary() {
		int unary=100;
		System.out.println(--unary);
		System.out.println(unary);
		System.out.println(unary++);
		System.out.println(unary);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Types of variables
		arithmetic();
		relational();
		logical();
		unary();
		
		
		
		
		
		
		
	}

}
