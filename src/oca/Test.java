package oca;

public class Test {

	public static void main(String[] args) {
		/*String[] argh = {"X","Y"};
		args=argh;*/
		
		ifEven(10);
		
		/*for (int i=0; i<args.length; i++){
			System.out.println("Readable from command line");
			System.out.println(args[i]);
		}
		
		subNums(1,-0.5, 2, 3);
		
		Test t = Test.addNums(2,3);
		System.out.println("Test t: " + t);
		
		String s = "Hello";
		s = s + " World";
		s = s.concat("!");
		System.out.println(s);
	}
	
	public static Test addNums(int a, int b){
		System.out.println("Result is : " + (a+b));	
		return null;
	} 
	
	public static void subNums(Object a, Object... b){
		System.out.println(a);
		
		for(Object ob:b){
		System.out.println(ob);
		} */
	}
	
	public static boolean ifEven(int iN){
		boolean isEven = ((iN % 2)==0);
		System.out.println(isEven);
		return isEven;
	}

}
