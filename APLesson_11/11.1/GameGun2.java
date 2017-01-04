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
			amount=(int)(Math.random()*3)+1;
			System.out.println(takeD(damage,amount));
			printClip();
		}
		System.out.println("You have died");
	}
	public static String takeD(int d, int a)
	{
		if(d==1)
		{
			healthcount-=a;
			return "Taking " + a + " damage";
		}
		else	
		{
			if((healthcount+a)<healthload)
				healthcount+=a;
			else
				healthcount=healthload;
			return ("Power up " + a);
		}
	}
	public static void printClip()
	{
		String output = "Health" + "\t";
		for(int i=0;i<healthcount;i++)
		{
			if(i<healthcount)
				health[i]="[ ] ";
			else
				health[i]= "[x]";
			output+= health[i];
		}
		System.out.println(output);
	}
}