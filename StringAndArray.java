package natWestJohnty;

public class StringAndArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word = "job@mav@march@2022";
		//To find length
		int length = word.length();
		
		System.out.println(length);
		
		//To change uppercase
		
		String upperCase = word.toUpperCase();
		System.out.println(upperCase);
		
		
		//To Change lowercase
		
		String lowerCase = word.toLowerCase();
		System.out.println(lowerCase);
		//find indexvalue
		int indexOf = word.indexOf('c');

		System.out.println(indexOf);
		//find lastindexof

		int lastIndexOf = word.lastIndexOf('@');

		System.out.println(lastIndexOf);
		
		//to find charat
		
		char value = word.charAt(1);
		System.out.println(value);

		//Equals
		
		String name1="MAVERIC";
		String name2 ="maveric";
		
		boolean result = name1.equals(name2);
		System.out.println(result);
		//Equalsignorecase
		boolean result2 = name1.equalsIgnoreCase(name2);
		
		System.out.println(result2);
		
		//replace
		
		String replace = word.replace("job", "Work");
		System.out.println(replace);
		
		//Stratswith
		
		boolean startsWith = replace.startsWith("Work");
		System.out.println(startsWith);
		
		//endswith
		
		boolean endsWith = replace.endsWith("2022");
		
		System.out.println(endsWith);
		
		//trim
		
		String job = " zoho pvt  ";
		
		String trim = job.trim();
		System.out.println(trim);
		
		//substring

		String substring = word.substring(10);

		System.out.println(substring);

		String	str="hellow world";

		String substring2 = str.substring(2, 6);

		System.out.println(substring2);
		
        //split
		
		String [] array = word.split("@");
		
		System.out.println(array[2]);
		
		// Array

		int a[]=new int[5];

		a[0] = 10;
		a[1]= 20;
		a[2] = 30;
		a[3] =40;
		a[4]=50;
		//	a[5]=60;

		int length2 = a.length;

		System.out.println(length2);

		for (int i = 0; i < a.length; i++) {

			System.out.println(a[i]);

		}

// multidimensional Array
		
		String b[][]= new String [2][2];
		
		b[0][0]="Karthik";
		b[0][1]="Michael";
		b[1][0]="chennai";
		b[1][1]="San francico";
		
		for (String[] strings : b) {
			
			for (String values:strings) {
				
				System.out.println(values);
				
			}
		}
		
//	int myArray[];
	//int myArray[5];
	//int myArray[5] = {1,2,3,4,5};
	//	int myaArray[] = {1,2,3,4,5};

		
		
		
	}

}
