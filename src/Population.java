import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Population {

	private Chromosome chromosomes[];

	public Population(int size) {

		chromosomes = new Chromosome[size];

		for (int i = 0; i < size; i++) {
			chromosomes[i] = new Chromosome();
		}

	}
	
	public Population (Chromosome chromosomes[]){
		
		this.chromosomes = new Chromosome[chromosomes.length];
		for(int i = 0; i < chromosomes.length; i++){
			this.chromosomes[i] = chromosomes[i];
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

		String res = "Population[" + chromosomes.length +  "]: \n";
		for (int i = 0; i < chromosomes.length; i++) {
			res += "Chromosoom " + (i + 1) + ": " + chromosomes[i]
					+ ", Fitness: "
					+ chromosomes[i].getFitness() + " \n";
		}
		return res;

	}

}
