package StringConcept;

import java.util.Arrays;

public class StringMethod {

	public static void main(String[] args) {
		String a1= ("i Love java programing i do");
		
		System.out.println(a1.length());//27
//		 Catching StringIndexOutOfBoundsException with this i can still print values 
		try {
			System.out.println(a1.charAt(30));//.StringIndexOutOfBoundsException
		
		} catch (StringIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("StringIndexOutOfBoundsException");
		} finally {
		
			System.out.println("StringIndexOutOfBoundsException");
		}
	
		System.out.println(a1.charAt(2));// L
		System.out.println(a1.charAt(5));// e
		System.out.println(a1.indexOf('j'));// print 7 
		System.out.println(a1.indexOf("i"));// print 0
		
		System.out.println(a1.indexOf('i', a1.indexOf('i')+1));// will print first "i" 19
		
		System.out.println(a1.indexOf('i', a1.indexOf('i', a1.indexOf('i')+1)+1));//Second "i "place 23
		
		System.out.println(a1.indexOf('i', a1.indexOf('i', a1.indexOf('i', a1.indexOf('i'))+1)+1)+1);// Third i in the sentence number 24 
		System.out.println(a1.indexOf("java"));
		
		
		System.out.println(a1.indexOf("python"));//-1
		
		System.out.println("----------------------------------------");

		//		naveen code print boolean 
		

		
		String mesg = "welcome admin";
		if(mesg.indexOf("admin") == 3) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
		
		
		System.out.println("-----------------------------------");	
		
		String b1= ("i am learning java");
		 
	if (b1.contains("java")){
		
	 System.out.println("it has java");// will  print this 
	 }
	 else {
		 System.out.println("it doesnt have java"); 
	 }
	System.out.println("-----------------------------------");			
	//equals:ignore case 
			String m1 = "hello selenium";
			String m2 = "Hello selenium";
			
			System.out.println(m1.equals(m2));//false
			System.out.println(m1.equalsIgnoreCase(m2));//true after changing ignore case will print true 
     System.out.println("-----------------------------------");	
   //      covert to upper case and lower case 
     
	String c1 = ("i like cooking food");
	System.out.println(c1.toLowerCase());// print the lower case 
	System.out.println(c1.toUpperCase());// print in Upper case 
	
	System.out.println(c1.startsWith("i like"));// true 
	System.out.println(c1.endsWith("Food"));//false 
	
	
  //	Array split  String 
	
	
	String top = "xXhelloXxXseleniumXxXtestingXXxXautomationX";
	String t[] = top.split("xX");
	
	System.out.println(t[0]);//nothing
	System.out.println(t[1]);
	System.out.println(t[2]);
	System.out.println(t[3]);
	System.out.println(t[4]);
	
	  //	Array split  String  
	
	String data = "pooja;sharma;bangalore;IBM;SDET;QA";
	
	String words[] = data.split(";");

	for(String word : words) {
		System.out.println(word);
		
		 System.out.println("-----------------------------------");	
		
   // did not practice the below 		
		String domain = "pooja.sharma.bangalore.IBM.SDET.QA";
		String dom[] = domain.split("\\.");
		System.out.println(dom[0]);
		 System.out.println("-----------------------------------");			
		String tree = "sonali||sharma||bangalore||IBM||SDET||QA";
		String tr[] = tree.split("\\|\\|");
		System.out.println(tr[0]);
		
		 System.out.println("-----------------------------------");	
		//escape char: . | ||
		
		System.out.println("-----------");

		
		String xpath = "//input[@id=\"automation\"]";
		System.out.println(xpath);
		
		 System.out.println("-----------------------------------");	
		 
		String message = "I love \"java\" programming"; //op: I love "java" programming
		System.out.println(message);
		
		 System.out.println("-----------------------------------");	
		
		String mgg = "I love 'java' programming"; //op: I love 'java' programming
		System.out.println(mgg);
		
		 System.out.println("-----------------------------------");	
		 
		//subString:
		String trMesg = "your order id is 12345";
		
		System.out.println(trMesg.substring(3));//start from 3 up to the end of the string
		System.out.println(trMesg.substring(17));//12345
		
		System.out.println(trMesg.substring(0, 6));//your or
				
		System.out.println(trMesg.substring(trMesg.indexOf("is")+3, trMesg.length()));
		
		 System.out.println("-----------------------------------");	
		 
		
		String pr = "pooja\\sharma\\bangalore";

		String pg[] = pr.split("\\\\");
		System.out.println(pg[0]);
		
		 System.out.println("-----------------------------------");	
		 
		String bh = "I love java and I can not live without java programming";
		
		String ar[] = bh.split("java");// it will split at word java 
		
		System.out.println(Arrays.toString(ar));
		
		
		
		 System.out.println("-----------------------------------");	
		 
		String t2="lets.tr\\\\y.this";
		String r[] = t2.split("\\.");
		System.out.println(Arrays.toString(r));
		
	

	
	}
	
	
	
	
			
	}
	
	

}

