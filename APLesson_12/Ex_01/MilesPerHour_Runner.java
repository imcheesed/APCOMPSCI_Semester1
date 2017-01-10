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
	
		System.out.printf("%d miles in %d hours and %d minutes = %.2f mph%n",object.getDistance(),object.getHours(),object.getMinutes(),object.getMPH());
		
		
		object.modifySpeed(20,4,15);
		
		System.out.printf("%d miles in %d hours and %d minutes = %.2f mph",object.getDistance(),object.getHours(),object.getMinutes(),object.getMPH());
	}
}