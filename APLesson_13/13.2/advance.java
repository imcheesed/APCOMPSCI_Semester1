public class advance extends ticket
{
	public int daysLeft;
	public advance()
	{
		super();
		daysLeft = 0;
	}
	public advance(int days)
	{
		super();
		daysLeft = days;
	}
	public int getDaysLeft()
	{
		return daysLeft;
	}
	public int getPrice()
	{
		if(daysLeft >= 10)
			return 30;
		else
			return 40;
	}
}