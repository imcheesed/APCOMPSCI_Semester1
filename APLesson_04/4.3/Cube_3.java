import java.util.Scanner;
public class Cube_3
{
	static double s, sa;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is the length of the side of the cube?");
		s = kb.nextDouble();
		sa = calcSurf(s);
		print(s,sa);
	}
	public static double calcSurf(double s)
	{
		return 6*s*s;
	}
	public static void print(double s, double sa)
	{
		System.out.printf("The surface area of a cube whose sides are %.5f in length is %.5f.",s,sa);
	}
}