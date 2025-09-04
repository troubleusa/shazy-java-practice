package OOP_Encapsulasion;

public class Employee{
	
//	 I am running this class from Department class 
	
	
	private String name;
	private int Age;
	private double salary;
	private boolean isActive;
	
	
	public Employee(String name) {
	
		this.name = name;
//	i can just print the value but using switch case statement to be smart 
		switch(name) {
	    case "Tom":
	   this.name = name;
	     System.out.println("Name is Tom");
	     break;
	   default:

		System.out.println("this is a consonant");
		break;
	}
	}
//		i can just print the value but using if and else statement to be smart 
//		if (Age>=11)
//			this.Age = Age;
//		else {
//			System.out.println("Age is less than 11");
//		}
//		this.salary = salary;
//		this.isActive = isActive;
//	}




	public Employee() {
		// TODO Auto-generated constructor stub
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
	  this.name = name;
		
	}



	




	public int getAge() {
		return Age;
	}




	public void setAge(int age) {
		Age = age;
	}




	public double getSalary() {
		return salary;
	}




	public void setSalary(double salary) {
		this.salary = salary;
	}




	public boolean isActive() {
		return isActive;
	}




	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}




	public static void main(String[] args) {
		

	}




	
		
	

}
