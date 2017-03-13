package oca;

public class ReturningValued {

	public static void main(String[] args) {

		int number = 1;
		String letters ="abc";
		number(number);
		//System.out.println(number);
		letters = letters(letters);
		//System.out.println(letters);
		System.out.println(number + letters);
	}
	
	public static int number(int number){
		number++;
		return number;
	}
	
	public static String letters(String letters){
		letters += "d";
		return letters;
	}

}
