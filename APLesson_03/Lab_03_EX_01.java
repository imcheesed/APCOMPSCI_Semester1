import java.util.Scanner;
public class Lab_03_EX_01
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Hi, my name is RudeAI.");
		
		System.out.println("I'd like to ask you a few questions.");
		
		System.out.println("What is your name?");
		
		String name = keyboard.next();
		
		System.out.println("WHAT! " + name + " sounds like a terrible name.");
		
		System.out.println("How old are you, " + name + "?");
		
		int age = keyboard.nextInt();
		
		System.out.println(age + "?!?! You're basically still a baby!");
		
		System.out.println("What do you do for fun, " + name + "?");
		
		String fun = keyboard.next();
		
		System.out.println("Ew, I thought only losers " + fun + ".");
		
		System.out.println("What kind of music do you like?");
		
		String music = keyboard.next();
		
		System.out.println("You have terrible taste! Only wannabees listen to " + music + ".");
		
		System.out.println("How many siblings do you have?");
		
		int siblings = keyboard.nextInt();
		
		System.out.println(siblings + "! I hope they aren't like you.");
		
		System.out.println("What do you want to be when you grow up?");
		
		String job = keyboard.next();
		
		System.out.println("There's no way you would succeed being a " + job +".");
		
		System.out.println("So " + name + ", you're 17..." );
		
		System.out.println("You like to " + fun + " and listen to " + music +".");
		
		System.out.println("Good luck becoming a " + job +".");
		
		System.out.println("Just kidding " + name +".");
	}
}