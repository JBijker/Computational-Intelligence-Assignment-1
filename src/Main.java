import java.io.*;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int N = 5;
		
		roadNetwork roads = new roadNetwork(N);
		System.out.println("Aantal steden: " + roads.getN());
		roads.outputArray();
		
		System.out.println("Afstand van 2 naar 1: " + roads.getDistance(2, 1));
		
	}


}
