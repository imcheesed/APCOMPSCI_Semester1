import java.util.Arrays;
public class toyota extends car
{
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
}