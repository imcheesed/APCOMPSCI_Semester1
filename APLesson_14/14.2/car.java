public class car implements location
{
	double x;
	double y;
	private int ID = (int)(Math.random() * Math.pow(10,6))+1;
	public int getID()
	{
		return ID;
	}
	public double[] getLoc()
	{
		return new double[] {x,y};
	}
	public void move(double X, double Y)
	{
		x += X;
		y += Y;
	}
}