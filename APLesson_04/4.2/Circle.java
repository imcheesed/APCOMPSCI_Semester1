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
		calcArea(r);
		print();
	}
	public static void calcArea(double radius)
	{
		a= radius*radius*3.14;
	}
	public static void print()
	{
		System.out.printf("The area of the circle is %.5f",a);
	}
	
}