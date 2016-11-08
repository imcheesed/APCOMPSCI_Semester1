import java.util.Scanner;
public class Treedeg60
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String word = kb.nextLine();
		int stop = word.length();
		int start = 0;
		tree(word,start,stop);
	}
	public static String tree(String w, int start, int stop)
	{
		if(start <= stop)
		{
			System.out.printf("%10s  \n",w.substring(0,start));
			start += 1;
			tree(w,start,stop);
		}
		return "";
	}
}