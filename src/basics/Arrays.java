package basics;

public class Arrays {

	public static void main(String[] args) {
		int i = 100;
		// System.out.println(i);
		i = 79;
		// System.out.println(i);
		int marks[] = new int[6];
		marks[0] = 100;
		marks[1] = 90;
		marks[2] = 78;
		marks[3] = 80;
		marks[4] = 90;
		marks[5] = 98;
		//marks[6] = 79;

		System.out.println(marks.length);// 6
		for (int j = 0; j < marks.length; j++) {
			System.out.println(marks[j]);
		}

		System.out.println("multi dimensional array");
		String data[][] = new String[4][3];
		data[0][0] = "Branch name";
		data[0][1] = "Manager name";
		data[0][2] = "Salary";
		
		data[1][0] = "Madhapur";
		data[1][1] = "Subbu";
		data[1][2] = "30k";
		
		data[2][0] = "Gachibowli";
		data[2][1] = "Suma";
		data[2][2] = "50k";
		
		data[3][0] = "Kukatpally";
		data[3][1] = "Raju";
		data[3][2] = "45k";
		System.out.println(data.length);//4
		System.out.println(data[0].length);//3
		
		for (int j = 0; j < data.length; j++) {
			for (int k = 0; k < data[0].length; k++) {
				System.out.print(data[j][k]+"    ");
			}
			System.out.println();
		}
		
	Object stdDetails[][]=new Object[7][2];
	stdDetails[0][0]="name";
	stdDetails[0][1]="Raju";
	
	stdDetails[1][0]="Hallticket No.";
	stdDetails[1][1]="24Ue1A890";
	
	stdDetails[2][0]="mob No.";
	stdDetails[2][1]=9876543210l;
	
	stdDetails[3][0]="GPA";
	stdDetails[3][1]=9.8;
	
	stdDetails[4][0]="Address";
	stdDetails[4][1]="H.No.3.90,madhapur,telangana,pin-code 50081";
	
	stdDetails[5][0]="boold group";
	stdDetails[5][1]='O';
	
	stdDetails[6][0]="confirm";
	stdDetails[6][1]=true;
	System.out.println("Object array");
	System.out.println(stdDetails.length);
	System.out.println(stdDetails[0].length);
	
	for (int j = 0; j < stdDetails.length; j++) {
			for (int K = 0; K < stdDetails[0].length; K++) {
				System.out.print(stdDetails[j][K]+"      ");
		}
			System.out.println();
	}
	
	
	

	}

}
