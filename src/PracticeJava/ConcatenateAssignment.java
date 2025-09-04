package PracticeJava;

public class ConcatenateAssignment {

	public static void main(String[] args) {
		String a = "Shazia";
		String b = "Khan";
		
		System.out.println(a+b);
//		 Write a Java program to print the sum of two numbers.
		 byte k = 74;
		 byte L = 36;
		 System.out.println(k+L);
//		  Write a Java program to print the division of two numbers.
		 byte c = 50;
		 byte d = 3;
		 System.out.println(c/d);
//		  Write a Java program to compute the specified expressions and print the output. Go to the editor.
		 System.out.println(((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));
		 
		 
//		 Try to concat "Hello Selenium" with a character 't'.
		 
		 char e = 't';
		String f = "hello Selenium";

		System.out.println(f +" "+ (e));
		
//		Create three int variables having value
	//
//		s like : 100, 200, 3400. Add them and concatenate and generate this output String : 
	//
//		"Your Total  amount is. 3700".
	//	
		
		int g = 100;
		int h= 200; 
		int i =3400;

		System.out.println("Your Total amount is:" +(g+h+i));
		
//		Print the ASCII value of the character 'h'.
		
		char j = 'h';
		
		System.out.println((byte)j);
		
//		Write a program to add 3 to the ASCII value of the character 'd' and print the equivalent character.
		
		byte k1= 3;
		char l = 'd';
		
		System.out.println(k1+l);
		
//		need help== Write a program to find the square of the number 3.9.


		
		 double number = 3.9;
	     double square = number * number;
	     System.out.println("The square of " + number + " is: " + square);
		
		
		double m1=4.0;
		double square_1= m1 * m1;
		
		  System.out.println("The square of " +  m1  + " is: " + square_1);
		  
//		  Quiz 1
		  
		  int i1 = 11;
			
			i1 = i1++ + ++i1;
			
			System.out.println(i1);
			
			
//			  Quiz 2
			
			
			
			int a1=11, b1=22, c1;
			
			 c1 = a1 + b1 + a1++ + b1++ + ++a1 + ++b1;//103
			
			System.out.println("a1="+a1);
			System.out.println("b1="+b1);
			System.out.println("c1="+c1);
			
//			  Quiz 3 no need help 
		  
		int p=0;

	   int q = p++ - --p + ++p - p--;


		System.out.println(p);
			
		
		int FF= 'A';
		
		System.out.println(FF++);// if ++ sign is after it will not increament the value right at that line 
		}
	


	}


