import java.util.Scanner;
public class FindTheZs
{
	static String[] words;
	static Scanner kb = new Scanner(System.in);
	public static void main(String[]args)
	{
		
		words = new String[5];
		fillArray(words);
		System.out.println("For the words,");
		printArray(words);
		System.out.println("\nOnly " + hasZs(words) + "contain(s) the letter Z.");
	}
	public static void fillArray(String[] words)
	{
		System.out.println("Enter 5 words: ");
		for(int i = 0; i < words.length; i ++)
		{
			words[i] = kb.next();
		}
	}
	public static void printArray(String[] words)
	{
		for(String word:words)
		{
			System.out.print(word+ " ");
		}
	}
	public static String hasZs(String[] words)
	{
		String zs = " ";
		for(String word:words)
		{
			if(word.indexOf("z")>=0)
			zs+=word + " ";
		}
		return zs;
	}
}