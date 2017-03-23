public class honda extends car
{
	private double x;
	private double y;
	private double[] loca;
	public honda()
	{
		x = 0;
		y = 0;
	}
	public honda(double[]loc)
	{
		loca = loc;
		x = loc[0];
		y = loc[1];
	}
	public void move(double X, double Y)
	{
		//x+=X;
		//y+=Y;
		loca[0] += X;
		loca[1] += Y;
	}
	public double[] getLoc()
	{
		return loca;
	}
}