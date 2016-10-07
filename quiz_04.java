import java.util.Scanner;
public class quiz_04
{
	//public static void main(String[]args)
	//{
		//Scanner kb = new Scanner(System.in);
		//System.out.println("Please enter the cost of the first item: ");
		//double item1 = kb.nextDouble();
		//System.out.println("Please enter the cost of the first item: ");
		//double item2 = kb.nextDouble();
		
		//format(item1,item2);
	//}
	
	//public static void format (double one, double two)
	//{
		//double cost = one + two;
		//System.out.printf("The total cost of your order is $%.2f",cost);
	//}
	
	
	
	//static int num1 = 5;
	//static int num2 = 7;
	//static int num3 = 9;
	
	//public static void main(String[]args)
	//{
	//	numPrint(num1, num2, num3);
	//}
	
	//public static int calcAvg(int one, int two, int three)
	//{
	//	return (one+two+three)/3;
	//}
	
	//public void numPrint(int one, int two, int three)
	//{
	//	double avg = calcAvg(one,two,three);
	//	System.out.println("The average of " + one + ", " + two + ", " + three + "is " +avg);
	//}
	
	
	
	//public static void main(String[]args)
	//{
	//	Scanner kb = new Scanner(System.in);
	//	System.out.println("What is the length of one side of the cube? ");
	//	int side = kb.nextInt();
	//	surfPrint(side);
	//}
	
	//public static double calcSurf(int side)
	//{
	//	return 6*(Math.pow(side, 2));
	//}
	
	//public static void surfPrint(int side)
	//{
	//	System.out.printf("The surface area of your cube is %.5f inches",calcSurf(side));
	//}
	
	
	
	//public static void main(String[]args)
	//{
	//	Scanner kb = new Scanner(System.in);
	//	System.out.println("What is your first number? ");
	//	int num1 = kb.nextInt();
	//	System.out.println("What is your second number? ");
	//	int num2 = kb.nextInt();
	//	sumPrint(num1, num2);
	//}
	//public static double calcSum(int one, int two)
	//{
	//	return one + two;
	//}
	
	//public static void sumPrint(int one, int two)
	//{
	//	System.out.printf("The sum of " +one + " and " +two+ " is %.2f",calcSum(one,two));
	//}
	
	
	
	//static double area;
	//static int radius;
	//public static void main(String[]args)
	//{
	//	Scanner kb = new Scanner(System.in);
	//	System.out.println("Please enter the radius of your circle: ");
	//	int radius = kb.nextInt();
	//	calcArea();
	//	radPrint();
	//}
	//public static void calcArea()
	//{
	//	double area = 3.14 * radius*radius;
	//}
	//public static void radPrint()
	//{
	//	System.out.printf("The radius of your circle is %.3f.", area);
	//}
	
	
	
	public static void main(String[]args)
	{
		Scanner kb=new Scanner(System.in);
		
		System.out.println("Please enter item1: ");
		String i1 = kb.nextLine();
		System.out.println("Now enter the price: ");
		double p1 = kb.nextDouble();
		kb.nextLine();
		
		System.out.println("Please enter item2: ");
		String i2 = kb.nextLine();
		System.out.println("Now enter the price: ");
		double p2 = kb.nextDouble();
		kb.nextLine();
		
		System.out.println("Please enter item3: ");
		String i3 = kb.nextLine();
		System.out.println("Now enter the price: ");
		double p3 = kb.nextDouble();
		
		double subtotal = p1+p2+p3;
		double tax = subtotal * 0.08;
		double total = subtotal + tax;
		
		System.out.println("<<<<<<<<<<<<<<<<< Receipt >>>>>>>>>>>>>>>>");
		format(i1,p1);
		format(i2,p2);
		format(i3,p3);
		format("Subtotal: ", subtotal);
		format("Tax: ", tax);
		format("Total: ", total);
		System.out.println("_____________________________________________");
		System.out.println("\tThank you.....Come Again!");
	}
	
	public static void format(String one, double two)
	{
		System.out.printf("* %15s.....%15.2f\n",one,two);
	}
}
