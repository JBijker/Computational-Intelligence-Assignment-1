public class Main {

	public static int N;
	public static int startCity;
	public static roadNetwork roads;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		N = 50;
		startCity = 2;
		
		roads = new roadNetwork();
		System.out.println("Aantal steden: " + roads.getN());
		roads.outputArray();
		
		System.out.println("Afstand van 2 naar 1: " + roads.getDistance(2, 1));
		
		Population firstPopulation = new Population(9);
		System.out.println(firstPopulation);
		
	}


}
