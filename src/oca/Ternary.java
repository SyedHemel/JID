package oca;

public class Ternary {

	public static void main(String[] args) {

		int x = 8, y = 6;
		
		int min = (x > y) ? y : x;
		
		int max = (x > y) ? x : y;
		
		System.out.println("min: " + min + " and max: " + max);
		
		System.out.println(isZtrue(2,1));
		
	}
	
	static boolean isZtrue(int i, int j){
			
		int z =  i+j;
		
		return z > 4 ? true : false;
		
	}

}
