package accessModifiers;

public class Test1 {
	/*
	 * 1.private 2.default 3.protected 4.public
	 * 
	 */
	private int a;
	int b;
	protected int c;
	public int d;

	public void display() {
		System.out.println("private variable " + a);
		System.out.println("default variable " + b);
		System.out.println("protected variable " + c);
		System.out.println("public variable " + d);
	}

}
