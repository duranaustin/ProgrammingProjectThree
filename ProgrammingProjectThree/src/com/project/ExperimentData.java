package com.project;
/**
 * @Authors: Jorge Jimenez, Pauline Makoma, Christian Makoma, Austin Duran
 * @Project Programming Project3
 * @Course CSIS-2430
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class ExperimentData {
    final Experiment one = new Experiment(1, "Cloud Patterns", 36, 5);
    final Experiment two = new Experiment(2, "Solar Flares", 264, 9);
    final Experiment three = new Experiment(3, "Solar Power", 188, 6);
    final Experiment four = new Experiment(4, "Binary Stars", 203, 8);
    final Experiment five = new Experiment(5, "Relativity", 104, 8);
    final Experiment six = new Experiment(6, "Seed Viability", 7, 4);
    final Experiment seven = new Experiment(7, "Sun Spots", 90, 2);
    final Experiment eight = new Experiment(8, "Mice Tumors", 65, 8);
    final Experiment nine = new Experiment(9, "Microgravity Plant Growth", 75, 5);
    final Experiment ten = new Experiment(10, "Micrometeorites", 170, 9);
    final Experiment eleven = new Experiment(11, "Cosmic Rays", 80, 7);
    final Experiment twelve = new Experiment(12, "Yeast Fermentation", 27, 4);

    Stack<Experiment> experiments = new Stack();
    ArrayList<Experiment> expList ;
    ArrayList<PayLoad> permutations = new ArrayList();
    
    
    	

    ExperimentData(){
        experiments.add(one);
        experiments.add(two);
        experiments.add(three);
        experiments.add(four);
        experiments.add(five);
        experiments.add(six);
        experiments.add(seven);
        experiments.add(eight);
        experiments.add(nine);
        experiments.add(ten);
        experiments.add(eleven);
        experiments.add(twelve);
        
      expList = new ArrayList();  
      expList.addAll(experiments);
      
     
    }
    

	 public void printSubsets(ArrayList<Experiment> experiments ) 
	    { 
		 ArrayList<Experiment> templist = new ArrayList();
	        int n = experiments.size(); 
	        PayLoad temp = null;
	        // Run a loop for printing all 2^n 
	        // subsets one by one 
	        for (int i = 0; i < (1<<n); i++) 
	        { 

	        	templist = new ArrayList<>();
	            // Print current subset 
	            for (int j = 0; j < n; j++) 
	  
	                // (1<<j) is a number with jth bit 1 
	                // so when we 'and' them with the 
	                // subset number we get which numbers 
	                // are present in the subset and which 
	                // are not 
	                if ((i & (1 << j)) > 0) 
	                {	
	                	templist.add(experiments.get(j));
	
	                }
	            		temp = new PayLoad(templist);
	            	if (temp != null && validatePayloads(temp))
	            		permutations.add(new PayLoad(templist));

	        } 
	    } 
    
    public void getPermutations() {
    	printSubsets(expList);
    	
        greatestPayLoad().subset.forEach((n) -> System.out.println(n)); 
        KnapSack.totals(greatestPayLoad().subset);
        
    }
	 
	 public boolean validatePayloads(PayLoad p) {
		 return p.weight <= 700;
	 }
	 
	 public PayLoad greatestPayLoad() {
		Collections.sort(permutations);
		return permutations.get(0);
	 }
	 
	 
}
