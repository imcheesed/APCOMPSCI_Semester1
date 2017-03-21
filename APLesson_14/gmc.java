public class gmc implements location
{
	private double x;
	private double y;
	public gmc()
	{
		x = 0;
		y = 0;
	}
	public gmc(double X, double Y)
	{
		x += X;
		y += Y;
	}
	public int getID()
	{
		int ID = (int)(Math.random()*Math.pow(10,6))+1;
		return ID;
	}
	public void move(double X, double Y)
	{
		x = X;
		y = Y;
	}
	public double[] getLoc()
	{
		double[] loc = new double[] {x,y};
		return loc;
	}
}