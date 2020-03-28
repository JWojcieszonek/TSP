public class City
{
    double x;
    double y;
    public City(double x, double y)
    {
        this.x=x;
        this.y=y;
    }
    public double distance (City city)
    {
        double distX = x-city.x;
        double distY = y-city.y ;
        return Math.sqrt((distX*distX + distY*distY));
    }

    public static void main(String[] args)
    {
        City a = new City(0,0);
        City b = new City(3,4);

        //System.out.println(a.distance(b));
    }
}
