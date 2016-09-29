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
		a = calcArea(r);
		System.out.printf("The area of the circle is %.5f",calcArea(r));
	}
	public static double calcArea(double radius)
	{
		return radius*radius*3.14;
	}
	
}