package PracticeJava;

public class ForloopConcept {

	public static void main(String[] args) {
		// reverse loop 
		
		for(int i = 10; i>=1; i--){
            
			System.out.println(i);//prints 10- 1 
	}
	
		
		System.out.println("'''''''''''''''2''''''''''''''''''''");	
		
		//for loop 
		
		
		for(int m=1; m<=10; m++) {
			if(m%2==0) {
				System.out.println(m);
			}
		}
	System.out.println("'''''''''''''''3''''''''''''''''''''");	
//		do while loop 
		
		byte x = 5;
		
		do { 
			System.out.println(x);
			x++;
		}
		while(x<=10);
		
		
		System.out.println("''''''''''''''''4'''''''''''''''''''");	
		
//		 print ASCII values with while loop 
		
		
		char x1 = 5;
		
		do { 
			System.out.println(x1);
			x1++;
		}
		while(x1<=100);
	
 
		System.out.println("''''''''''''''5'''''''''''''''''''''");		
//		 do while with if condition and break
		int y = 1;
		
		do{ 
			
		System.out.println(y);
		y++;
			if(y==8){
			System.out.println("done");
			}
			}
		while(y<=10);
		
		System.out.println("''''''''''''''''6'''''''''''''''''''");
		
		
		int z=1;
		do {
			System.out.println(z);//1234
			z++;//5
			if(z==5) {
				System.out.println("Done!! bye");
				break;
			}
		}
		while(z<=10);//T
		
		System.out.println("'''''''''''''''7''''''''''''''''''''");
//	 nested loop //		inner loop for days  
		
		int weeks= 3;
		int days = 7;
//		outer loop for weeks 
		for(int n = 1; n <= weeks; n++ ) {
			
			System.out.println("weeks; " +n);
			for (int m =1; m <= days; m++) {
				System.out.println( "days;" +m );

		
//		inner loop for days 
		
		}
		}
		
		
		System.out.println("..................8....................");
		
		
		
		
		
		
		for (int i = 0; i <= 5; i++) {
			 for (int j = 0; j <= 5; j++) {
				System.out.print(i + "" + j + " ");
			}
			
			System.out.println("");
		}
		

	    
	}
		
}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		//use cases for while loop:
		//when number of iterations are not fixed
		//infinite scrolling
		//calendar: 
		//webtable with pagination
		//wait for element on the page: 0 5 10 20 50
		//wait for page loading 2 5 8 10
		
		
		//use cases for for loop:
		//when number of iterations are fixed
		//with array, arraylist, index based collection, data structure
		//month drop/ day drop
		//menu sub menu handing
		//footers	
		
		
