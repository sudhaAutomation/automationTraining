package basics;

public class ExceptionHandling {

	public static void main(String[] args) throws Exception {

		System.out.println("Hello");
		int i = 10;
		try {
			System.out.println(i / 0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println(e.getMessage());
		} // 2
		finally {
			System.out.println("programmer will write the closing related logic to protect the code");
		}
		System.out.println("Bye");
		int bank_balance = 2000;
		int withDrawAmount = 3000;

		if (bank_balance >= withDrawAmount) {
			System.out.println(withDrawAmount + " amount Drwan successfully");

		} else {
			//System.out.println("Insuffient Balance in your account");
			throw new Exception("Insuffient Balance in your account");
		}

	}

}
