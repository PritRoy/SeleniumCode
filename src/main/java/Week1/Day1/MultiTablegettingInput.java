package Week1.Day1;

import java.io.InputStream;
import java.util.Scanner;

public class MultiTablegettingInput {
	
	/*Pseudocode
	
	1. Declare variables
	2.Get the 2 inputs from user. one for tablenumber and the other for nth value -- SCanner statement
	3.Use for loop*/
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declaring the variable
		int tableno;
		int n,i;
		//Scanner statement to get the input value
		System.out.println("Enter the table no to be printed");
		Scanner scan = new Scanner(System.in);
		tableno=scan.nextInt();
		System.out.println("Enter the nth value");
		n=scan.nextInt();
		
		//For loop to print the multiplication table by getting the table no and nth value from the use
		for(tableno=1;tableno<=n;tableno++)
{
			i=tableno*n;
			System.out.println(tableno + " * " + n  + " = " + (tableno*n));
}
}

	}



	

