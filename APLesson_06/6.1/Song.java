public class Song
{
	public static void main(String[]args)
	{
		sing("Na", 4);
		sing("Na", 4);
		sing("Hey", 3);
		sing("Goodbye!", 1);
	}
	public static void sing(String lyrics, int num)
	{
		for(int i = 1; i <= num; i++)
		{
			System.out.printf("%s ",lyrics);
			
		}
		System.out.println("");
	}
}