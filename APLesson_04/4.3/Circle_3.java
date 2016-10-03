import java.util.Scanner;
public class Circle_3
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is the radius?");
		double r = kb.nextDouble();
		double a = calcArea(r);
		print(r,a);
	}
	public static double calcArea(double r)
	{
		return r*r*3.14;
	}
	public static void print(double r, double a)
	{
		System.out.printf("The area of the circle with radius of %.5f is %.5f",r,a);
	}
	
}