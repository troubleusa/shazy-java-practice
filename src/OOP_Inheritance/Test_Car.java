package OOP_Inheritance;

public class Test_Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Car a= new Car();
    a.start();
	a.stop();
	a.drive();
	a.reverse();
	a.lock();
	System.out.println(a.Speed);
	
	BMW b = new BMW();
	 b.start();
	 b.stop();
	 b.lock();
	 b.refule();
	System.out.println(b.Speed);
	
    Toyota c = new Toyota();
	c.theftSafety();
	c.refule();
	c.drive();
	c.stop();
	c.lock();
	System.out.println(c.Speed);

    
}
}