import java.util.Scanner;
public class box
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please input a string: ");
		String inp = kb.next();
		int num = inp.length();
		
		for(int i = 0;i <= num-1;i++)
		{
			System.out.println(inp);
		}
	}
	
	
}