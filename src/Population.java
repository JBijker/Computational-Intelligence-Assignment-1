import java.lang.reflect.Array;

public class Population {

	private Chromosome chromosomes[];

	public Population(int size) {

		chromosomes = new Chromosome[size];

		for (int i = 0; i < size; i++) {
			chromosomes[i] = new Chromosome();
		}

	}

	public String toString() {

		String res = "";
		for (int i = 0; i < chromosomes.length; i++) {
			res += "Chromosoom " + (i + 1) + ": " + chromosomes[i]
					+ ", Fitness: "
					+ Main.roads.getFitness(chromosomes[i]) + " \n";
		}
		return res;

	}

}
