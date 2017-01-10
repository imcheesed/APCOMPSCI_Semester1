import static java.lang.Math.*;
public class MilesPerHour_Class
{
	private int distance,hours,minutes;
	private double mph;
	
	public MilesPerHour_Class()
	{
		distance=0;
		hours=0;
		minutes=0;
		mph=0;
	}
	public MilesPerHour_Class(int d, int h, int m)
	{
		distance=d;
		hours=h;
		minutes=m;
		mph=0;
	}
	public void modifySpeed(int d, int h, int m)
	{
		distance=d;
		hours=h;
		minutes=m;
	}
	public int getDistance()
	{
		return distance;
	}
	public int getHours()
	{
		return hours;
	}
	public int getMinutes()
	{
		return minutes;
	}
	public double getMPH()
	{
		mph= Math.round(distance / (hours + minutes / 60.0));
		return mph;
	}
}