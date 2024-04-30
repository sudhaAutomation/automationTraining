package inheritance;

public interface DemoIf {

	int min_bal = 2000;

	public void sum(int i, int j);

	public void sampleTest(); // Abstract methods do not specify a body

	public void CarWithconnectGmaps();

	public static void main(String[] args) {
		// new DemoIf();
		System.out.println(min_bal);
	}

}
// in deafult the varaibales in an interface are final in nature
// in an interafce we can write only abstract methods
// in an interface for the statia methids we can have the method body
// we cann't create an object for an inteface