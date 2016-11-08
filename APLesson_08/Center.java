import java.util.Scanner;
public class Center
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter word #1 ");
		String word1 = kb.nextLine();
		System.out.println("Enter word #2 ");
		String word2 = kb.nextLine();
		System.out.println("Enter word #3 ");
		String word3 = kb.nextLine();
		center(word1,20);
		center(word2,20);
		center(word3,20);
		
	}
	public static String center(String w, int n)
	{
		if (w.length() >= n)
		{
			System.out.println(w);
		}
		else
		{
			center(" " + w + " ", n);
		}
		return "";
	}
}