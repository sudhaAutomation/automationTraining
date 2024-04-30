package inheritance;

public class Audi extends Car {

	public static void main(String[] args) {
		Car b = new Audi();// child class object can be reffred with the reference of parent class
							// reference
							// variable
		b.colour = "white";
		b.model = "AD123";
	//	b.price = 2000000;
		System.out.println(b.colour);
		System.out.println(b.model);
		System.out.println(b.price);
		b.assembleBody();
		b.CarEngine();

		b.TestDrive();
		b.sunRoof();
		// b.automaticGear();

	}

	public void TestDrive() {
		System.out.println("Audi is Ready to drive");
	}

	public void automaticGear() {
		System.out.println("Audi is with Automatic Gear System");
	}

	public void sunRoof() {
		System.out.println("Audi is with SunRoof");
	}

}
