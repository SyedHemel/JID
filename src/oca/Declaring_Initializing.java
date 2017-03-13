package oca;

public class Declaring_Initializing {
	
	static int i;         // ----------> Class variable (Initialized by default, as this is not local variable)
	static int j = 5, k;    // ----------> Class variables (as they are static) (Initialized by default, as this is not local variable)
	int z;   //----------------> Instance variable (Initialized by default, as this is not local variable)
	static String str;
	
	public static void main(String[] args) {

		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(str);
		
		Declaring_Initializing di = new Declaring_Initializing();
		
		System.out.println("z: " + di.z);
		
	}

}
