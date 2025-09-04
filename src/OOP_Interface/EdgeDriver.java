package OOP_Interface;

public class EdgeDriver implements WebDriver_Architact_OOP {

	
	public EdgeDriver() {
		System.out.println("launch edge driver");
	}
	
	@Override
	public void get(String url) {
		System.out.println("lunch URL"+ url);
		
	}

	@Override
	public String getTitle() {
		return "title name";
	}

	@Override
	public void findElement(String ele) {
		System.out.println("find element"+ ele);
		
	}

	@Override
	public void click(String ele) {
		System.out.println("clicking on elemnt;"+ ele);
		
	}

	@Override
	public void sendKeys(String ele, String value) {
		System.out.println("entering th value ;"+ ele + "value==;" +value);
	}

	@Override
	public void quit() {
		System.out.println("close browser");
		
	}
}