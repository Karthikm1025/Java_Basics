package javaBasics;

import java.util.Arrays;
import java.util.Iterator;

public class Day6_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {

			//			int a=10, b=0;
			//		int c = a/b;


			int a1[] =  {10,20,30};

			int abc =a1.length;
			System.out.println(abc);
			for (int i = a1.length; i >= 0;  i--) {
				System.out.println(a1[i]);
			}



		} catch (ArithmeticException e) {
			//			e.printStackTrace();

			System.out.println("print this if any error in calculation");

		}
		catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("print this if any error related to Null pointer");
		}
		catch (IndexOutOfBoundsException e) {
			System.out.println("print this if array out of bounds");
		}


		// Type Casting

		//1. Widening casting (byte > short > char > int > long > float > double) ascending to descending
		//2. Narrow casting (double > float > long > int > char > short > byte) descending to ascending

		//Widening casting
		byte a = 10;

		double widening = a;
		System.out.println(widening);

		// Narrow Casting

		String s = "100";
		int int1 = Integer.parseInt(s);
		System.out.println(s);

		double du = 89855559.d;

		int narrow = (int) du ;
		System.out.println(narrow);

	}

}
