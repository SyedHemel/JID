package oca;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class LambdaPower {

	public static void main(String[] args) {
		
		getFirstPart(z -> {String x[] = z.split("-"); 
		System.out.println(x[0]);
		return x[0];
		});
		
		List<Integer> roles = Arrays.asList(1,2,4,5,7,8,11,16);
		
		System.out.println("Printing evens from the list of numbers: ");
		printEvens(roles, p -> p%2==0);

	}
	
	public static void getFirstPart(SplitIt sp){
		sp.splitStr("Hi-There!"); 
	}
	
	public static void printEvens(List<Integer> nums, Predicate<Integer> pn){
	 	for(Integer n : nums){
	 		if(pn.test(n)){
	 			System.out.println(n);
	 		}
	 	}
	}
	
	interface SplitIt {
		String splitStr(String s);
	}
	

}
