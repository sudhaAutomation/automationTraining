package inheritance;

public class Car implements DemoIf, DemoB {
	static String colour;
	String model;
	final int price = 300000;

	public static void main(String[] args) {
		Car c = new Car();
		c.colour = "Grey";
		System.out.println(c.colour);

		c.CarWithconnectGmaps();
		c.sampleTest();
		c.sum(2, 5);
		c.multi(5, 5);
		// c.assembleBody();
		// c.CarEngine();
		// c.TestDrive();
		// c.sunRoof();
	}

	 public void TestDrive() {
	 System.out.println("Car is Ready to drive");
	 }
	
	 public void assembleBody() {
	 System.out.println("Car Body Implemented");
	 }
	
	 public void CarEngine() {
	 System.out.println("Car Engine is implement with Yokahama");
	 }
	
	 public void sunRoof() {
	 System.out.println("Car is with SunRoof");
	 }

	@Override
	public void sampleTest() {
		System.out.println("Sample test is succes with IoT");
	}

	public void CarWithconnectGmaps() {
		System.out.println("car is implementd with connected Gmaps");

	}

	@Override
	public void sum(int i, int j) {
		System.out.println("this is  from DEmoIF inteface");
		System.out.println("summation of i and j is " + (i + j));

	}

	@Override
	public void multi(int i, int j) {
		System.out.println("implemented in Car Class");
		System.out.println("multiplication of i an j is " + (i * j));

	}

}
