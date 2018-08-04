package Week1.Day1;
import java.util.Arrays;
import java.util.Collections;


public class Ascending {

	public static void main(String[] args) {
		
		int a[]= {100,78,9,8,93};
		
		System.out.println("Enter the numbers to sort");
		for(int number1 :a)
		{
		System.out.println(number1);
		}
		Arrays.sort(a);
		System.out.println("Ascending number is");
		for(int number1 :a)
		{
		System.out.println(number1);
		}
	//	Arrays.sort(a, Collections.reverseOrder());
		System.out.println("Descending number sort is");
		for(int number1 :a)
		{
		System.out.println(number1);
		}
		// TODO Auto-generated method stub
		
		/*int n, temp;
		//scanner class object creation
		Scanner s = new Scanner(System.in);

		//input total number of elements to be read
		System.out.print("Enter the elements you want : ");
		n = s.nextInt();

		//integer array object
				int a[] = new int[n];

				//read elements 
				System.out.println("Enter all the elements:");
				for (int i = 0; i < n; i++) 
				{
					a[i] = s.nextInt();
				}

				//sorting elements
				for (int i = 0; i < n; i++) 
					Arrays.sort(a);
				{
					for (int j = i + 1; j < n; j++) 
					{
						if (a[i] > a[j]) 
						{
							temp = a[i];
							a[i] = a[j];
							a[j] = temp;
						}
					}
				}

				//print sorted elements 		
				System.out.println("Ascending Order:");
				for (int i = 0; i < n ; i++) 
				{
					System.out.println(a[i]);
				} */
	}


	}


