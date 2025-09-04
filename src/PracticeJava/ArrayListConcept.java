package PracticeJava;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		ArrayList<Integer> marklist = new ArrayList<Integer>();
		
	   marklist.add(100);
	   marklist.add(200);
	   marklist.add(300);
	   marklist.add(400);
	  
//	   print the size of the array 
	   System.out.println(marklist.size());//4
//	    print array Value 
	   System.out.println(marklist.toString());//[100, 200, 300, 400]
//	   Simple way to print array value 
	   System.out.println(marklist);//[100, 200, 300, 400]
	   
	   // for each loop 
	   
	   for(int i:marklist) {
		   System.out.println("Marks value is;" +""+ (i));
		  
	   } 
	   System.out.println("....................................");
//	   in Object array we can mix data 
	   
	   ArrayList<Object> empDataList = new ArrayList<Object>();
		empDataList.add("Tom");//0
		empDataList.add(30);//1
		empDataList.add(34.33);//2
		empDataList.add('m');//3
		empDataList.add(true);//4
		
//		 it will get one index value array list  
		System.out.println(empDataList.get(0));
		
		System.out.println("....................................");
//		print the size of the Arraylist 
		System.out.println(empDataList.size());//5
		
		System.out.println("....................................");
//		 print all the values of arraylist 
		System.out.println(empDataList);//[Tom, 30, 34.33, m, true]
		
		
		empDataList.remove(3);// it will remove "m"	
		
		System.out.println("....................................");	
		for(Object e : empDataList)	{
			System.out.println(e);
		}
	   
	   
	}

}
   

// 	ArrayList<String> data = new ArrayList<String>();