package javaBasics;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Day8_Java {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File obj = new File("C:\\Users\\karthikmo\\OneDrive - Maveric Systems Limited\\Documents\\QA To QE\\karthi.txt");

		//       obj.mkdir();
		boolean newFile = obj.createNewFile();

		String name = obj.getName();
		System.out.println(name);
		boolean exists = obj.exists();
		System.out.println(exists);

		FileWriter obj2 = new FileWriter("C:\\Users\\karthikmo\\OneDrive - Maveric Systems Limited\\Documents\\QA To QE\\karthi.txt");

		obj2.write("will get placed in Agilysys in sep 2025\n or will get placed in NatWest by 2025");

		obj2.close();

		Scanner scan = new Scanner(obj);
		while(scan.hasNextLine()) {

			String nextLine = scan.nextLine(); 
			System.out.println(nextLine);
		}
		
		
		
		
		
		
		
		
	}

}
