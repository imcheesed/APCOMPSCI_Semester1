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
		sa = calcSurf(s);
		System.out.printf("The surface area of the cube is %.5f.",calcSurf(s));
	}
	public static double calcSurf(double side)
	{
		return 6*side*side;
	}
	
}