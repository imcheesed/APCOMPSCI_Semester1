public class AverageNumbers
{
	public static void main(String[]args)
	{
		int [] numbers = new int[10];

		for(int i = 0; i < numbers.length; i ++)
		{
			numbers[i] = (int)(Math.random()*100)+1;
		}
		System.out.println("Numbers... ");
		for (int number : numbers)
		{
			System.out.print(number + " ");
		}
		System.out.println();
		System.out.println("The average of the above numbers is..." + average(numbers));
	}
	public static int average(int[] num)
	{
		int sum = 0;
		for(int n : num)
		{
			sum += n;
		}
		return (sum/10);
	}
}