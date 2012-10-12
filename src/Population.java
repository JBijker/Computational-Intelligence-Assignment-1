import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Population {

	private Chromosome chromosomes[];
	private double fitnessSum;

	public Population(int size) {

		chromosomes = new Chromosome[size];
		fitnessSum = 0.0;
		
		for (int i = 0; i < size; i++) {
			chromosomes[i] = new Chromosome();
			fitnessSum += chromosomes[i].getFitness();
		}
		
		calculateFitnessRatios();
	}
	
	public void calculateFitnessRatios(){

		for (int i = 0; i < chromosomes.length; i++) {
			chromosomes[i].calculateFitnessRatio(fitnessSum);
		}
		
	}
	
	public Population (Chromosome chromosomes[]){
		
		this.chromosomes = new Chromosome[chromosomes.length];
		fitnessSum = 0.0;
		
		for(int i = 0; i < chromosomes.length; i++){
			this.chromosomes[i] = chromosomes[i];
			fitnessSum += chromosomes[i].getFitness();
		}
		
	}
	
	public Chromosome[] fittest (int size){
		
		Comparator<Chromosome> chromosomesByFitness = new ChromosomeComparator();
		Chromosome[] returnChromosomes = new Chromosome[size];
		
		Arrays.sort(chromosomes, chromosomesByFitness);
		
		for (int i = 0; i < size; i++) {
			chromosomes[i].getFitness();
			returnChromosomes[i] = chromosomes[i];
		}

		//Collections.shuffle(Arrays.asList(returnChromosomes));
		
		return returnChromosomes;
	}

	public String toString() {

		String res = "Population[" + chromosomes.length +  "] \n";
		res += "Gemiddelde fitness: " + (fitnessSum / chromosomes.length) + "\n";
		for (int i = 0; i < chromosomes.length; i++) {
			res += "Chromosoom " + (i + 1) + ": " + chromosomes[i]
					+ ", Distance: "
					+ chromosomes[i].getDistance() + " "
					+ ", Fitness: "
					+ chromosomes[i].getFitness() + " "
					+ ", Fitness Ratio: "
					+ chromosomes[i].getFitnessRatio() + " \n";
		}
		return res;

	}

}
