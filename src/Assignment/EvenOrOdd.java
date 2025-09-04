package Assignment;

public class EvenOrOdd {

	public static void main(String[] args) {
//		 TODO Auto-generated method stub
		
// Def﻿ine a program to find out whether a given number is even or odd - return true/false.	
		for (int i = 0; i < 20; i++) {
			 System.out.printf("%d, %b\n", i, i % 2 == 0);
			
			if( i % 2 == 1) {
				System.out.printf("%d: %b, number is odd\n", i, false);
			}
			else {
				System.out.printf("%d,%b,number is even\n",i ,true);
//				we are creating another line with using \n 
//				and %d is placeholder for integer in a format-string
			}
			
		}
		System.out.println("............................................................");
//			6. A person is eligible to vote if his/her age is greater than or equal to 18.
//
//			 Define a method to find out if he/she is eligible to﻿ vote. - return true/false
		for (int c = 1; c <= 25; c++) {
			if (c >= 21) {
				System.out.printf("%d: %b, person can vote\n", c, true);
//			} else {
//				System.out.printf("%d: %b, person can not vote\n", c, false);
			}
		
		
		}
	}
}
	
