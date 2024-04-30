package basics;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1.arthematic operators...+,-,/,%,*,++,-- 2.relational
		 * operators..>,<,>=,<=,!=,==
		 */
		int i = 1000;
		int j = 500;

		System.out.println(i / j);// 2
		System.out.println(i % j);// 0
		//i++;//i=i+1;
		//i=i+2;

		System.out.println(i);
		j--;//j=j-1;
		System.out.println(j);
		
		System.out.println(i>j);//true
		System.out.println(i<j);//false
		System.out.println(i>=j);//true
		System.out.println(i<=j);//false
		System.out.println(i==j);//false
		System.out.println(i!=j);//true
		
		System.out.println((i > j) ? i :j);

	}
	
	

}
