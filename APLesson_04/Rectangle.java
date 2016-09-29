import java.util.Scanner;
public class Rectangle
{
		static double l;
		static double w;
		static double p;
		
		public static void main(String[]args)
		{
				Scanner kb=new Scanner(System.in);
				System.out.println("What is the length?");
				l = kb.nextDouble();
				System.out.println("What is the width?");
				w = kb.nextDouble();
				p=calcPerim(l,w);
				System.out.printf("Your perimeter is %.5f.",calcPerim(l,w));
		}
		
		public static double calcPerim(double length, double width)
		{
			return 2*length +2*width;
			
		}
		
		
}