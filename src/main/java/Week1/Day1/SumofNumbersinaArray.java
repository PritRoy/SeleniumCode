package Week1.Day1;

//import java.util.Scanner;

public class SumofNumbersinaArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5};
		int sum=0;
		int i;

		//System.out.println("Enter the 5 numbers to be sum up");
		//Scanner scr= new Scanner(System.in);
		//int number1 =scr.nextInt();
		//int number2 =scr.nextInt();
		//int number3 =scr.nextInt();
		//int number4 =scr.nextInt();
		//int number5 =scr.nextInt();
		for(i=0;i<a.length;i++)
			sum=sum+a[i];
		

		
		System.out.println("sum of numbers are"+sum);
	}
}