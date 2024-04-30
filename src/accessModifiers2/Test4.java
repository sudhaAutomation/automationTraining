package accessModifiers2;

import accessModifiers.Test1;

public class Test4 {

	public void samp() {
		Test1 ob = new Test1();
		// System.out.println("private variable " + ob.a);// The field Test1.a is not
		// visible
		// System.out.println("default variable " + ob.b);
	//	System.out.println("protected variable " + ob.c);// can be accessed with in the package and also in child class
		System.out.println("public variable " + ob.d);
		ob.display();
	}
	

}
