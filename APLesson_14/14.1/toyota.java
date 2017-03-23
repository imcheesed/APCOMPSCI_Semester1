import java.util.Arrays;
public class toyota extends car
{
	private double[] loc;
	private double x;
	private double y;
	public toyota()
	{
		x = 0;
		y = 0;
	}
	public toyota(String i)
	{
		//in = i;
		String[] locs = i.split(", ");
		//loc[0] = Double.parseDouble(locs[0]);
		//loc[1] = Double.parseDouble(locs[1]);
		x = Double.parseDouble(locs[0]);
		y = Double.parseDouble(locs[1]);
	}
	public void move(double X, double Y)
	{
		x += X;
		y += Y;
		//loc[0] += X;
		//loc[1] += Y;
	}
	public double[] getLoc()
	{
		return new double[] {x,y};
		//return loc;
	}
}