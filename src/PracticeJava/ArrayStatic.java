package PracticeJava;

import java.util.Arrays;

public class ArrayStatic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Object is a super class of all the classes in java by default.
		//Object array:
		//name(String), age(int), salary(double), gender(char), isPermanent(boolean)
		
     Object shazData[] = new Object[5];
  
  
      shazData[0] = "Shazia";
      shazData[1] = 30 ;
      shazData[2] = 'f';
      shazData[3] = true;
      shazData[4] = "single";
  
  
  //  print the  array toString method
      
	  System.out.println(Arrays.toString(shazData));// [Shazia, 30, f, true, single]
	  
	  System.out.println("..................................."); 
	  
	  System.out.println(shazData.length); //  5 
	  System.out.println("..................................."); 
	  
	  
   //print with for each loop   
	  for(Object i : shazData ) {
    	  
    	  System.out.println(i);//[Shazia, 30, f, true, single] all values in lines 
	  }  
	  
	  
      System.out.println("..................................."); 
	  
	  
	  System.out.println(shazData);// this will print location of the code wrong way to print "[Ljava.lang.Object;@36baf30c"
      
	   System.out.println("..................................."); 
	   
	   
//	   index  loop 
	  for(int k = 0; k<= shazData.length; k++) {
    	  
    	  System.out.println(k);// 0 to 5 length 
	     }
	   System.out.println("...................................");    	
//       String array 
	  
	  String Browser[]= new String[5];
	  
	  Browser[0]= "Chrome";
	  Browser[1]="edge";
	  Browser[2]= "safari";
	  Browser[3]= "my browser";
	  Browser[4]= "firefox";
	  
	  System.out.println(Browser[0]);// will print Chrome
	  System.out.println(Arrays.toString(Browser));//[Chrome, edge, safari, my browser, firefox]
	  
//	  for each loop 
	  for(String e: Browser) {
		  System.out.println("the Browser name is;" +""+  (e));
//		   if(e.equals("edge")) {
//				System.out.println("launch edge browser");
//				break; i can break the loop with if condition 
	  }	  
	   System.out.println("...................................");  	  
//			  Array Literals 
		  
		  int x [] = {10,20,30,40};
		  
		  
		  System.out.println(x[0]);// will print 10 
		  
		   for(int y: x) {
			  System.out.println("the array number is;" +""+  (y));
//			   
		  }
		  
           System.out.println(Arrays.toString(x));//[10, 20, 30, 40]
//	  
           System.out.println("..................................."); 
           
           
           double salary[] = {12.33, 23.44, 56.66};
   		System.out.println(salary.length);
        System.out.println("..................................."); 
        
        
   		String browser[] = {"chrome", "firefox", "edge", "safari"};
   		System.out.println(Arrays.toString(browser));// [chrome, firefox, edge, safari]
   		System.out.println(browser.length);//4 
   		browser[0] = "chromium";// change name 
   		System.out.println(Arrays.toString(browser));//[chromium, firefox, edge, safari]
   		
   		for(String e : browser) {
   			System.out.println("Browser is:"+ " " + (e));
   		}
   		
	  
	  
	  }  
	  
	  
	  
	  
      }
  
  
  
  
  
	


