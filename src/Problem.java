
import java.util.ArrayList;

public class Problem {


    public static ArrayList<City> allCities;
    int numberOfCities;
    public Problem(int numberOfCities)
    {
        this.numberOfCities= numberOfCities;
        allCities=new ArrayList<City>(numberOfCities);
    }
}