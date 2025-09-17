package javaBasics;

public class DiamondPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rows = 8;
		for (int i = 1; i <= rows; i++) { //rows 

			for (int j = 1; j <=rows; j++) { //columns 1,2,3
				if(j==1 || j==8) {
					System.out.print("*");
				}else {
					System.out.print("");
				}
			}
			System.out.println("");
		}
	
	

	}

}
