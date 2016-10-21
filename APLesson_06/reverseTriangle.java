import java.util.Scanner;

public class reverseTriangle
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Input a string: ");
		String inp = kb.next();
		
		for(int i = inp.length(); i >=0; i--)
		{
			System.out.println(inp.substring(0,i));
		}
	}
}