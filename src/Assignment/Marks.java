package Assignment;

import java.util.Arrays;

//7. Write a program which will ask the user to enter his/her marks (out of 100). 
//Define a method that will display grades according to the marks entered as below:
//Marks Grade
//91-100 AA
//81-90 AB
//71-80 BB
//61-70 BC
//51-60 CD
//41-50 DD
//<=40 Fail
//  %.1f inside a formatted string, will print a float formatted to one decimal place
public class Marks {

	public static void getMarks(float[] grades) {
		Arrays.sort(grades);
		for (float grade : grades)
	      if (grade < 0) {
	    	  System.out.printf("Invalid %f", grade);
	      } else if (grade <= 40) {
	    	  System.out.printf("%.1f: Fail\n", grade);
	      } else if (grade > 40 && grade <= 50) {
	    	  System.out.printf("%.1f: DD\n", grade);
	      } else if (grade > 50 && grade <= 60) {
	    	  System.out.printf("%.1f: CD\n", grade);
	      } else if (grade > 60 && grade <= 70) {
	    	  System.out.printf("%.1f: BC\n", grade);
	      } else if (grade > 70 && grade <= 80) {
	    	  System.out.printf("%.1f: BB\n", grade);
	      } else if (grade > 80 && grade <= 90) {
	    	  System.out.printf("%.1f: AB\n", grade);
	      } else if (grade > 90) {
	    	  System.out.printf("%.1f: AA\n", grade);
	      }
   
	}
	public static void main(String[] args) {
		float[] grades = {0, 50, 80,90,70.1f,89.9f};
		getMarks(grades);
	}

}





