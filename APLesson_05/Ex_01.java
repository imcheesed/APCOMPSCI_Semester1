import java.util.Random;
public class Ex_01
{
	static int roll1, roll2;
	
	public static void main(String[]args)
	{
		Random rand = new Random();
		roll1 = (rand.nextInt(6)+1);
		roll2 = (rand.nextInt(6)+1);
		
		System.out.println("Player rolled a "+ roll1 +".");
		System.out.println("Computer rolled a " + roll2 + ".");
		
		System.out.println("The winner is " + rollDice() + ".");
	}

	public static String rollDice()
	{
		String winner = ("");
		if(roll1>roll2)
			winner = "Player";
		if(roll1<roll2)
			winner = "Computer";
		if(roll1==roll2)
			winner = "nobody; it is a tie";
        return winner;
	}
}