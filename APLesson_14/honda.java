public class honda implements location
{
	private double x;
	private double y;
	private double[] locate;
	public honda()
	{
		x = 0;
		y = 0;
	}
	public honda(double[]loc)
	{
		locate = loc;
		x = loc[0];
		y = loc[1];
	}
	public int getID()
	{
		int ID = (int)(Math.random()*Math.pow(10,6))+1;
		return ID;
	}
	public void move(double X, double Y)
	{
		locate[0] += X;
		locate[1] += Y;
	}
	public double[] getLoc()
	{
		return locate;
	}
}