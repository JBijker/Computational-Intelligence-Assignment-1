import java.util.Comparator;

class ChromosomeComparator implements Comparator<Chromosome>{
	// Comparator interface requires defining compare method.
    public int compare(Chromosome chromosome1, Chromosome chromosome2) {
        //... Sort on fitness.
    	
    	if (chromosome1.getFitness() > chromosome2.getFitness()){
    		return 1;
    	} else {
    		return -1;
    	}
    	
    }
}
