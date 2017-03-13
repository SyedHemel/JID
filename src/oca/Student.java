package oca;

public class Student {

	public static String name;
	public static String section;
	public static int ID;
	
	static void Level(){
		ID = 0;
		if(ID !=100){
			System.out.println("Upper");
		}else{
			System.out.println("Lower");
		}
	}
	
	public static String Result (String R){
		
		System.out.println("Result is : " + R);
		return R;
		
	}

}
