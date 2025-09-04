package BuilderPattren;

public class AmazonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Shopping shop = new Shopping();
     shop
     .login()
     .login("Shazia22003", "Senpai")
     .search("nailpolish")
     .addToCart("NailProduct")
     .makePayment("21233445555", 0123)
     .logOut();
     
     
     
     
     
     
     
	}

}
