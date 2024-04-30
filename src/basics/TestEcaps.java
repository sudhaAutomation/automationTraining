package basics;

public class TestEcaps {

	public static void main(String[] args) {
		Encaps obj = new Encaps();
		obj.setUserName("admin@admin.com");
		obj.setpassword(1234567);
		System.out.println(obj.getUsername());
		System.out.println(obj.getPassword());
		obj.setOTP("23456");
		System.out.println(obj.getOTP());

	}

}
