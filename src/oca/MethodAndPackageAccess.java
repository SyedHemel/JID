package oca;

public class MethodAndPackageAccess {
	
	public static void main(String[] args) {		
		// xGo();	
		 System.out.println("Direct static x: " + x);
		 System.out.println("Through class, static x: " + MethodAndPackageAccess.x);
		 System.out.println("Without reference, non-static y: " + new MethodAndPackageAccess().y);
		 MethodAndPackageAccess mpa = new MethodAndPackageAccess();
		 System.out.println("With reference, non-static y: " + mpa.y);
	}
	
	protected static int x = 112;
	protected int y = 114;
	protected static void xGo(){
		System.out.println(x);
	}
	
	protected void yGo(){
		System.out.println(y + " is going!");
	}
	
	{System.out.println("Inside non-static initializer block!");}
	
	static {System.out.println("Inside static initializer block!!");}
	
}

