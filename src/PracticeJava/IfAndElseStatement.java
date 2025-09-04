package PracticeJava;

public class IfAndElseStatement {

	public static void main(String[] args) {
		

		
				
				
				//		  if-else if Statement:
					int num = 7;

					if (num < 5) {

					    System.out.println("Number is less than 5.");

					} else if (num < 10) {

					    System.out.println("Number is between 5 and 10.");

					} else {

					    System.out.println("Number is greater than or equal to 10.");

					}
					
					
					 
						
//					Nested if Statements:

					int x = 10;

					int y = 5;

					if (x > 0) {

					    if (y > 0) {

					        System.out.println("Both x and y are positive.");

					    } else {

					        System.out.println("x is positive, but y is not.");

					    }

					} else {

					    System.out.println("x is not positive.");

					}
					
//					another nested 
					
					  int age = 20;
						 
					   if(age >= 18) {
						   System.out.println("eligible to drink ");
						  if(age >= 20) {
							  System.out.println("eligible to vote");  
						  }else {
							 System.out.println("not eligiable to drink ");
						  } 
					  } else { 
					  System.out.println("not eligible to vote");
					  } 
					  
//				 if-else if Statement:			  
						  
					  int Shaziaage = 43;
						
						if(Shaziaage < 50) {
							
							System.out.println("Shazia is very old ");
						} else if (Shaziaage <= 30) {
							
							System.out.println("Shazia is still young "+Shaziaage);
							
						} else { 
							
							System.out.println(Shaziaage);
							
						
				    }
						
							
					
						}
		
			





	}


