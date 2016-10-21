import java.util.Scanner;

public class factorial
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int n = kb.nextInt();
		int f = 1;
		for(int i = 1;i <= n; i++)
		{
			f=f*i;
		}
		System.out.println(f);
	}
}