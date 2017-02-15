public class ticketDriver
{
	public static void main(String[]args)
	{
		walkup walkup = new walkup();
		advance advance = new advance(10);
		studentAdvance studentAdvance = new studentAdvance(10);
		System.out.println("Walkup\n" + walkup);
		System.out.println("\nAdvance\n" + advance);
		System.out.println("\nStudent Advance\n" + studentAdvance);
	}
}