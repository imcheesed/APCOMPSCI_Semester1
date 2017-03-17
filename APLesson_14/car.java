public class car implements location
{
	public int ID;
	public double[] location;
	public car()
	{
		location = new double[2];
		ID = (int)(Math.random()*1000000);
	}
	
	public car(double x, double y)
	{
		location = new double [2];
		location[0] = x;
		location[1] = y;
		ID = (int)(Math.random()*1000000);
	}
	
	public int getID()
	{
		return ID;
	}
	
	public void move(double x, double y)
	{
		location[0] += x;
		location[1] += y;
	}
	
	public double[] getLoc()
	{
		return location;
	}
}