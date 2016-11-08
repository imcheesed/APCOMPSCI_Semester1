import java.util.Scanner;
public class Average_3
{
	static double num1, num2, num3, average;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is the first number?");
		num1 = kb.nextDouble();
		System.out.println("What is the second number?");
		num2 = kb.nextDouble();
		System.out.println("What is the third number?");
		num3 = kb.nextDouble();
		average = average(num1,num2,num3);
		print(num1,num2,num3,average);
		
	}
	public static double average(double num1, double num2, double num3)
	{
		return (num1 + num2 + num3)/3;
	}
	public static void print(double num1, double num2, double num3, double average)
	{
		System.out.printf("The average of %.5f, %.5f, and %.5f is %.5f",num1, num2, num3, average);
	}
	
	
}