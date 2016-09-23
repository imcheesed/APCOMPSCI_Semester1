import java.util.Scanner;
public class Ex_03
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		Ex_03 loan = new Ex_03();
		
		System.out.println("What is the interest rate?");
		double rate = kb.nextDouble();
		
		System.out.println("What is your principal amount?");
		int principal = kb.nextInt();
		
		System.out.println("How many times is the loan compunded per year?");
		int number = kb.nextInt();
		
		System.out.println("What is the life of the loan?");
		int time = kb.nextInt();
		
		System.out.printf("The total cost for the loan is $%.2f.%n", loan.totalCost(principal, rate, number, time));
		System.out.printf("The monthly payment for the loan is $%.2f.", loan.monthlypayment(principal, rate, number, time));
		
	}
	
	public double monthlypayment(int p,double r, int t, int n)
	{
		return p*Math.pow((1+r/n), n*t)/(12*t);
	}
	
	public double totalCost(int p,double r, int t, int n)
	{
		return p*Math.pow(1+r/n,n*t);
	}
}