public class ReturnMethodsLesson_04
{
	public static void main(String[]args)
	{
		ReturnMethodsLesson_04 average = new ReturnMethodsLesson_04();
		int n1 = 3;
		int n2 = 8;
		int n3 = 15;
		double avg = average.calcAvg(n1, n2, n3);
		System.out.printf("The volume of your cube is %6.2f\n",  avg);
	}
	
	public double calcAvg(int one, int two, int three)
	{
		return(one+two+three)/3.0;
	}
}