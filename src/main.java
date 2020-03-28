public class main {
    public static void main(String[] args)
    {
        Problem problem = new Problem(11);
        Loader loader = new Loader("D:\\Szkoła\\Semestr 6\\SI - true\\ai-lab1-2020-tsp_dane\\TSP\\berlin11_modified.tsp");
        loader.readFile(problem);
        Individual individual = new Individual(problem.numberOfCities);
        System.out.println(individual.route());
        individual.randomInd();
        System.out.println(individual.route());
        individual.greedyInd(1);
        System.out.println(individual.route());




    }
}
