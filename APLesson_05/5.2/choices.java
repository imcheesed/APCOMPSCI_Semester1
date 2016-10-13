import java.util.Scanner;
public class choices
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Would you like to..." +
							"\n 1. Do a Math problem" +
							"\n 2. Answer a question");
		int mathOrWords = kb.nextInt();
		if(mathOrWords == 1)
		{
			System.out.println("What is 2x2?");
			int mathAnswer = kb.nextInt();
			if(mathAnswer == 4)
			{
				System.out.println("Correct!");
			}
			else
			{
				System.out.println("No! You lose!");
			}
				
		}
		else
		{
			System.out.println("Who said the phrase \"Whatever you are, be a good one.\"?");
			kb.nextLine();
			String wordAnswer = kb.nextLine();
			if(wordAnswer.equals("Abraham Lincoln"))
			{
				System.out.print("Correct!");
			}
			else
			{
				System.out.println("No! You lose!");
			}
		}
	}
}