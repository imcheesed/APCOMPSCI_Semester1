public class studentAdvance extends advance
{
	public studentAdvance()
	{
		super();
	}
	public studentAdvance(int n)
	{
		super(n);
	}
	public int getPrice()
	{
		return super.getPrice()/2;
	}
	public String toString()
	{
		return super.toString() + "\n(STUDENT ID REQUIRED)";
	}
}