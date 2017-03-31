public class Magpie2
{
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */	
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	/** getResponse() method
	 * ===========================================
	 * 	Gives a response to a user statement
	 *  @param statement (the user statement)
	 * 	@return a response based on the rules given */
	public String getResponse(String statement)
	{
		String response = "";
		/** Exercise_01:
		 * ==================================================
		 * 	Code that asks the user "Say something, please."
		 * 	if you enter nothing, or if you accidentally hit
		 * 	enter. Think to yourself: "What is the length of
		 * 	an empty String?" */


		/** To be completed in Exercise_02:
		 * 	Modify the following code to use the findKeyword
		 * 	Method (details in "Exercise_02" below. */
		if (statement.length() == 0)
		{
			response = "Say something, please.";
		}
		else if (findKeyword(statement, "no") >= 0)
		{
			response = "Why so negative?";
		}
		else if (findKeyword(statement, "mother") >= 0
				|| findKeyword(statement, "father") >= 0
				|| findKeyword(statement, "sister") >= 0
				|| findKeyword(statement, "brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
		/** Exercise_03(Final)
		 * ==================================================
		 * Create additional code (another else if) that
		 * responds "Tell me more about your pet" if the
		 * user mentions the word cat, dog, fish, or turtle
		 * in their statement.
		 *
		 * Create addtional code (another else if) that
		 * responds "He sounds like a pretty dank teacher"
		 * if you mention "Robinette" in your statement */
		else if (findKeyword(statement,"cat")>=0
				|| findKeyword(statement,"dog")>=0
				|| findKeyword(statement,"fish")>=0
				|| findKeyword(statement,"turtle")>=0)
		{
			response = "Tell me more about your pet.";	
		}
		
		else if (findKeyword(statement,"Robinette")>=0)
		{
			response="He sounds like a pretty dank teacher.";
		}
		 
		else if (statement.trim().length() == 0)
		{
			response = "Say something, please.";
		}

		else if (findKeyword(statement, "I want to", 0) >= 0)
		{
		response = transformIWantToStatement(statement);
		}

		else
		{
			int psn = findKeyword(statement,"you",0);
			if (psn >=0 && findKeyword(statement,"me",psn)>=0)
			{
				response = transformYouMeStatement(statement);
			}
			
			int psn2 = findKeyword(statement,"I",0);
			if (psn2 >=0 && findKeyword(statement,"you",psn2)>=0)
			{
				response = transformIYouStatement(statement);
			}
			
			else
			{
				response = getRandomResponse();
			}
		}
		return response;
		
	}
	/**
	 * Take a statement with "I want to <something>." and transform it into 
	 * "What would it mean to <something>?"
	 * @param statement the user statement, assumed to contain "I want to"
	 * @return the transformed statement
	 */
	private String transformIWantToStatement(String statement)
	{
		statement=statement.trim();
		String lastChar=statement.charAt(statement.length()-1)+"";
		if(lastChar.equals(".")==true)
		{
			statement=statement.replace(lastChar,"");
		}
		
		int psn=findKeyword(statement,"I want to ");
		String restOfStatement=statement.substring(psn+10);
		
		return "What would it mean to"+restOfStatement+"?";
	}
	
	private String transformYouMeStatement(String statement)
	{
		statement=statement.trim();
		String lastChar=statement.charAt(statement.length()-1)+"";
		if(lastChar.equals(".")==true)
		{
			statement=statement.replace(lastChar,"");
		}
		
		int psnOfYou=findKeyword(statement,"you");
		int psnOfMe=findKeyword(statement,"me",psnOfYou+3);
		String restOfStatement=statement.substring(psnOfYou+3,psnOfMe);
		
		return "What makes you think that I"+restOfStatement+"you?";
	}
	
	private String transformIYouStatement(String statement)
	{
		statement=statement.trim();
		String lastChar=statement.charAt(statement.length()-1)+"";
		if(lastChar.equals(".")==true)
		{
			statement=statement.replace(lastChar,"");
		}
		
		int psnOfI=findKeyword(statement,"I");
		int psnOfYou=findKeyword(statement,"you",psnOfI+1);
		String restOfStatement=statement.substring(psnOfI+1,psnOfYou);
		
		return "Why do you"+restOfStatement+"me?";
	}
	/** Ex_02: The findKeyword() Method...
	 * ========================================================= */
	private int findKeyword(String statement, String goal, int startPos)
	{
		String phrase=(statement.trim()).toLowerCase();
		goal = goal.toLowerCase();
		
		int psn=phrase.indexOf(goal,startPos);
		String before = "";
		String after = "";
		
		while(psn>=0)
		{
			if(psn>0)
			{
				before=phrase.substring(psn-1,psn);
			}
			if(psn+goal.length()<phrase.length())
			{
				after=phrase.substring(psn+goal.length(),psn+goal.length()+1);
			}
			if(((before.compareTo("a")<0)||(before.compareTo("z")>0))
					&&((after.compareTo("a")<0)||(after.compareTo("z")>0)))
			{
				return psn;	
			}
			psn = phrase.indexOf(goal,psn+1);
		}
		
		return -1;
	}

	private int findKeyword(String statement,String goal)
	{
		return findKeyword(statement, goal, 0);
	}

	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 4;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
			response = "Interesting, tell me more.";
		else if (whichResponse == 1)
			response = "Hmmm.";
		else if (whichResponse == 2)
			response = "Do you really think so?";
		else if (whichResponse == 3)
			response = "You don't say.";

		return response;
	}
}