import java.util.ArrayList;
import java.util.Collections;

public class Individual
{
    private int numberOfCities;
    ArrayList<City> cities;
    //jakas kolekcja do przechowywania tych miast w kolejnosci ?

    public Individual(int numberOfCities)
    {
            this.numberOfCities=numberOfCities;
            cities = new ArrayList<City>(numberOfCities);

    }

    public void randomInd()
    {
        cities =(ArrayList<City>) Problem.allCities.clone();
        Collections.shuffle(cities);
    }
}
