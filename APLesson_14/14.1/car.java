public abstract class car implements location
{
	public int ID =(int)(Math.random() * Math.pow(10,6))+1;
	public int getID()
	{
		return ID;
	}
	public abstract double[] getLoc();
	abstract void move(double X, double Y);
}