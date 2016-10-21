import java.util.Scanner;

public class graphTable
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int n = kb.nextInt();
		System.out.println("Please enter the size of the table: ");
		int size = kb.nextInt();
		
		for(int i=1;i<=size;i++)
		{
			System.out.printf("%3d     %3d\n", i,i*n);
		}
	}	
}