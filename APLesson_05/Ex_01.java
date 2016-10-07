import java.util.Random;
public class Ex_01
{
	static int roll1, roll2;
	public static void main(String[]args)
	{
		Random rand = new Random();
		System.out.println("Player, roll the dice.");
		roll1 = (rand.nextInt(6)+1);
		System.out.println("Computer roll the dice.");
		roll2 = (rand.nextInt(6)+1);
		
		System.out.println("Player rolled a "+ roll1 +".");
		System.out.println("Computer rolled a " + roll2 + ".");
		
		System.out.println("The winner is " + rollDice() + ".");
	}

	public static String rollDice()
	{
		String s = ("");
		if(roll1>roll2)
		{
			s = "Player";
		}
			
		if(roll1<roll2)
		{
			s = "Computer";
		}
		
		if(roll1==roll2)
		{
			s = "nobody";
		}
        return s;
	}
}