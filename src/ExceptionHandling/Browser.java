package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Browser {
//  Important class
	public static void main(String[] args) {
		System.out.println("open browser");
		
		try {
			Thread.sleep(5000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
			
		}
		System.out.println("close browser");
		
		try {
			FileInputStream file = new FileInputStream ("Documenmt/ ");
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
