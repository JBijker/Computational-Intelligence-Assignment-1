public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int N = 10;
		int startCity = 2;
		
		roadNetwork roads = new roadNetwork(N, startCity);
		System.out.println("Aantal steden: " + roads.getN());
		roads.outputArray();
		
		System.out.println("Afstand van 2 naar 1: " + roads.getDistance(2, 1));
		
		Chromosome chromosome = new Chromosome(N, startCity);
		System.out.println("Chromosoom: " + chromosome + " Fitness: " + roads.getFitness(chromosome));
		
		chromosome = new Chromosome(N, startCity);
		System.out.println("Chromosoom: " + chromosome + " Fitness: " + roads.getFitness(chromosome));
		
		chromosome = new Chromosome(N, startCity);
		System.out.println("Chromosoom: " + chromosome + " Fitness: " + roads.getFitness(chromosome));
		
		chromosome = new Chromosome(N, startCity);
		System.out.println("Chromosoom: " + chromosome + " Fitness: " + roads.getFitness(chromosome));
		
		chromosome = new Chromosome(N, startCity);
		System.out.println("Chromosoom: " + chromosome + " Fitness: " + roads.getFitness(chromosome));
		
		chromosome = new Chromosome(N, startCity);
		System.out.println("Chromosoom: " + chromosome + " Fitness: " + roads.getFitness(chromosome));
		
		chromosome = new Chromosome(N, startCity);
		System.out.println("Chromosoom: " + chromosome + " Fitness: " + roads.getFitness(chromosome));
		
		chromosome = new Chromosome(N, startCity);
		System.out.println("Chromosoom: " + chromosome + " Fitness: " + roads.getFitness(chromosome));
		
		chromosome = new Chromosome(N, startCity);
		System.out.println("Chromosoom: " + chromosome + " Fitness: " + roads.getFitness(chromosome));
		
		
	}


}
