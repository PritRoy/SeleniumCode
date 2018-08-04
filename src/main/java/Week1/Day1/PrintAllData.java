package Week1.Day1;

import java.util.Scanner;

public class PrintAllData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] studentName = {"Smith", "Lee", "Jim"};
		int[] age = {20,22,23};	
		char[] [] grade ={ {'A','B','C'},
						{'B','B','C'},
						{'A','A','A'}};
		System.out.println("Which person data you want");
		Scanner scr= new Scanner(System.in);
		int input= scr.nextInt();
		input=input-1;
		System.out.println("name of the person is" +studentName[input]
				+"whose age is" +age[input]
				+"scored grades as" +grade[input][0] + ","
						+grade[input][1] + ","
						+grade[input][2] + ",");
						
		
		
	}

}
