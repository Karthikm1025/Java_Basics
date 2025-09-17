package javaBasics;

import java.util.Arrays;

public class Day3_Java {

	public static void StringConcepts() {

		String word = "Myself@karthik@mohan@Maveric123";

		int len= word.length();
		System.out.println(len);

		String uppercase=word.toUpperCase();
		System.out.println(uppercase);

		char Ch=word.charAt(1);
		System.out.println(Ch);
		boolean result = word.contains("Mav");
		System.out.println(result);

		String substring = word.substring(6);

		System.out.println(substring);

		String subsring1 = word.substring(7, 13);

		System.out.println(subsring1);

		String a[] = word.split("@");

		System.out.println(a[3]);

	}

	public static void ArraysConcepts() {

		//Single dimensional Array

		int s[] = new int [5];
		s[0]=10;
		s[1]=20;
		s[2]=30;
		s[3]=40;
		s[4]=50;

		int sa[]= {15,25,35,45};

		int le=	sa.length;

   
		String str3[] = {"Srikanth, karthik, siva"};
		
		for (String string : str3) {
			
		}
		
		
		//multi dimensional array

		String multi[][] = new String [2][3];

		multi[0][0]= "jan";
		multi[0][1]="feb";
		multi[0][2]="marc";
		multi[1][0]= "apr";
		multi[1][1]="May";
		multi[1][2]="June";

		for (int i=0; i<multi.length; i++) {

			System.out.println(multi[i]);

		}

		for (String[] strings : multi) {

			for (String value : strings) {
				System.out.println(value);
			} 

		}

   int abc[][]= { {10,20,30}, {25,35}, {35,45,55}};
   
		for (int i = 0; i < abc.length; i++) {
			
			for (int j = 0; j < abc[i].length; j++) { // by giving this abc[i] will iterate column on each row
				
				System.out.println(abc[i][j]);
				
			}	
		}
		
		
		
		
	}

		//int[][] abc = { {10, 20, 30}, {25, 35}, {35, 45, 55} };

//		for (int i = 0; i < abc.length; i++) {
//		    //System.out.println("abc[i] as array: " + abc[i]); // prints memory address
//		    System.out.println("abc[i] as string: " + Arrays.toString(abc[i])); // prints values
//		}
//
//	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//StringConcepts();
		ArraysConcepts();







	}

}
