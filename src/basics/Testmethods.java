package basics;

public class Testmethods {

	public static void main(String[] args) {
		Methods mt = new Methods();
		mt.sum();
		mt.sum(20, 60);
		mt.sum(12, 12, 12);
		mt.sum("Raju", 100, 89);
		mt.sum();
		mt.multiplication();
		System.out.println(mt.multiplication());
		mt.multiplication();
		mt.sub(200, 100);
		// System.out.println(mt.sub(20, 10));
		mt.sub(130, 50);
		System.out.println(mt.stdName("Sudha", "Rani"));
		mt.stdName("Padma", "Pabbu");
		mt.stdName("Pawan", "Kumar");
	}

}
