import java.util.ArrayList;
import java.util.Arrays;
public class satellite
{
   public static void main(String[]args)
   {
       ArrayList<location> locate = new ArrayList<>();
       double[] honLoc = {5, 6};
       locate.add(new honda(honLoc));
       locate.add(new toyota("8, 9"));
       locate.add(new gmc(3, 8));

        double[] home = {0, 0};

        String printout = "\n\n" +
               "==========================" + "\nStarting locations...";

        for (location l : locate)
       {
           printout += "\nLocation for " + l.getID() + ": (" + getLocation(l.getLoc()) + ")";
       }

        printout += "\n\n" + "==========================" +
                   "\nDistance from home...";

        for (location l : locate)
       {
           printout += "\nDistance for " + l.getID() + ": (" + getDistance(l.getLoc(), home)+ ")";
       }
		for(location object : locate)
			{
				double x = (Math.random()*100)+1;
				double y = (Math.random()*100)+1;
				object.move(x,y);
				printout += "\n==========================\nAfter " + object.getID() + " Moved(" + x + ", " + y + ")\nNew Location: (" + Arrays.toString(object.getLoc()) + ")";
			}
        System.out.println(printout);
		
   }
    public static double getDistance(double[] car, double[] home)
   {
       return Math.sqrt((Math.pow(car[0] - home[0], 2)+ Math.pow(car[1] - home[1], 2)));
   }

    public static String getLocation(double[] loc)
   {
       return loc[0] + ", " + loc[1];
   }
}