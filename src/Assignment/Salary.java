package Assignment;


public class Salary{

	  // Instance variables
    private int id;
    private String name;
    private double salary;
	// Constructor
    public Salary(int id, String name, double salary) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
	}


 

    // Getter for id
    public int getId() {
        return id;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }



    public void setSalary(double salary) {
		this.salary = salary;
	}




	// Main method to test the Employee class
    public static void main(String[] args) {
        // Create an Employee object
        Salary emp = new Salary(101, "Alice Johnson", 50000.0);

        // Print initial employee details
        System.out.println(" Employee ID: " + emp.getId());
        System.out.println("Employee Name: " + emp.getName());
        System.out.printf("Employee Salary: $%.2f\n", emp.getSalary());

//         Give a 10% raise
        double Salary = emp.getSalary() * 1.10;
        emp.setSalary(Salary);

        // Print updated salary
        System.out.printf("New Salary after 10%% raise $%.2f\n", emp.getSalary());
    }
} 