import java.util.Scanner;
public class Lab_03_EX_03
{
	public static void main(String[]args)
	{
		Scanner kb=new Scanner(System.in);
		System.out.println("Given a right triangle with lengths of legs a and b, find the length of the hypotenuse.");
		System.out.println("What is the length of leg a?");
		double a = kb.nextDouble();
		System.out.println("What is the length of leg b?");
		double b = kb.nextDouble();
		double a2 = a*a;
		double b2 = b*b;
		double c = Math.sqrt(a*a + b*b);
		System.out.println("The length of the hypotenuse is "+c+".");
		
	}
}