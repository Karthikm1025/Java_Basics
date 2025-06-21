package natWestJohnty;

public class ControlAndLooping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Control statement
		// if 
		// if else
		//Nested if else
		//else if ladder
		// switch case
		
		// looping Statement
		// while loop
		//for loop
		//for each loop/enhance for loop
		//do while loop
		
		// if and else statement
		int a =10, b=10;
		
		if(a==b) {
			
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		// nested if else

		if(a!=b) {

			if(a>b) {

				System.out.println("a is greater");
			}

			else {
				System.out.println("b is greater");
			}
		}
		else {

			System.out.println("condition fails");

		}
		
		//else if ladder
		
		if (a==b) {
			
			System.out.println("hello");
		}
		else if(a!=b) {
			System.out.println("world");
		}
		else if(a<b) {
			System.out.println("b is becomes greater");
		}
		else if (a>b) {
			
			System.out.println("both a and b not equal");
		}
		else {
			System.out.println("condition fails");
		}
		
		
		//switch case
		String companyName = "Maveric";

		switch (companyName) {
		case  ("maverick"):
			System.out.println("matched with maverick");
			break;
		case ("mavrick"):
			System.out.println("matched with mavrick");
			break;
		case("maveric"):
			System.out.println("matched with maveric");
			break;
		case("Maveric"):
			System.out.println("matched with Maveric");
			break;

		default: 
			System.out.println("not matching");
			break;
		}


		//while loop
		
		/*
		 * int num =0;
		 * 
		 * while(num<=10) {
		 * 
		 * System.out.println(num); num++; }
		 */
		
		//for loop
		
		/*
		 * for (int i = 0; i < 50; i+=10) { System.out.println(i);
		 * 
		 * }
		 */
		
		//do while loop
		
		int doLoop = 10;
		
		do {
			doLoop+=10;
			System.out.println(doLoop);
		} while (doLoop>50);
		
		
		
	}

}
