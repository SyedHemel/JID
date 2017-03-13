package oca;

import java.io.PrintWriter;

public class Exceptions {

	public final strictfp synchronized static void main(String[] args) {
		
	//	doStuff();
		System.out.println("Back to main");
	//	m1();
		/*PrintWriter pw = new PrintWriter("abc.txt");
		pw.println("Hello");*/
		// Thread.sleep(3000);

	}

	private static void m1() {
		// TODO Auto-generated method stub
		System.out.println("Generating StackOverflowError!");
		System.out.println("In m1");
		m2();
	}

	private static void m2() {
		// TODO Auto-generated method stub
		System.out.println("In m2");
		m1();
	}

	private static void doStuff() {
		
		try{
			doMoreStuff();
		}
		catch(ArithmeticException e){
			System.out.println("Take care! " + e.fillInStackTrace());
		}
		System.out.println("Continuing");
		
	}

	private static void doMoreStuff() {
		
		System.out.println(10/0);
		
	}

}
