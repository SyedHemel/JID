package oca;

import java.util.ArrayList;
import java.util.function.Predicate;

interface TestLx {
	int result(int x, int y, int z);
}

public class Lambdas {

	public static void main(String[] args) {
		
		/*MyNumber num1 = () -> 9; 
		MyNumber num2 = () -> { return 5; }; 
		System.out.println(num1.getValue()); //prints 9 
		System.out.println(num2.getValue());*/ //prints 5 - See more at: http://www.whizlabs.com/blog/ocajp-8-lambda-expressions/#sthash.x46uXR1g.dpuf
		
/*		Predicate<String> start = s -> s.startsWith("O"); 
		System.out.println(start.test("OCAJP8"));*/
		
		/*Predicate<String> str = x -> x.endsWith("d");
		System.out.println(str.test("End"));
		*/
		/*TestLx r = (m,n,q) -> 4*m+3*n-2*q;
			
		System.out.println(r.result(2, 4, 1));
		
		if(r.result(2, 4, 1)%2==0){
			System.out.println("Even");
			}else{
				System.out.println("Odd");
			}*/
		
		say(p -> p.endsWith("e"), "One");
		
		ArrayList<String> al = new ArrayList<>();
		al.add("Good man");
		al.add("Okay man");
		al.add("bad Man");
		
		al.removeIf(s -> s.charAt(0)!='b');
		
	}
	
	public static void say(Predicate<String> m, String n){
		boolean b = m.test(n)?true:false;
		System.out.println(b);
	}

}

interface MyNumber { int getValue(); }
