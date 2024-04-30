package basics;

public class ConsC extends ConsP {
	int i;
	String str;
	boolean b;
	double d;

	public static void main(String[] args) {
		ConsC ob = new ConsC();
		ob.str = "Testing";
		System.out.println("int value of i is " + ob.i);
		System.out.println("String value of str is " + ob.str);
		System.out.println("boolean value of b is " + ob.b);
		System.out.println("double value of d is " + ob.d);
//		new ConsC(100);
//		new ConsC(100, 200);

	}

	public ConsC() {// in every class, we do have a invisible constructor
		this(100);
		
		System.out.println("1.default Constructor");
		add();

	}

	public ConsC(int i) {// in every class, we do have a invisible constructor
		this(1, 2);
		//super(999); // Constructor call must be the first statement in a constructor
		System.out.println("1.parameterized child Constructor " + i);

	}

	public ConsC(int i, int j) {// in every class, we do have a invisible constructor
		super("Automation", true);
		//this();
		System.out.println("2.parameterized  child Constructor " + i + "  " + j);

	}

	// Constructor neither return nor void
	// Constructor is non static method
	// constructor methodoverloading?yes
	// inheritance on constrcuctors? yes
	// constructor method over riding will possible?no possible

	public void sample() {
		int k;
		// System.out.println(k);
		System.out.println(i);
	}

}
