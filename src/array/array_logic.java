package array;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class array_logic {

	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		
		ArrayList<String>a1=new ArrayList<>();
		System.out.println("Enter elements(enter q for quit).");
		
		while(true) {
			String i=sc.next();
			
			if(i.equalsIgnoreCase ("q")) {
				break;

				}
				System.out.println("Using enhanced for loop");
				
				for(String b:a1) {
					System.out.println(b);
				}
		     System.out.println("Using Iterator");
		     
		     Iterator itr=a1.iterator();
		     while(itr.hasNext()) {
		    	 System.out.println(itr.next());
		     }
			}}}
		
