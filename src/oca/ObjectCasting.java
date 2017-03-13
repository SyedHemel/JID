package oca;

public class ObjectCasting {

	public static void main(String[] args) {
		
		Machine m = new Machine();
		m.start();
		System.out.println();
		
		// Upcasting
		Machine m1 = new Car();
		m1.start();
		
		// Downcasting
		Machine m2 = new Car();  //Machine m2 = m1; <--- also correct
		Car c2 = (Car) m2;
		c2.run();
		c2.start();
		
		// ClassCastException ---> exception at runtime
		/*Machine m3 = new Machine();
		Car c3 = (Car) m3;
		c3.start();
		c3.run();*/

	}

}

class Machine {
	public void start(){
		System.out.println("Machine started!");
	}
}

class Car extends Machine {
	public void start(){
		System.out.println("Car started!!!");
	}
	
	public void run(){
		System.out.println("Car started running!");
	}
}
