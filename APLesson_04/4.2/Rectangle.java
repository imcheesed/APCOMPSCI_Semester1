import java.util.Scanner;
public class Rectangle
{
		static double l;
		static double w;
		static double perimeter;
		
		public static void main(String[]args)
		{
				Scanner kb=new Scanner(System.in);
				System.out.println("What is the length?");
				l = kb.nextDouble();
				System.out.println("What is the width?");
				w = kb.nextDouble();
				calcPerim(l,w);
				print();
				
		}
		
		public static void calcPerim(double length, double width)
		{
			perimeter = 2*length +2*width;
			
		}
		
		public static void print()
		{
			System.out.printf("Your perimeter is %.5f.",perimeter);
		}
		
		
}