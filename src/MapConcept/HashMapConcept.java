package MapConcept;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class HashMapConcept {

	public static void main(String[] args) {
		//Key-Value pair: hashmap
				//HashMap: class
				//it does not maintain the order: no index
				//name:macbook
				//brand:apple
				//stock:Instock
				//price:1000
				//available:true
		
		HashMap<String , Object> dataMap = new HashMap<String , Object> ();
//		it will not print in order 
//		put the value 
		
		dataMap.put("name", "Macbook");
		dataMap.put("barnd", "Apple");
		dataMap.put("Price", 1000);
		dataMap.put("Available", true);
		System.out.println(dataMap);
//		get the value 
		String A1 =(String) dataMap.get("name");
		System.out.println(A1);
		
        int A2 = (Integer)dataMap.get("Price");
        System.out.println(A2);
        
        boolean A3 = (Boolean)dataMap.get("Available");
        System.out.println(A3);
       
        
	System.out.println("------------");
		
		//only one null key is allowed but n number of null values are allowed
		//key=null: 1st position: on top
		HashMap<String, Integer> studentMap = new HashMap<String, Integer>();
		studentMap.put("Tom", 90);
		studentMap.put("Peter", 40);
		studentMap.put("Ravi", 50);
		studentMap.put("Pooja", 60);
		studentMap.put("Ravi", 70);
		studentMap.put(null, 10);
		studentMap.put(null, 5);
		studentMap.put("Revathy", null);
		studentMap.put("Sonali", null);
		studentMap.put("Senthil", null);
		
		System.out.println(studentMap.size());
		
		studentMap.remove("Tom");// will remove Tom
		
		System.out.println("---------------------------------");
//     LinkedHashMap will print in order
        
//       can only use String and integer here 
        LinkedHashMap<String , Integer> UserMap = new LinkedHashMap<String , Integer>();
		
//		put the value 
		
		UserMap.put("Tim", 100);
		UserMap.put("Shazy", 200);
		UserMap.put("Malayka", 300);
		UserMap.put("Hani",400);
		System.out.println(UserMap);
		
		
		System.out.println("---------------------------------");
		
		
		//null keys are not allowed in TreeMap
      TreeMap<String, Integer> userMap = new TreeMap<String, Integer>();

		userMap.put("Tom", 100);
		userMap.put("Sonali", 200);
		userMap.put("Ravi", 300);
		userMap.put("Sweta", 400);
		userMap.put("Abhi", 400);
		userMap.put("Senthil", 400);
		
		System.out.println(userMap);
		
		
		
	}

}
