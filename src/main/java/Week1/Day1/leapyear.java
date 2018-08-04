package Week1.Day1;

import java.util.Scanner;

public class leapyear {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;

		System.out.println("Enter the year to find whether its a leap year or not");
		Scanner scan = new Scanner(System.in);
		year=scan.nextInt();


		//using arithmetic operator, assignment operator, OR, AND
		
//		if((year%4==0)||(year%400==0) && (year%100!=0))
//		{
//
//			System.out.println("Given year" + year + "is leap year");
//		}
//
//		else
//		{
//			System.out.println("Given year" + year + "is not a leap year");
//		}

		if (year%4==0)
		{
			if(year%100!=0)
			{
				if(year%400 ==0)
				
					System.out.println("Given year" + year + "is leap year");
				else
					System.out.println("Given year" + year + "is not a leap year");
			}
			
				else
				System.out.println("Given year" + year + "is not leap year");
			}
		else
			
			System.out.println("Given year" + year + "is not a  leap year");
		}
		
		
	
	
	}

