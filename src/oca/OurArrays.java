package oca;

public class OurArrays {

	static int e_;

	static public void main(String[] x) {

		// playWithArrays();
		/* Exceptions ---->>>
		 * arraysPwr(); main();
		 */
		(new OurArrays()).checkIT();
		
		OurArrays.main();
		
	}

	static public void main() {
		System.out.println("In the other main... ;-)");
		arraysPwr();

	}

	public void checkIT() {
		System.out.println("Checking 'this' keyword ... ");
		this.main(); //The static method main() from the type OurArrays should be accessed in a static way
		this.playWithArrays(); //This way of calling is permissible, but not recommended
		playWithArrays();
	}

	public static void playWithArrays() {
		main();
		// int[] myArr = new int[7];
		int[] myArr = new int[] { 1, 2, 6, 8 };

		// System.out.println("Array : " + myArr[2]);

		byte herArr[] = new byte[] { 5, 4, 6, 9 };

		for (byte b = 0; b <= herArr.length; b++) {
			System.out.println("All elements: " + herArr[b]);
		}

		byte hisArr[] = new byte[8];
		hisArr[0] = 5;
		hisArr[2] = 127;
		hisArr[3] = 123;

	}

	static void objRefArr() {
		Student[] students = new Student[2];
		students[0].name = "Maka";
		students[1].name = "Paka";
		students[0].ID = 11;
		students[1].ID = 15;
	}

	public static void arraysPwr() {
		
		System.out.println("\nInside arraysPwr ...");
		int myArr[] = new int[] { 3, 5, 6, 8, 9 };
		System.out.println("Lenght: " + myArr.length);
		System.out.println("Upper bound value: " + myArr[myArr.length - 1]);
		System.out.println("Continues ... ...");
		return;
		
	}

}
