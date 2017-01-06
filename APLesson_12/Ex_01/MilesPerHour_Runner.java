import java.util.Scanner;
public class MilesPerHour_Runner
{
	public static void main(String[]args)
	{
		int d=0;
		int h=0;
		int m=0;
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter distance: ");
		d = kb.nextInt();
		System.out.println("Enter time in hours: ");
		h = kb.nextInt();
		System.out.println("Enter time in minutes: ");
		m = kb.nextInt();
		
		MilesPerHour_Class object = new MilesPerHour_Class(d,h,m);
	
		System.out.println(d+" miles in "+h+" hours and "+m+" minutes is " + object.returnSpeed());
		
		System.out.println("Enter another distance: ");
		d=kb.nextInt();
		System.out.println("Enter another time in hours: ");
		h=kb.nextInt();
		System.out.println("Enter another time in minutes: ");
		m=kb.nextInt();
		object.modifySpeed(d,h,m);
		
		System.out.println(d+" miles in "+h+" hours and "+m+" minutes is " + object.returnSpeed());
	}
}