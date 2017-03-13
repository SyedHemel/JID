package diffpack;

import oca.MethodAndPackageAccess;

public class ChildClassMP extends MethodAndPackageAccess {

	public static void main(String[] args) {
		xGo();
		
		ChildClassMP cmp = new ChildClassMP();
		cmp.yGo();
		System.out.println("y is: " + cmp.y);
	}

}
