package PracticeJava;

public class LoopsCocept {

	public static void main(String[] args) {
		
		
		
//		while loop 
		
		
		int a =1;
		while(a <=10) {
       System.out.println(a);
       a++;
		}
	
	
	System.out.println("...............1...................");
//	 in while loop if i enter break it will break the half loop and will print till 5 and "Hi" and
	//		 Break after t++ will break the whole loop 
	int t = 1;
	while(t<=10) {
		System.out.println(t);
		if(t==5) {
			System.out.println("Hi");
//			Break;
		}
	    t++;

	}
	System.out.println("...............2...................");
	
	
	
	int z = 1;
	while (z <= 100) {
		System.out.println(z);
 	if(z % 5 == 0) {
	 System.out.println("hi");
 	}	
			z++;
	
			System.out.println("...............3...................");		
			
			
			int z1 = 1;
			while (z1 <= 20) {
		 	if(z1 % 2 == 0) {
			 System.out.println( z1 +"is even number");
			 
		 	}else {
		 		System.out.println( z1 +"is odd number");
		 	}
				
			z1++; 
			
			}
			
	
//	ASCCI value to A to Z with concatenation 
			System.out.println("..............4....................");				
			char ch = 'A';
			while(ch <= 'Z') {
				System.out.println(ch + " = " +(byte)ch );
				ch++;
			}
	}
// simple a to z 
	
			System.out.println("................5..................");		
			char dh = 'a';
			while(dh <= 'z') {
				System.out.println(dh);
				dh++;
			}
	
	
	
//	reverse order 
	
			int t1 = 10;
			while(t1>=1) {
				System.out.println(t1);
					t1--;
				}
			    
	
	 
	
	System.out.println("................6..................");
                 //	for loop concept 
	
	
	for (char ph = 'A'; ph <= 'Z'; ph++ ) {
		System.out.println(ph);
		
	}

	System.out.println("................7..................");
	
//	Write i am a batman 5 times 
	int c = 1;
	while(c<=5) {
	System.out.println("i am a batman ");
	c++;
	}
	
	
	
	}
	
}
	
	

	
	


