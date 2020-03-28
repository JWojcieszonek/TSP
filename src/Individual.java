import java.util.ArrayList;
import java.util.Collections;

public class Individual {
    private int numberOfCities;
    ArrayList<City> cities;
    //jakas kolekcja do przechowywania tych miast w kolejnosci ?

    public Individual(int numberOfCities) {
        this.numberOfCities = numberOfCities;
        cities = new ArrayList<City>(numberOfCities);
       // cities = (ArrayList<City>) Problem.allCities.clone();

    }

    public void randomInd() {
        cities = (ArrayList<City>) Problem.allCities.clone();
        Collections.shuffle(cities);
    }

    public double route() {
        if(!cities.isEmpty()) {
            double totalDist = 0;
            for (int i = 0; i < numberOfCities - 1; i++) {
                totalDist += cities.get(i).distance(cities.get(i + 1));
            }
            totalDist += cities.get(numberOfCities - 1).distance(cities.get(0));

            return totalDist;
        }
        else return -1;
    }

    public void greedyInd(int startIndex)
    {
        cities.clear();
        City from =Problem.allCities.get(startIndex);
        cities.add(from);
        City to = null;
        while(cities.size()<numberOfCities)
        {
            double minDist =-1;
            for(int i=0;i<numberOfCities;i++)
            {

                if(!cities.contains(Problem.allCities.get(i)) &&minDist==-1) {
                     to =Problem.allCities.get(i);
                    minDist = from.distance(to);
                }
                else if(!cities.contains(Problem.allCities.get(i)) &&minDist>from.distance(Problem.allCities.get(i)))
                    {
                    to=Problem.allCities.get(i);
                    minDist=from.distance(to);
                }

            }
            cities.add(to);
            from=to;

        }
    }
}
