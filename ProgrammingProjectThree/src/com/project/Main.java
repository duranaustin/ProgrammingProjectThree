package com.project;
/**
 * @Authors: Jorge Jimenez, Pauline Makoma, Christian Makoma, Austin Duran
 * @Project Programming Project3
 * @Course CSIS-2430
 */
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	
	
	
//	 private static ExperimentData newpermutations;
	 
    public static void main(String[] args) {
    	
        ExperimentData data = new ExperimentData();
        ExperimentData dataTwo = new ExperimentData();
        ExperimentData dataThree = new ExperimentData();

        System.out.println("Total(12) Experiments");
        for(Experiment e: data.expList) {
      	  System.out.println(e.toString());
        }


        KnapSack test = new KnapSack(700,data, dataTwo, dataThree);
    
        System.out.println("Permutation with the highest rate");
        data.getPermutations();
  
}
    
}
