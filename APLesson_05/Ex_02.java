import java.util.Scanner;
public class Ex_02
{
	static double price1,price2,price3,price4;
	static double subtotal;
	static double discount;
	static double total;
	public static void main(String[]args)
	{
		Scanner kb=new Scanner(System.in);
		System.out.println("What is item 1?");
		String item1 = kb.nextLine();
		System.out.println("What is the price for item 1?");
		price1 = kb.nextDouble();
		
		System.out.println("What is item 2?");
		kb.nextLine();
		String item2 = kb.nextLine();
		System.out.println("What is the price for item 2?");
		price2 = kb.nextDouble();
		
		System.out.println("What is item 3?");
		kb.nextLine();
		String item3 = kb.nextLine();
		System.out.println("What is the price for item 3?");
		price3 = kb.nextDouble();
		
		System.out.println("What is item 4?");
		kb.nextLine();
		String item4 = kb.nextLine();
		System.out.println("What is the price for item 4?");
		price4 = kb.nextDouble();
		

		
		subtotal = price1+price2+price3+price4;
		String top = "<<<<<<<<<<< Receipt >>>>>>>>>>>>>>";
		System.out.printf("\n%43s", top);
		
		
		
		discount();
		format(item1,price1);
		format(item2,price2);
		format(item3,price3);
		format(item4,price4);
		format("Subtotal",subtotal);
		format("Discount",discount);
		format("Total",total);
		
		
		
		
		
		
		String bottom = "_________________________________________";
		String thank = "Thank you and have a nice day!";
		System.out.printf("\n%40s \n%36s", bottom,thank);
	}	
	
	
	public static void discount()
	{
		if(subtotal>=2000)
			discount = 0.15*total;
		    total = subtotal-discount;
			
		if(subtotal<2000)
		    discount = 0;
	}
	public static void format(String items, double prices)
	{
		System.out.printf("\n * %18s .......  %.2f",items,prices);
	}
	

	
	
}