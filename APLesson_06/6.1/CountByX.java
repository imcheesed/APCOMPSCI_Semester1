import java.util.Scanner;

public class CountByX
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Input the number you would like to count to: ");
		int num1 = kb.nextInt();
		System.out.println("Input the number you would like to count by: ");
		int num2 = kb.nextInt();
		
		for(int i = num2; i<=num1;i+=num2)
		{
			System.out.printf("%d\t",i);
		}
	}
}