package Week1.Day1;

public class SwappingTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10, b=2; 

		//by using the third variable

		//	int	temp=a;
		//		a=b;
		//		b=temp;
		//		System.out.println("value of a is" +a);
		//		System.out.println("value of b i" +b);

		//Without using the third variable

		a=a+b; //10+20 = 30
		b=a-b; // 30-20 = 10
		a=a-b; // 30-10=20
		System.out.println("value of a is" +a);

		System.out.println("value of b is" +b);



	}

}
