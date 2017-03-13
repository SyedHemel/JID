package oca;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;

public class JavaAPI {
	
	
	static String name;
	int num;

	public static void main(String[] args) {	
		
	
	//	concatStrNum();
	//	immStr();
	//	strPlay();
	//	strBuilder();
	//	methodChain();
	//	ArraySort();
	//	twoDArr();
	//	localDT();
	arrTest();	
		
		
	}
	
	public static void concatStrNum(){
		String s = "1";              // s currently holds "1"
		 s += "2";                   // s currently holds "12"  (s=s+"2")
		 s += 3;                     // s currently holds "123" 's += 3' means s=s+3 
		 System.out.println(s);
	}
	
	public static void immStr(){
	String s1 = "1";
	String s2 = s1.concat("2");
	s2.concat("3");
	//System.out.println(s2);
	
	String str = "Hi";
	 str.concat(" There!");  // Here trying to add with the same string, which will not happen
//	str = str + " There!";   // Here the left hand side 'str' is different one than RHS, so here it is possible
	
//	System.out.println(str);
	
	String x = "Hello World";
	String y = " Hello World ".trim();
	
	System.out.println(x==y);
	System.out.println(x.equals(y));
	
	}
	
	public static void strPlay(){
		String str = "Nuttertools";
		
		System.out.println(str.length());
		System.out.println(str.charAt(5));
		System.out.println(str.indexOf('t',4));
		System.out.println(str.indexOf("er",8));
		System.out.println(str.substring(3, 6));
		System.out.println(str.substring(3));
		System.out.println(str.substring(6,7));
		System.out.println("\t   a b c\n".trim());
	}
	
	public static void methodChain(){
		String result = " AniMaL   ".trim().toLowerCase().replace('a', 'A');
		System.out.println(result);
		
		 String a = "abc";
		 String b = a.toUpperCase();
		 b = b.replace("B", "2").replace('C', '3');
		 System.out.println("\na=" + a);
		 System.out.println("b=" + b);
		 
	}
	
	public static void strBuilder(){
		StringBuilder sb = new StringBuilder("start");
		sb.append("+continue");
		
		System.out.println(sb);
		
		 StringBuilder a = new StringBuilder("abc");
		 StringBuilder b = a.append("de");
		 b = b.append("f").append("gh");
		 System.out.println("\na=" + a);
		 System.out.println("b=" + b);  // 'a' and 'b' both are pointing to the same object, so they both print the same thing
		
		 StringBuilder strBldr = new StringBuilder().append(1).append('c');
		 strBldr.append("-").append(true);
		 System.out.println("\n" + strBldr);
		 		 
	}
	
	public static void ArraySort(){
		int[] numbers = {1,6,4,9,3};
		Arrays.sort(numbers);
		for(int i=0;i<numbers.length;i++)
		System.out.print(numbers[i] + " ");
		System.out.println();
		
		for(int number:numbers)
			System.out.print(number + " ");
	}
	
	public static void twoDArr(){
		int[][] twoD = new int[3][2];
		for (int[] inner : twoD) {
			  for (int num : inner)
			    System.out.print(num + " ");
			   System.out.println();
			}
		
		for(int i=0; i<twoD.length; i++){
			for(int j=0; j<twoD[i].length; j++){
			System.out.print(twoD[i][j] + " ");
			System.out.println();
			}
		}	
		
	}
	
	public static void localDT(){
		LocalDateTime ldt = LocalDateTime.of(LocalDate.now(), LocalTime.now());
		System.out.println(ldt);
	}
	
	public static void arrTest(){
		int[][][] i = new int[2][][];
		System.out.println(i.length);
		int j = i.length;
	}
	

}
