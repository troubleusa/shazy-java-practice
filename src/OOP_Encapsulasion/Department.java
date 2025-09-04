package OOP_Encapsulasion;

public class Department {

	

	public static void main(String[] args) {
		
		Employee e1 = new Employee();	
		e1.setName("Tom");
		e1.setAge(10);
		e1.setActive(true);
		e1.setSalary(12.44);
		System.out.println(e1.getName() + " " + e1.getAge()+ " " + e1.getSalary()+ " " + e1.isActive());
		
		
		Employee e2 = new Employee();
		e2.setName("shazia");
		e2.setAge(44);
		e2.setActive(false);
		e2.setSalary(13.44);
		System.out.println(e2.getName() + " " + e2.getAge()+ " " + e2.getSalary()+ " " + e2.isActive());
		
		  
		
		Employee e3 = new Employee();
		e2.setName("shazia");
		e2.setAge(44);
		e2.setActive(false);
		e2.setSalary(13.44);
		System.out.println(e2.getName() + " " + e2.getAge()+ " " + e2.getSalary()+ " " + e2.isActive());
				
	
}
}