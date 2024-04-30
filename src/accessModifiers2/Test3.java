package accessModifiers2;

import accessModifiers.Test1;

public class Test3 extends Test1 {
	public void sam() {
		// System.out.println("private variable " + a);
		// System.out.println("default variable " + b);// will be used only with n the
		// package
		System.out.println("protected variable " + c);
		System.out.println("public variable " + d);
		display();
	}

}
