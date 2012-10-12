import java.util.*;

public class Chromosome {

	private Integer genes[];
	private int N;
	private int startCity;
	private double fitness;
	
	public Chromosome () {
		
		N = Main.N;
		this.startCity = Main.startCity;
		
		genes = new Integer[N-1];
		
		fillRandom();
		
	}
	
	public void fillRandom(){
		
		int j = 0;
		for (int i = 0; i < N; i++) {
			if(i != startCity){
				genes[j] = i;
				j++;
			}
		}
		Collections.shuffle(Arrays.asList(genes));
		
	}
	
	public double getFitness(){
		if(this.fitness == 0){
			this.fitness = Main.roads.getFitness(this);
		}
		return this.fitness;
	}
	
	public Integer[] getGenes(){
		
		return genes;
		
	}
	
	public String toString(){
		String res = "[ ";
		for(int i = 0; i < (N - 1); i++){
			res += genes[i] + " ";
		}
		return res + "]";
	}
	
}
