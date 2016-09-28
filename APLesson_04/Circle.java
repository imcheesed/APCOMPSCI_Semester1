import java.util.Scanner;
public class Circle
{
	static double r;
	static double a;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is the radius?");
		r = kb.nextDouble();
		
		print();
	}
	public static double calcArea()
	{
		return radius*radius*3.14;
	}
	public static void print()
	{
		System.out.printf("The area of the circle with radius %.5f is %.5f",r,calcArea());
	}
}