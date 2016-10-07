import java.util.Random;
import java.util.Scanner;
public class Lesson_05
{
	public static void main(String[]args)
	{
		int num=5;
		
		if (num==3)
		{
			System.out.println("num equals 3");
		}
		
		if (num==5)
		{
			System.out.println("num equals 5");
		}
		
	
		
		if(tOrf())
		{
			System.out.println("It is true!");
		}
		
		if(!tOrf())
		{
			System.out.println("It is false!");
		}
		
		
		Random rand = new Random();
		int var = rand.nextInt(4)+1;
		System.out.println(var);
		
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter number 1: ");
		int one = kb.nextInt();
		System.out.println("Enter number 2: ");
		int two = kb.nextInt();
		
		boolean even = (one + two) % 2 == 0;
		
		if (even)
			System.out.println("Your number " + (one + two) + " is even!");
		if (!even)
			System.out.println("Your number " + (one + two) + " is odd!");
		
	}
	
	public static boolean tOrf()
	{
		return 2 >= 5;
	}
}