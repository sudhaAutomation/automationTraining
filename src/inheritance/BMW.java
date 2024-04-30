package inheritance;

public class BMW extends Car {

	public static void main(String[] args) {
		BMW b = new BMW();
		b.colour = "Blue";
		b.model = "BM123";
		//b.price = 2500000;
		System.out.println(b.colour);
		System.out.println(b.model);
		System.out.println(b.price);
		b.assembleBody();
		b.CarEngine();
		b.TestDrive();
		b.sunRoof();
	}

	public void sunRoof() {
		System.out.println("BMW is with SunRoof");
	}

}
