import java.util.Scanner;
public class Rectangle_3
{
	static double l, w;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is the length?");
		l = kb.nextDouble();
		System.out.println("What is the width?");
		w = kb.nextDouble();
		print(calcPerim(l,w));
	}
	public static double calcPerim(double l, double w)
	{
		return 2*(l+w);
	
	}
	public static void print(double perimeter)
	{
		System.out.printf("Your rectangle is %.5f ft around",perimeter); 
	}
	
	
}
