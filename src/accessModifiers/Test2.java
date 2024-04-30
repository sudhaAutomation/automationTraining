package accessModifiers;

public class Test2 {

	public void sample() {
		Test1 ob = new Test1();
		//System.out.println("private variable " + ob.a);//The field Test1.a is not visible
		System.out.println("default variable " + ob.b);
		System.out.println("protected variable " + ob.c);
		System.out.println("public variable " + ob.d);
		ob.display();
	}

}
