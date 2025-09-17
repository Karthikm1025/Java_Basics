package javaBasics;

public class Day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Control statement and Looping 

		//		 Control Statement 
		//		1. if 
		//		2. if else
		//		3. nested if else
		//		4. if else ladder
		//		5.Switch case 
		//		Looping
		//		1.for loop
		//		2.nested for loop
		//		3.while loop
		//		4. do while loop


		//if

		if (5<6) {
			System.out.println("yes");
		}
		// if else

		if (8>9) {
			System.out.println("Ture");
		}
		else {

			System.out.println("false");

		}
		//Nested if else
		int a = 89, b=69;

		/*
		 * if (a>b || a<b) {
		 * 
		 * System.out.println("printed if both condition satisfied");
		 * 
		 * if (a<b || a==b) {
		 * 
		 * System.out.println("printed if any one condition satified"); } else {
		 * System.out.println("printed this because of above were no result");
		 * 
		 * }
		 * 
		 * }else { System.out.println("final results");
		 * 
		 * }
		 */

		//if else ladder

		if (a==b) {
			System.out.println("print because equal");
		}
		else if(a!=b)
		{
			System.out.println("Print if not equal");
		}
		else if (a>b) {
			System.out.println("Print a greater than b");
		}
		else if (b>a) {
			System.out.println("print b greater than a");
		}
		else {
			System.err.println("final results");
		}



		// Switch case

		int y = 101;

		switch(y) {
		case 101:
			System.out.println("condition Matched 1");
			break;
		case 102:
			System.out.println("condition matched 2 ");	
			break;
		case 103:
			System.out.println("condition matched 3");	
			break;
		case 100:
			System.out.println("condition matched");
			break;
		default:
			System.out.println("default result");

		}


		// for loop

		for (int i=0; i<=10; i++) {
			System.out.println(i);

		}

		System.out.println("--------Nested for loop--------");
		//Nested for loop

		for (int j=1; j<10; j++) {

			for (int k=10; k>1; k--) {

				System.out.println(j);
			}


		}

		// while loop

		System.err.println("printing while loop");
		int z =10;

		while (z>=1) {

			System.err.println("print while loop");
			z--;
		}


		//do while loop
		
		System.out.println("do while loop");
		
		int u=10;
		
		do {
			
	
			System.out.println(u);
			System.out.println("print do while");
			u++;
			
			
		}while (15<=u);

		

	}

}
