import java.util.Scanner;
public class Adventure
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Do you want to get out of bed? (Yes or No)");
		String choice1 = kb.next();
		if (choice1.equals("Yes"))
		{
			System.out.println("Would you like to..."+
								"\n 1. Go to the bathroom"+
								"\n 2. Go to the kitchen");
			int choice2 = kb.nextInt();
			if (choice2 == 1)
			{
				System.out.println("What would you like to do first?"+
									"\n 1. Brush your teeth"+
									"\n 2. Take a shower");
				int choice3 = kb.nextInt();
				if (choice3 == 1)
				{
					System.out.println("Too tired to pay attention to brush your teeth, you accidentally shove the toothbrush too far into your throat and suffocate. You die. THE END.");
				}
				else
				{
					System.out.println("You are too tired to pay attention to notice a soap bar on the shower floor. Slipping on the soap bar, you fall and hit your head. You die. THE END.");
				}
			}
			else
			{
				System.out.println("What would you like to eat for breakfast?"+
									"\n 1. Cereal"+
									"\n 2. Eggs");
				int choice4 = kb.nextInt();
				if (choice4 == 1)
				{
					System.out.println("You are too tired to eat cereal properly, and choke on a Cheerio. You suffocate and die. THE END.");
				}
				else
				{
					System.out.println("You are too tired to realize you are allergic to eggs. You die due to an allergic reaction. THE END.");
				}
			}
		}
		
		else
		{
			System.out.println("You go back to sleep for another hour."+
								"\nYou wake up late. What do you do?"+
								"\n 1. Eat and run to school without showering"+
								"\n 2. Shower and run to school without eating");
			int choice5 = kb.nextInt();
			if (choice5 == 2)
			{
				System.out.println("What do you quickly grab to eat on your way out?"+
									"\n 1. Cereal"+
									"\n 2. Banana");
				int choice6 = kb.nextInt();
				if (choice6 == 1)
				{
					System.out.println("You eat too quickly, and choke on a Cheerio. You suffocate and die. THE END.");
				}
				else
				{
					System.out.println("You eat too quickly and choke on the banana. You suffocate and die. THE END.");
				}
			}
			else
			{
				System.out.println("You have to either shower quickly or run fast to school. What do you do?"+
									"\n 1. Shower fast"+
									"\n 2. Run fast");
				int choice7 = kb.nextInt();
				if (choice7 == 1)
				{
					System.out.println("You jump into the shower and take the fastest shower ever. But you don't dry yourself enough and freeze in the cold weather outside. You die of hypothermia. THE END.");
				}
				else
				{
					System.out.println("Running as fast as you can, your body runs out of energy because you didn't eat. You die of exhaustion. THE END.");
				}
			}
		}	
	}
	
}