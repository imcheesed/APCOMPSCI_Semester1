import java.util.Scanner;
public class Ex_04
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		Ex_04 Box = new Ex_04();
		
		System.out.println("What is the length of the box in inches?");
		double length = kb.nextDouble();
		System.out.println("What is the width of the box in inches?");
		double width = kb.nextDouble();
		System.out.println("What is the height of the box in inches?");
		double height = kb.nextDouble();
		
		
		System.out.printf("The volume in cubic feet is %.3f.",Box.calcVol(length, width, height));
		
		
	}
	
	public double calcVol(double h, double w, double l)
	{
		return h*l*w/1728;
	}
}