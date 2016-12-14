import java.util.Scanner;

public class GameGun2
{
	static String[] health;
	static int healthload=6;
	static int healthcount;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		String turn = "";
		int damage=0;
		int amount=0;
		
		healthcount=6;
		health= new String[healthload];
		
		while(!turn.equals("Q") && healthcount>0)
		{
			System.out.println("Your turn. Hit enter when ready");
			turn=kb.next();
			damage=(int)(Math.random()*2)+1;
			amount=(int)(Math.random()*6)+1;
			takeD(amount,damage);
		}
		printClip();
	}
	public static String takeD(int amount, int damage)
	{
		if(damage==1)
		{
			healthcount=healthcount-amount;
			return "Taking " + amount + " damage";
		}
		else	
		{
			if(healthcount+amount<healthload)
				healthcount=healthcount+amount;
			else
				healthcount=healthload;
			return "Power up " + amount;
		}
	}
	public static void printClip()
	{
		String output = "Health" + "\t";
		for(int i=0;i<healthcount;i++)
		{
			if(i<healthcount)
				health[i]=" @ ";
			else
				health[i]= "[]";
			output=output+health[i];
		}
		System.out.println(output);
	}
}