package Week1.Day1;

public class BitwiseOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1 =10, number2=20;
		int andResult, andResult1,andResult2,andResult3,andResult4;
		andResult= number1|number2;
		andResult1= number1&number2;
		andResult2= ~number2;
		andResult3= number1<<number2;
		andResult4= number1>>number2;
		System.out.println(andResult);
		System.out.println(andResult1);
		System.out.println(andResult2);
		System.out.println(andResult3);
		System.out.println(andResult4);
		
		

	}

}
