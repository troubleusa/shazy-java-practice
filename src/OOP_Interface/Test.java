package OOP_Interface;
   
public class Test {

	static WebDriver_Architact_OOP Driver;
	
	
	public static void main(String[] args) {
		
		
        String Browser = "Chrome";
		switch ( Browser) {
		case "Chrome":
			Driver = new ChromeDriver();
			Driver.get("Amazon,com");
			String titel=  Driver.getTitle();
			System.out.println( titel);
			Driver.click("title");
			Driver.sendKeys("Amzon ", "macbook");
			Driver.click("Search");
			Driver.quit();
			break;
		case "FireFox":
			Driver = new Firefoxdriver();
			Driver.get("Amazon,com");
			String titel1=  Driver.getTitle();
			System.out.println( titel1);
			Driver.click("title");
			Driver.sendKeys("Amzon ", "macbook");
			Driver.click("Search");
			Driver.quit();
			break;
		case "EdgeDriver":
			Driver = new EdgeDriver();
			Driver.get("Amazon,com");
			String titel2=  Driver.getTitle();
			System.out.println( titel2);
			Driver.click("title");
			Driver.sendKeys("Amzon ", "macbook");
			Driver.click("Search");
			Driver.quit();
			break;
		default:
			System.out.println("Browser not found");
			break;
		}
		
//		Top casting // we can do it this way to call functions but above method is prefer 
		WebDriver_Architact_OOP  Driver= new ChromeDriver();
		Driver.get("Amazon,com");
		String titel=  Driver.getTitle();
		System.out.println( titel);
		Driver.click("title");
		Driver.sendKeys("Amzon ", "macbook");
		Driver.click("Search");
		Driver.quit();
		Driver.medicalRecords();
		
//		i can access the static veriable by using class name  and functions too 
	   System.out.println(WebDriver_Architact_OOP.Final_FEE);
	   
 //    static method will be called by interface name i can access this after create an object 
	   WebDriver_Architact_OOP.indiMethod();


	}

}
