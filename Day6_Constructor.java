package javaBasics;

public class Day6_Constructor {

	public Day6_Constructor() {
		
		this(2022);
		System.out.println("My first company tcs");
	}
	
	public Day6_Constructor(int a){
		this(2025, "Agilysys");
		System.out.println("started second company " + a);
		
	}
	
	public 	Day6_Constructor (int a, String b) {
		
		System.out.println(b + " " +  a);
	}
	 
public static void main(String[] args) {
	
	Day6_Constructor obj1 = new Day6_Constructor();
	//Day6_Constructor obj12= new Day6_Constructor(2022);
	
	
}	
	

}
