package oca;

public class DataTypes {

	public static void main(String[] args) {
		
	//	primitives();
		
		int i = 5;
		int j = 6;
		
		System.out.println("i & j: " + i + " & " + j);
		
		swap(i,j);
		
		System.out.println("i & j: " + i + " & " + j);
		//System.out.println(j);
	
	}
	
	public static void swap(int a, int b){
		int tmp = a;
		a=b;
		b = tmp;
		System.out.println("a & b: " + a + " & " + b);
	}

	static void primitives() {
		
		System.out.println("\nInside primitives ...");
		int intHex = 0x0041;
		System.out.println("intHex: " + intHex);
		
		char charA = 'A';
		System.out.println("charA: " + charA);
		char charInt = 65;
		System.out.println("charInt: " + charInt);
		
		int intUnderscore = 1_22_632;
		System.out.println("intUnderscore: " + intUnderscore);

	}
}
