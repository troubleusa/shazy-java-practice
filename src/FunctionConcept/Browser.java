package FunctionConcept;

public class Browser {

	public void m1() {
		System.out.println("Google");
	   m2();// we can simply call it this way as well 
	}
	
	
	public void m2() {
		System.out.println("edge");
		m3();
	}
	
	
	public void m3() {
		System.out.println("firefox");
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Browser c1= new Browser();
		c1.m1();
        c1.m2();
        c1.m3();
	}

}
