package diffpack;
// Test or understand lambda expressions
interface Greeting{
	void sayHello(String name);
}

public class GreetingExample /*implements Greeting*/{

	public static void main(String[] args) {
		 /*Greeting gIr = name -> System.out.println("Hello " + name + "!!");
		 greet(gIr,"Syed");	*/	
		greet(n -> System.out.println("Hello " + n + "!!"), "Syed");
	}
	
	interface LengthLam {
		int getLen(String x);
	}
	
	class InsideClass {
		String getName(String n){
			System.out.println("name is "+n);
			return n;
		}
	}
	
	 /*public void sayHello(String name){
		 System.out.println("Hello " + name + "!!");
	 }*/

	private static void greet(Greeting gI, String name){
		gI.sayHello(name);
	}
}
