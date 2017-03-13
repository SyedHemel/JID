package oca;

public class Casting {

	public static void main(String[] args) {

		long x = 10;
		int y = 5;
		
		//y = (int) (y*x);
		
		y *= x;
		
		System.out.println(y);
		
		Casting c = new Casting();
		short r = c.giveResult(2, 6);
		System.out.println("Short result: " + r);

	}
	
	short giveResult(int i, int j){
		
		short z = (short) (i+j);
		
		return z;
	}

}
