package OOP_Inheritance;

public class BMW extends Car{
	//method overriding: poly+Morphism: dynamic (runtime)
	//when we have a method in the parent class and the same method in the child class:
	//1. with the same name
	//2. with the same number of parameters (with the same sequence)
	//3. with the same type of return
	//use @Override annotation for overridden methods
	
	
	int Speed = 100;
	@Override  
	public void start() {
		System.out.println("Push--Start");
	}	
	
	@Override
	public void lock() {
		System.out.println("Push--Lock");
		}
	@Override
	public void reverse() {
		System.out.println("car--reverse");
	}
	@Override
	public void stop() {
		System.out.println("car--Stop");
	}
	
}