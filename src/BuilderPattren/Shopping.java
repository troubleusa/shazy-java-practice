package BuilderPattren;

public class Shopping {
   
//	if method is returning we have to create method with class name 
	public Shopping login() {
		System.out.println("defualt login ");
		return new Shopping();
	}
	

	public Shopping login(String un, String pw) {
		System.out.println("User name is this: "  + un +"  " + "Passowrd is:" + pw);
		
		return new Shopping();
	}
	

	public Shopping search () {
		System.out.println("default search" );
		return new Shopping();
		
	}
	
	
    public Shopping search (String productName ) {
    	
    	System.out.println(" search with product name is : " + productName );
    	return new Shopping();
	}
	
	
	
	
    public Shopping search (String productName, int Price ) {
    	
    	System.out.println(" search with product name " + productName + "and price " + Price );
    	return new Shopping();
	}
	
	
	
    public Shopping addToCart (String productName) {
    	
    	System.out.println(" Add to cart  " + productName );
    	return new Shopping();
	}
	
    public Shopping makePayment (String   Creditacrd,int cvv) {
    	
    	System.out.println(" making payment " + Creditacrd + ": " + cvv);
    	return new Shopping();
	
    }
    public Shopping logOut () {
    	System.out.println("defualt logOut ");
    	return new Shopping();
 }
}
