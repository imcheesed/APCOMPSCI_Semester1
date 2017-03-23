public class gmc extends car
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
	public void move(double X, double Y)
	{
		x += X;
		y += Y;
	}
	public double[] getLoc()
	{
		double[] loc = new double[] {x,y};
		return loc;
	}
}