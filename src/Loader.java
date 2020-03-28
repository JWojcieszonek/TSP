import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Loader
{
    String filePath;
    int numberOfCities;

    public Loader(String filePath)
    {
       this.filePath=filePath;
    }


    public void readFile(Problem problem)
    {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(filePath));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (scanner.hasNext())
        {
            String line = scanner.nextLine();
            if(line.matches("[\\d,\\s.]+"))
            {
                String[] coordinates = new String[3];
                coordinates =line.split("\\s+");
                problem.allCities.add(new City(Double.parseDouble((coordinates[1])),Double.parseDouble((coordinates[2]))));
               // System.out.println(coordinates[1]);
            }

        }

    }

    public static void main(String[] args)
    {
        Problem problem = new Problem(11);
        Loader loader = new Loader("D:\\Szkoła\\Semestr 6\\SI\\ai-lab1-2020-tsp_dane\\TSP\\berlin11_modified.tsp");
        loader.readFile(problem);


    }
}
