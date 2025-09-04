package OOP_Interface;

public interface WebDriver_Architact_OOP {
//	 if we write veriable with upper latter it will be final in nature 
	int Final_FEE = 20;
// none static method can not have method body but static method have to have body in interface 
	
   public void get(String url);
	
	public String getTitle();
	
	public void findElement(String ele);
	
	public void click(String ele);
	
	public void sendKeys(String ele, String value);
	
	public void quit();
	
//  after JDK 1.8 2 major changes happend 
//	now we can have Static method has to have body and we can not override static methods 

	public static void indiMethod() {
    	System.out.println("Shazia is learning ");
	}
	
//	we can also have default none static methods with method body you can not override this in class as it is we have to change from default to public 
	
	default void medicalRecords() {
		System.out.println("my medical record");
	}
}

