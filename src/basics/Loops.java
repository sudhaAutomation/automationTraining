package basics;

public class Loops {

	public static void main(String[] args) {
		System.out.println("Hello 1");
		System.out.println("Hello 2");
		System.out.println("Hello 3");
		System.out.println("Hello 4");
		System.out.println("Hello 5");
		/*
		 * 1.while loop 2. do while loop 3.for loop
		 */

		System.out.println("while loop output");
		int i = 1;// initialisation
		while (i <= 10) {
			System.out.println("Hello " + i);
			i++;
		}

		System.out.println("do while loop output");
		int j = 1;// initialisation
		do {
			System.out.println("Hello " + j);
			j++;
		} while (j <= 10);
		System.out.println("for loop output");
		for (int k = 0; k <= 10; k++) {
			System.out.println("Hello " + k);
		}

	}

}
