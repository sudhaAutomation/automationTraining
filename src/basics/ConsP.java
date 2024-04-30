package basics;

public class ConsP {
	public ConsP() {
		System.out.println("1.Parent Default Constructor");
	}

	public ConsP(int i) {
		System.out.println("1.arg Parent Constructor " + i);
	}

	public ConsP(String s, boolean b) {
		this(100);
		System.out.println("2.Parameterized Parent Constructor " + s + "  " + b);
	}

	public void add() {
		System.out.println("add method of parent class");
	}

}
