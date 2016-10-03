import java.util.Scanner;
public class Average
{
	static double num1;
	static double num2;
	static double num3;
	static double avg;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is the first number?");
		num1 = kb.nextDouble();
		System.out.println("What is the second number?");
		num2 = kb.nextDouble();
		System.out.println("What is the third number?");
		num3 = kb.nextDouble();
		avg = average(num1,num2,num3);
		print();
		
	}
	public static double average(double one, double two, double three)
	{
		return (one + two + three)/3.0;
	}
	public static void print()
	{
		System.out.printf("The average is %.5f",average(num1,num2,num3));
	}
	
	
}