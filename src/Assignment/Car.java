package Assignment;

public class Car {

	
//	   Create a Java class named "Car" with the following instance variables:
//		make (String)
//		model (String)
//		year (int)
//		Create a constructor for the Car class that takes in the make, model, and year as parameters and initializes the instance variables.
//		Create a default constructor for the Car class that sets the make, model, and year to "Unknown".
//		Create a main method that creates three instances of the Car class using both constructors and prints out their information.
	
	String make;
	String model;
	int year;
	
	
	
	public Car(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}
 
    

	public Car() {
		this.make = "Unknown" ;
		this.model = "Unknown" ;
		this.year = -1;
	}

  public void displayInfo() {
	          //System.out.println(make + " " + model + " " + year );
	          System.out.println("Make: " + make + ", Model: " + model + ", Year: " + (year == -1 ? "Unknown" : year));// == operator will resturn true or false 
//    ? works like if and else 
  
  }
	public static void main(String[] args) {
		Car a1 = new Car("Toyota", "rav4 ", 2016);
		
		//i can also print this way 
		//System.out.println(a1.make+ " " + a1.model + " " + a1.year );
	
		Car a2 = new Car("Toyota", "rav4 ", 2016);
		//System.out.println(a2.make+ " " + a2.model + " " + a2.year );
//		 create object 
		Car a3 = new Car();
		
		a3.displayInfo();
		a2.displayInfo();
		a1.displayInfo();
	}

}
