package FunctionConcept;

import java.util.ArrayList;

public class CustomerArr {

	//public static void main(String[] args) {
	public ArrayList<String>getProductList(String name){
		System.out.println("getting the product list :" +name);
		
		ArrayList<String> productList= new ArrayList<String>();
		
		if(name.equals("shazia")) {
		
		productList.add("iphone");
		productList.add("Applewatch");
		productList.add("airpods");
		
		}
		else if(name.equals("Malayka")) {
			
			productList.add("iphone");
			productList.add("airpods"); 
			
		}
	
         else if(name.equals("Hania")) {
			
			productList.add("iphone");
         }
         else {
        	 System.out.println("Customer not found");
         }
			
	  return productList;
	
	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//i can create an object with class name and call the above method otherwise it will print nothing if we write above main methood 	
		CustomerArr c1= new CustomerArr();
		ArrayList<String> prList = c1.getProductList("shazia");
		System.out.println(prList);
		System.out.println(prList.size());
		
		


	



	}

}
