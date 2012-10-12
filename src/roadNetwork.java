import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class roadNetwork {

	private int N;
	private int startCity;
	private double distances[][];

	public roadNetwork() {

		int cities = Main.N;
		this.startCity = Main.startCity;
		try {
			// Open the file that is the first
			// command line parameter
			FileInputStream fstream = new FileInputStream("data/" + cities
					+ "_cities.txt");
			// Get the object of DataInputStream
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String strLine;
			// Read File Line By Line
			int i = -1;
			while ((strLine = br.readLine()) != null) {
				// Print the content on the console
				if (i == -1) {
					N = Integer.parseInt(strLine);
					distances = new double[N][N];
				} else {
					String values[] = strLine.split(" ");
					for (int j = 0; j < values.length; j++) {
						String stringValue = values[j];
						double doubleValue = Double.parseDouble(stringValue);
						distances[i][j] = doubleValue;
					}
				}
				i++;
			}
			// Close the input stream
			in.close();
		} catch (Exception e) {// Catch exception if any
			System.err.println("Error: " + e.getMessage());
		}

	}
	
	public double getDistance(int from, int to){
		
		if(from > distances.length){
			
		}
		
		return distances[from][to];
		
	}

	public int getN() {
		return N;
	}

	public double getFitness(Chromosome chromosome){
		Integer[] cities = chromosome.getGenes();
		int previousCity = this.startCity;
		double distance = 0.0;
		for(int i = 0; i < cities.length; i++){
			int city = cities[i];
			distance += getDistance(previousCity, city);
			//System.out.println("Afstand van " + previousCity + " naar " + city + " is " + getDistance(previousCity, city) + ", totaal: " + distance);
			previousCity = city;
		}
		int city = this.startCity;
		distance += getDistance(previousCity, city);
		//System.out.println("Afstand van " + previousCity + " naar " + city + " is " + getDistance(previousCity, city) + ", totaal: " + distance);
		
		return distance;
		
	}
	
	
	public void outputArray() {
		System.out.print("Stad  ");
		for (int j = 0; j < N; j++) {
			if(j < 10)System.out.print(" ");
			System.out.print(j + "    ");
		}
		System.out.println();
		for (int i = 0; i < N; i++) {
			if(i < 10)System.out.print(" ");
			System.out.print(i + " [");
			for (int j = 0; j < N; j++) {
				String str = "";
				if(distances[i][j] < 100) str += " ";
				if(distances[i][j] < 10) str += " ";
				if(distances[i][j] == 0.0){
					System.out.print(str + " -- ");
				} else {
					System.out.print(str + " " + distances[i][j]);
				}
			}
			System.out.println(" ]");
		}
		System.out.println();
	}

}
