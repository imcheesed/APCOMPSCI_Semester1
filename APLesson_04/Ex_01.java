import java.util.Scanner;
public class Ex_01
{
	public static void main(String[]args)
	{
		Ex_01 form = new Ex_01();
		
		Scanner kb=new Scanner(System.in);
		System.out.println("Please enter item 1:");
		String item1 = kb.nextLine();
		
		System.out.println("Please enter the price:");
		double price1 = kb.nextDouble();
		
		
		kb.nextLine();
		System.out.println("Please enter item 2:");
		String item2 = kb.nextLine();
		
		System.out.println("Please enter the price:");
		double price2 = kb.nextDouble();
		
		kb.nextLine();
		System.out.println("Please enter item 3:");
		String item3 = kb.nextLine();
		
		System.out.println("Please enter the price:");
		double price3 = kb.nextDouble();
		
		
		System.out.printf("<<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>>>");
		form.format(item1, price1);
		form.format(item2, price2);
		form.format(item3, price3);
		
		System.out.printf("\n*           Subtotal: ........        9.01");
		System.out.printf("\n*                Tax: ........        0.63");
		System.out.printf("\n*              Total: ........        9.64");
		System.out.printf("\n__________________________________________");
		System.out.printf(" \n* Thank you for your support *");
		
		
	}
	
	public void format(String word, double number)
	{
		System.out.printf("\n*%20s ........    %8.2f", word, number);
	}
	

	
}