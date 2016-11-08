import java.util.Scanner;
public class Underscores
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a sentence: ");
		String sentence = kb.nextLine();
		replace(sentence);
	}
	public static String replace(String s)
	{
		if(s.indexOf(" ") < 0)
		{
			System.out.println(s);
		}
		else
		{
			s = s.substring(0, s.indexOf(" ")) + "_" + s.substring(s.indexOf(" ")+1);
			replace(s);
		}
		return "";
	}
}