import java.util.Scanner;
public class Rectangle
{
		static double l;
		static double w;
		
		public static void main(String[]args)
		{
				Scanner kb=new Scanner(System.in);
				System.out.println("What is the length?");
				l = kb.nextDouble();
				System.out.println("What is the width?");
				w = kb.nextDouble();
				
				print();
		}
		
		public static double calcPerim()
		{
			return 2*length +2*width;
			
		}
		
		public static void print()
		{
			System.out.printf("The perimeter of the rectangle is %.5f.",calcPerim());
		}
}