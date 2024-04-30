package basics;

public class ConditionalStatements {

	public static void main(String[] args) {
		/*
		 * if statement if- else else if
		 */
		int i = 100;
		int j = 500;
		if (i > j) {
			System.out.println(" i is greater then j ");
		} else {
			System.out.println(" i is not greater then j ");

		}
		int marks =60;
		if (marks >= 90) {
			System.out.println("Grade A");
		} else if (marks >= 70 || marks >= 60) {
			System.out.println("Grade B");
		} else if (marks >= 36) {
			System.out.println("Grade c");
		} else if (marks < 36) {
			System.out.println("Grade F");
		}
		String course = "testing";

		switch (course) {
		case "Salesforce":
			System.out.println("Salesforce course is avaialable");
			break;
		case "Testing":
			System.out.println("Testing course is avaialable");
			break;
		case "testing":
			System.out.println("testing course is avaialable");
			break;
		case "java":
			System.out.println("java course is avaialable");
			break;
		default:
			System.out.println("your course is not available");
			break;
		}
	}

}
