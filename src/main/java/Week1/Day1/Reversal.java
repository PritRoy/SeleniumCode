package Week1.Day1;

import java.util.Scanner;

public class Reversal {
	
	//A method for Reversinganumber
	
	public static void Reversinganumber(int number)
	{
		 if (number < 10) {
			   System.out.println(number);
			   return;
		       }
		       else {
		           System.out.print(number % 10);
		           //Method is calling itself: recursion
		           Reversinganumber(number/10);
		       }
		   
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.out.println("Enter the number");
		Scanner scan = new Scanner(System.in);
		int numberreverseoutput = scan.nextInt();
		{
			
			Reversinganumber(numberreverseoutput);
		   }
		
		
		
	}

}
