import java.util.Scanner;
public class passwordProgram
{
	static Scanner kb;
	public static void main(String[]args)
	{
		kb = new Scanner(System.in);
		String username = "username";
		String password = "password";
		
		passCheck(username, password);
		
	}
	public static void passCheck(String user, String pass)
	{
		System.out.println("Please enter your username:");
		String u = kb.nextLine();
		
		System.out.println("Please enter your password:");
		String p = kb.nextLine();
		
		if(u.equals(user)&&p.equals(pass))
			System.out.println("OPEN SESAME!");
		else{
			if(u.equals(user))
			{
				System.out.println("Your password is incorrect! Please try again");
				passCheck(user, pass);
			}
			else if(p.equals(pass))
			{
				System.out.println("Your username is incorrect! Please try again");
				passCheck(user, pass);
			}
			else
			{
				System.out.println("Your username and password are incorrect! Please try again");
				passCheck(user, pass);
			}
		}	
	}
}