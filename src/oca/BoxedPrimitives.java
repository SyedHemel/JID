package oca;

/**
 * 
 * @author Syed Boxed Primitives are also called 'Wrapper Classes' They are used
 *         to convert primitives into objects
 * 
 */

public class BoxedPrimitives {
	
	int x, y;
	
	static int z=8;
	
	void instMethod(){
		System.out.println("Inside instance method");
	}
	
	static void staticMethod(){
		System.out.println("Inside static method");
	}

	public static void main(String[] args) {
		
		BoxedPrimitives bp = new BoxedPrimitives();
		
		bp.instMethod();
		bp.staticMethod();  //Permitted, but static method should be accessed in a static way - like the following
		
		staticMethod();  //Recommended way to call static methods inside a static method like the 'main' method
		
		System.out.println(bp.y +" "+bp.z); // Permissible, but static field should be accessed in a static way
		
		System.out.println(BoxedPrimitives.z);  //Recommended way to access static fields inside a static method like the 'main' method

		int k = 10;

		int a = 0, b = 1, c = 2;

		Integer[] arr = new Integer[] { a, b, c };

		// Integer i = new Integer(k);

		Integer i = Integer.valueOf(k); // Static 'valueOf' method can be used
										// for better performance
		// int i = Integer.parseInt("25");
		System.out.println(i.SIZE);

		System.out.println(i + k);

		String bx = Integer.toBinaryString(42);
		// System.out.println(b);

		int[] list1 = getRandomArray(3);
 
	}

	private static int[] getRandomArray(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
