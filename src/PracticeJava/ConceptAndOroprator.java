package PracticeJava;

public class ConceptAndOroprator {

	public static void main(String[] args) {
		
//		Explanation:

//			In this case:
//			The if statement evaluates c1, which is true.
//			It then evaluates c2, which is false. However, unlike with &&, it doesn't stop here.
//			It continues to evaluate c3 and c4 as well.
//			After evaluating all conditions, the final result is determined to be false (since one false operand in a series of & operations results in a false outcome).
//			Consequently, the statement within the if block (System.out.println("selenium");) is not executed.
		
	    boolean c1 = false;
		boolean c2 = true;
		boolean c3 = true;
		boolean c4 = true;
		
		if (c1 & c2 & c3 & c4) {
		
		System.out.println("selenium");
		
		}else{ 
			
			System.out.println("the condition is false ");
		}
//	//		Explanation:
		//
//		how this works:
//		The if statement starts evaluating from left to right.
//		It first checks c1, which is true.
//		Then it evaluates c2. Since c2 is false, the overall condition of the if statement cannot be true anymore (because for an AND operation to be true, all operands must be true).
//		At this point, the evaluation stops (short-circuits) without checking c3 and c4.
//		Since the overall condition evaluates to false, the code inside the if block (System.out.println("selenium");) will not be executed.
//		In summary, with the && operator, as soon as it encounters a false condition, it stops evaluating further because the final result will definitely be false.
//	
		
       
		boolean d1 = true;
		boolean d2 = false;
		boolean d3 = false;
		boolean d4 = false;

		if (d1 && d2 && d3 && d4) {
		    System.out.println("selenium");
		}

//		Explanation:
//
//			In this case, c1 is true. When the if statement is evaluated, it checks c1 first. Since c1 is true, the condition for the 
//		    if statement is immediately satisfied, and the program prints "selenium". 


		
		boolean e1 = true;
		boolean e2 = false;
		boolean e3 = false;
		boolean e4 = false;
		
		if (e1 || e2 || e3|| e4) {
			System.out.println("final result is true");
		
		}
		
//		in this case with only | operator it is not going to short circuit and going to other values before evaluates . 
//		OR operator checking any true condition  
		
		boolean E1 = false;
		boolean E2 = false;
		boolean E3 = false;
		boolean E4 = true;
		
		if (E1 | E2 | E3| E4) {
			System.out.println("final result is true");
	} else {
		      System.out.println(" all the conditions are false ");
	}
  
		
//		 voter eligibility 
		int b = 18;
		boolean legalAge= true;
		
		if ( b>=17  && legalAge) {
			System.out.println("User is eligible to vote  (&&)");
		}else {
			System.out.println("User is not  eligible to vote  (&&)");
		}
	
		
//		Password is correct using && and || 
		
		boolean isPassowordCorrect = true;
		boolean isUsernameCorrect = false;
		 if (isPassowordCorrect && isUsernameCorrect) {
			 System.out.println("Login successful");
			 } else {
				 System.out.println("passowrd is incorrect"); //Password is incorrect 
			 }
		 if (isPassowordCorrect || isUsernameCorrect) {
			 System.out.println("Login successful");// login successful 
			 } else {
				 System.out.println("passowrd is incorrect");
			 }
		
   }
}