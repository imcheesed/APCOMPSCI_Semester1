import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ExpressionSolver
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an equation: ");
		String eq = input.nextLine();
		
		ArrayList<String>equation = new ArrayList<>(Arrays.asList(eq.split(" ")));

		doFunction(equation);
	}
	
	public static void doFunction(ArrayList<String> eqn)
	{	
		int i = 0;
		while(i < eqn.size())
		{
			if(eqn.get(i).equals("+"))
			{
				eqn.set(i, "" + (Integer.parseInt(eqn.get(i-1)) + Integer.parseInt(eqn.get(i+1))));
				eqn.remove(i-1);
				eqn.remove(i);
			}
			else if(eqn.get(i).equals("-"))
			{
				eqn.set(i, "" + (Integer.parseInt(eqn.get(i-1)) - Integer.parseInt(eqn.get(i+1))));
				eqn.remove(i-1);
				eqn.remove(i);
			}
			else if(eqn.get(i).equals("*"))
			{
				eqn.set(i, "" + (Integer.parseInt(eqn.get(i-1)) * Integer.parseInt(eqn.get(i+1))));
				eqn.remove(i-1);
				eqn.remove(i);
			}
			else if(eqn.get(i).equals("/"))
			{
				eqn.set(i, "" + (Integer.parseInt(eqn.get(i-1)) / Integer.parseInt(eqn.get(i+1))));
				eqn.remove(i-1);
				eqn.remove(i);
			}
			else
				i++;
		}
		
		System.out.println(eqn);
	}
}