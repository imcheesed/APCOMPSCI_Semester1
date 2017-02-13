public class pc extends gamesystem
{
	public String getPlatform()
	{
		return "PC";
	}
	public String systemInput()
	{
		return "Keyboard and Mouse";
	}
	public String toString()
	{
		return "Platform: " + getPlatform() + "\nSerial #: " + getSerial() + "\nSystem Input: " + systemInput();
	}
}