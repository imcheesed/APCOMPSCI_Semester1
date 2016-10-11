import java.util.Scanner;
public class Ex_01
{
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter your grade for English:");
		String eng = kb.next();
		System.out.println("Enter your grade for Calculus:");
		String calc = kb.next();
		System.out.println("Enter your grade for History:");
		String history = kb.next();
		System.out.println("Enter your grade for Biology:");
		String bio = kb.next();
		System.out.println("Enter your grade for Computer Science:");
		String compsci = kb.next();
		System.out.println("Enter your grade for Economics:");
		String econ = kb.next();
		System.out.println("Enter your grade for Jazz Band:");
		String jb = kb.next();
		
		double gPoints = calcPoints(eng)+calcPoints(calc)+calcPoints(history)+calcPoints(bio)+calcPoints(compsci)+calcPoints(econ)+calcPoints(jb);
		double GPA = gPoints/7;
		System.out.printf("Your GPA is %.2f",GPA);
	}
	
	public static double calcPoints(String grade)
	{
		
		if (grade.equals("A"))
			return 4.0;
		if (grade.equals("B"))
			return 3.0;
		if (grade.equals("C"))
			return 2.0;
		if (grade.equals("D"))
			return 1.0;
		else
			return 0;
		
	}
}