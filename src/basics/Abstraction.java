package basics;

public abstract class Abstraction {
	int i;

	public abstract void login();

	public abstract void register();

	public void createAccount() {
		System.out.println("login method implementd in abstarct class");
	} // abstract method

}
