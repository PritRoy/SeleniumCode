package Week1.Day1;

public class PrintallStudentData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] studentName = {"Gayathri", "Divya", "Saran"};
		int[] age = {10,20,30};
		
		for (String values:studentName)
		{
		System.out.println(values);
		}
		for(int agelist:age)
		{
			System.out.println(agelist);
		}
		
		System.out.println(studentName);
	}

}
