package basics;

public class AbstrcationTest extends Abstraction {

	public static void main(String[] args) {
		AbstrcationTest ab = new AbstrcationTest();
		ab.createAccount();
		ab.register();
		ab.login();
	}

	@Override
	public void login() {
		System.out.println("login method should be implemented");

	}

	@Override
	public void register() {
		System.out.println("register methoid should be implemented here");

	}

}
