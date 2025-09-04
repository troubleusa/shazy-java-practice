package Constructor;

public class Employee {

	String name;
	int Age;
	String DOB;
	double Salary;
	boolean isActive;
	char Gender;

	// function vs const..
	// func can have any name, but const.. will have the same name as the class name
	// func may or may not return but const.. will never return
	// no buss logic in const... buss logic should be the function
	// const.. can not be static, function can be static
	// function will be called using object ref name or using the class, but const..
	// will be called when we create the object
	// function / const.. can be overloaded
	// const.. is preventing to create unnecessary objects, function will have buss
	// logic
	// const.. is used to init the instance variables using this keyword

	public Employee(String name, int Age) {
		this.name = name;
		this.Age = Age;

	}

	public Employee(String name, int age, String dOB, double salary) {
		this.name = name;
		Age = age;
		DOB = dOB;
		Salary = salary;
	}

	public Employee(String name, int age, String dOB, double salary, boolean isActive) {
		super();
		this.name = name;
		Age = age;
		DOB = dOB;
		Salary = salary;
		this.isActive = isActive;
	}

	public Employee(String name, int age, String dOB, double salary, boolean isActive, char gender) {

		this.name = name;
		Age = age;
		DOB = dOB;
		Salary = salary;
		this.isActive = isActive;
		Gender = gender;
	}

	public static void main(String[] args) {
//         create an object 
		Employee e1 = new Employee("Shazia", 44);
//		Get the value of the object 
		System.out.println(e1.name + " " + e1.Age);

//      create an object
		Employee e2 = new Employee("Tim", 38, "01-01-2001", 44.55);
		// Get Value of the object
		System.out
				.println(e2.name + " is " + e2.Age + " years old; DOB is; " + e2.DOB + "  and income is " + e2.Salary);

//		      change Value of Age 

		e2.Age = 39;
		System.out.println(e2.name + "  " + e2.Age + " " + e2.DOB + " " + e2.Salary);

	}
}











































