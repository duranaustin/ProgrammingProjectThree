package com.project;

import java.util.ArrayList;

public class Main {
	
	 static void printSubsets(int permutations[]) 
	    { 
	        int n = permutations.length; 
	  
	        // Run a loop for printing all 2^n 
	        // subsets one by one 
	        for (int i = 0; i < (1<<n); i++) 
	        { 
	            System.out.print("{ "); 
	  
	            // Print current subset 
	            for (int j = 0; j < n; j++) 
	  
	                // (1<<j) is a number with jth bit 1 
	                // so when we 'and' them with the 
	                // subset number we get which numbers 
	                // are present in the subset and which 
	                // are not 
	                if ((i & (1 << j)) > 0) 
	                    System.out.print(permutations[j] + " "); 
	  
	            System.out.println("}"); 
	        } 
	    } 
	
//	 private static ExperimentData newpermutations;
	 
    public static void main(String[] args) {
        ExperimentData data = new ExperimentData();
        ExperimentData dataTwo = new ExperimentData();
        ExperimentData dataThree = new ExperimentData();



        KnapSack test = new KnapSack(700,data, dataTwo, dataThree);
        //PayLoad payLoad = new PayLoad
//        data.experiments.forEach((n) -> System.out.println(n));
        // write your code here
        
   
        
        int[] perm = {0,1,2,3,4,5,6,7,8,9,10,11};
        
        //printSubsets(perm); 

    
    
}
    
}
