import java.util.Scanner;
public class Lab_03_EX_02
{
	public static void main(String[]args)
	{
		Scanner kb=new Scanner(System.in);
		System.out.println("What is your weight? (In pounds)");
		double weight = kb.nextDouble();
		System.out.println("What is your height? (In inches)");
		double height = kb.nextDouble();
		double height2 = height*height;
		double bmi = 703*weight/height2;
		System.out.println("Your bmi is "+bmi+".");
		
	}
}