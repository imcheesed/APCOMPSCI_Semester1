import java.util.Scanner;
public class GameGun
{
	static int bulletCount;
	static int clipsize=16;
	static int shotcount;
	static String[] clip;
	
	public static void main(String[]args)
	{
		Scanner kb=new Scanner(System.in);
		bulletCount=96;
		shotcount=0;
		clip=new String[clipsize];
		resetClip();
		
		while(bulletCount>0||shotcount>0)
		{
			System.out.println("Action: R or S");
			String action=kb.next();
			if(action.equals("R"))
			{
				reload();
			}
			if(action.equals("S"))
			{
				System.out.println(shoot());
			}
			System.out.println(printClip());
			
		}
		System.out.println("Out of bullets");
		
	}
	
	public static void resetClip()
	{
		for(int i=0;i<clip.length;i++)
			clip[i]="[]";
	}
	
	public static String shoot()
	{
		if(shotcount>0)
		{
			clip[shotcount-1]="[]";
			shotcount-=1;
			return "BOOM!\n";
		}
		else
		{
			return "RELOAD!\n";
		}
	}
	
	public static void reload()
	{
		if(bulletCount>=clipsize)
		{
			bulletCount-=clipsize;
			shotcount=clipsize;
		}
		else
		{
			shotcount=bulletCount;
			bulletCount=0;
		}
		resetClip();
		for(int i=0; i<shotcount;i++)
		{
			clip[i]= " * ";
		}
	}
	
	public static String printClip()
	{
		String output="";
		System.out.println("Bullets: \t" + bulletCount + "\nClip: \t");
		for(int i=0;i<clipsize;i++)
		{
			output += clip[i];
		}
		return output;
	}
}