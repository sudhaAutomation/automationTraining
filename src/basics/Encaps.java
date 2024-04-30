package basics;

public class Encaps {//pojo..plain old java object

	private String username;
	private Object password;
	private String OTP;

	public String getOTP() {
		return OTP;
	}

	public void setOTP(String oTP) {
		OTP = oTP;
	}

	public void setUserName(String uname) {
		username = uname;
	}

	public String getUsername() {
		return username;
	}

	public void setpassword(Object pword) {
		password = pword;
	}

	public Object getPassword() {
		return password;

	}

}
