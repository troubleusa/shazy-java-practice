package Assignment;

public class Person {

	String name;
	int age;
	char gender;
	double height;
	
	
	
	
	
	
	public Person(String name, int age, char gender, double height) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.height = height;
	}






	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Person e1 = new Person("shazia", 44,('f'), 9.5);
      System.out.println( e1.name+ " " + e1.age + " "+ e1.gender + " "+ e1.height);
      
      
      Person e2 = new Person("Tim", 38,('M'), 6.7);
      System.out.println( e2.name+ " " + e2.age + " "+ e2.gender + " "+ e2.height);
      
      
	}

}
