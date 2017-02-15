public abstract class ticket
{
	private int serialNo = 0;
	private int price = 0;
	
	public ticket()
	{
		price = 0;
		serialNo = (int)(Math.random() * 10000000);
	}
	
	public int getSerialNo()
	{
		return serialNo;
	}
	
	public abstract int getPrice();
	public String toString()
	{
		return "Serial #: " + getSerialNo() + "\nPrice: " + getPrice();
	}
}