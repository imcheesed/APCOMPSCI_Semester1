import java.util.Scanner;
public class Cube
{
	static double s;
	static double sa;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is the length of the side of the cube?");
		s = kb.nextDouble();
		calcSurf(s);
		print();
	}
	public static void calcSurf(double side)
	{
		sa= 6*side*side;
	}
	public static void print()
	{
		System.out.printf("The surface area of the cube is %.5f.",sa);
	}
	
}