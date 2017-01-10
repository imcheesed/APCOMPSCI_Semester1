import java.util.Scanner;
public class Distance_Runner
{
	public static void main(String[]args)
	{
		int x1=0;
		int y1=0;
		int x2=0;
		int y2=0;
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter the first x coordinate: ");
		x1 = kb.nextInt();
		System.out.println("Enter the first y coordinate: ");
		y1 = kb.nextInt();
		System.out.println("Enter the second x coordinate: ");
		x2 = kb.nextInt();
		System.out.println("Enter the second y coordinate: ");
		y2 = kb.nextInt();
		
		Distance_Class object = new Distance_Class(x1,y1,x2,y2);
		System.out.printf("Distance between the points = %.2f\n",object.getDist());
		
		
		
		object.setValues(1,5,3,8);
		System.out.printf("Distance between the points= %.2f",object.getDist());
	}
}