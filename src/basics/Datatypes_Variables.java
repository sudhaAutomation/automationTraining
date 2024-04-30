package basics;

public class Datatypes_Variables {// variables and methods
	static long mobileNo;
	boolean b = false;// instace variable

	public static void main(String[] args) {
		Datatypes_Variables ob = new Datatypes_Variables();// object
		mobileNo = 9876543210l;
		byte telugu = 95;
		short totalMarks = 5250;
		char ch = 'a';
		float f = 32.23f;
		double d = 78.900000;
		System.out.println(ch);
		System.out.println(telugu);
		System.out.println(totalMarks);
		System.out.println(ob.b);
		System.out.println(mobileNo);
		ob.sampleLogic();

		String address = "h.No.89,plot 897,ayyappa society,madhapur,hyderabd,telangana,500081";
		String phno = "";
		System.out.println(address);
	}

	public void sampleLogic() {
		mobileNo = 987651230l;
		System.out.println(mobileNo);
		int a = 100000;
		System.out.println(a);
		// System.out.println(b);

	}

}
