package oca;

public class StringManipulation {
	
	static int countAx;
	int roleNum;

	static void stringConcat() {
		String s = "Hello " + "World!";
		System.out.println("s: " + s);
		
		StringManipulation sm = new StringManipulation();
		sm.countAx =2022;
		System.out.println(sm.countAx);
		System.out.println(countAx);

		// StringBuffer sb = new StringBuffer(s);
		StringBuilder sb = new StringBuilder(s);

		sb.append(" Good").append(" Morning!!");
		System.out.println("sb: " + sb.toString());
		System.out.println("sb.length: " + sb.length());
		sb.delete(1, 5);
		System.out.println("sb: " + sb.toString());
		System.out.println("sb.length: " + sb.length());
		sb.insert(1, "ey");
		System.out.println("sb: " + sb.toString());
		System.out.println("sb.length: " + sb.length());
	}

	public static void main(String[] args) {

		// strintPool();
		// immuteStrings();
		stringConcat();

	}

	static void strintPool() {

		System.out.println(
				"All string literals are stored in String-Pool. Using 'intern()' method, strings inside heap but outside pool can be brought inside pool.");

		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = new String("Hello");
		String s4 = s3.intern();
		String s5 = "Hello".intern();
		String s6 = "lo";
		final String s7 = "lo";

		System.out.println("\ns1==s2: " + (s1 == s2));
		System.out.println("s1==s3: " + (s1 == s3));
		System.out.println("s1==s4: " + (s1 == s4));
		System.out.println("s1==s5.intern(): " + (s1 == s5.intern()));
		System.out.println("s1== \"Hel\" + \"lo\": " + (s1 == "Hel" + "lo"));
		System.out.println("s1== \"Hel\" + s6: " + (s1 == "Hel" + s6));
		System.out.println("s1== \"Hel\" + s7: " + (s1 == "Hel" + s7));

	}

	static void immuteStrings() {

		int i = 5;
		i = 6;
		String s0 = "Hello";
		String s1 = "Hello";
		s1 = "World";
		System.out.println(i);
		System.out.println(s1);
		System.out.println(s0);
	}

}
