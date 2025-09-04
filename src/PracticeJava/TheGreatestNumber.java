package PracticeJava;

public class TheGreatestNumber {

	public static void main(String[] args) {
		    int a = 300;
	        int b = 600;
	        int c = 1000;
	        int d = 400;
	        
	        if( a > b && a > c && a > d ) {
	        	System.out.println("a is the greatest");
	        }else if( b >c && b > d) {
	        	System.out.println("d is the greatest");
	        }else if ( c > d ) {
	        	System.out.println("c is the greatest");
	        } else { 
	        	
	       System.out.println(" D is the biggest  ");
		   

	}

//	      if two numbers are the same   
	        int a1 = 300;
	        int b1 = 600;
	        int c1 = 1000;
	        int d1 = 1000;
	        
	        if( a1 > b1 && a > c1 && a > d1 ) {
	        	System.out.println("a is the greatest");
	        }else if( b1 >c && b > d1) {
	        	System.out.println("d is the greatest");
	        }else if ( c1 > d1 ) {
	        	System.out.println("c is the greatest");
	        } else { 
	        	System.out.println(" d1 and c1 are the same ");       
	        
	        }
//	     greatest number with loop    
	        int [] Numbers = {10,20,30,100};
	        int largest = Numbers[0];
	        for (int i = 1; i < Numbers.length; i++) {
	        	if(Numbers[i] > largest) {
	        		largest = Numbers[i];
	        		

	        	
	       }	
	        	}
	        System.out.println("the largest number is :" +largest);
	        
	        
	        int[] arr2 = {69,67,30,40,80,90};
		    for(int i= 0; i< arr2.length; i++) {
		    
			 System.out.println(arr2[i]);
		    }
}
	
}