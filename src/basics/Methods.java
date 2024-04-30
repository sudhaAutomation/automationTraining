package basics;

public class Methods {
	/*
	 * 4 methods 1.without arguments with out return type 2.with arguments without
	 * return type 3.without argumnets with return type 4.with arguments and with
	 * return type
	 */

	public void sum() {// 1.without arguments with out return type
		int i = 10;
		int j = 20;
		System.out.println("summation of i and j is " + (i + j));
	}

	public void sum(int i, int j) {

		System.out.println("summation of i and j is " + (i + j));
	}

	public void sum(int i, int j, int k) {

		System.out.println("summation of i and j is " + (i + j + k));
	}

	public void sum(String name, int i, int j) {
		System.out.println("student name " + name);
		System.out.println("student marks " + (i + j));
	}
	public void sum( int i, int j,String name) {
		System.out.println("student name " + name);
		System.out.println("student marks " + (i + j));
	}
	public void sub(int i, int j) {// 2.with arguments without return type

		System.out.println("substraction of i and j is " + (i - j));
	}

	public int multiplication() {// 3.without argumnets with return type
		int i = 10;
		int j = 20;
		int k = i * j;
		System.out.println("multipliation od=f i and j is " + k);
		return k;
	}

	public String stdName(String fname, String lName) {
		// System.out.println(fname + lName);
		return fname + lName;
	}

}
