package com.project;
/**
 * @Authors: Jorge Jimenez, Pauline Makoma, Christian Makoma, Austin Duran
 * @Project Programming Project3
 * @Course CSIS-2430
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Stack;

public class KnapSack {

    private int maxWeight;
    public double weightCounter = 0;
    private ArrayList<Experiment> knapSackByRate = new ArrayList<>();
    private ArrayList<Experiment> knapSackByWeight = new ArrayList<>();
    private ArrayList<Experiment> knapSackByLambda = new ArrayList<>();

    public static Comparator<Experiment> orderByRate = new Comparator<Experiment>() {
        @Override
        public int compare(Experiment o1, Experiment o2) {
            return o2.getRate() - o1.getRate();
        }
    };
    public static Comparator<Experiment> orderByWeight = new Comparator<Experiment>() {
        @Override
        public int compare(Experiment o1, Experiment o2) {
            return Double.compare(o2.getWeight(),o1.getWeight());
        }
    };
    
    public static Comparator<Experiment> orderByWeightAscending = new Comparator<Experiment>() {
        @Override
        public int compare(Experiment o1, Experiment o2) {
            return Double.compare(o1.getWeight(),o2.getWeight());
        }
    };
    public static Comparator<Experiment> orderByLambda = new Comparator<Experiment>() {
        @Override
        public int compare(Experiment o1, Experiment o2) {
            return Double.compare(o2.getLambda(),o1.getLambda());
        }
    };



    KnapSack(int maxWeight, ExperimentData weight, ExperimentData rate, ExperimentData lambda){
        this.maxWeight = maxWeight;
     
        
        getRate(rate);
        System.out.println("\nSubset of experiment by Rate"); 
    	for(Experiment ex: knapSackByRate) {
    		System.out.println(ex);
    	}
    	
    	totals(knapSackByRate);
    	 
    	
        getWeight(weight);
        System.out.println("\nSubset of experiment by weight"); 
      	for(Experiment ex: knapSackByWeight) {
      		System.out.println(ex);
      	}
      	
      	totals(knapSackByWeight);
      	

        getLambda(lambda);
        System.out.println("\nSubset of experiment by Lambda"); 
    	for(Experiment ex: knapSackByLambda) {
    		System.out.println(ex);
    	}
        
    	totals(knapSackByLambda);

    }

    private void getWeight(ExperimentData weight) {
        Collections.sort(weight.experiments, orderByWeight);

        for(int i = 0; weightCounter <= maxWeight; i++){
            weightCounter += weight.experiments.get(i).getWeight();
            if(weightCounter <= maxWeight){
                knapSackByWeight.add(weight.experiments.get(i));
            }
        }
        weightCounter = 0;
        
    }

    private void getRate(ExperimentData rate) {

        Collections.sort(rate.experiments, orderByRate);
       

        for(int i = 0; weightCounter <= maxWeight; i++){
            weightCounter += rate.experiments.get(i).getWeight();
            if(weightCounter <= maxWeight){
                knapSackByRate.add(rate.experiments.get(i));
            }
        }
        weightCounter = 0;
    }

    private void getLambda(ExperimentData lambda) {

        Collections.sort(lambda.experiments, orderByLambda);


        for(int i = 0; weightCounter <= maxWeight; i++){
            weightCounter += lambda.experiments.peek().getWeight();
            if(weightCounter <= maxWeight){
                knapSackByLambda.add(lambda.experiments.pop());
            }
            
        }

        weightCounter -= lambda.experiments.peek().getWeight();
        Collections.sort(lambda.experiments, orderByWeight);
       
         
        for(int i = 0; weightCounter <= maxWeight; i++){
            weightCounter += lambda.experiments.peek().getWeight();
            if(weightCounter <= maxWeight){
                knapSackByLambda.add(lambda.experiments.pop());
            }
        }
        

        weightCounter = 0;
    }

    static void totals(ArrayList<Experiment> exp) {
    	double weight = 0,  lambda = 0;
    	int rate = 0;
    	
    	for(Experiment ex: exp) {
    		weight += ex.getWeight();
    		lambda += ex.getLambda();
    		rate += ex.getRate();
    	}
    	System.out.printf("Weight: %.2f, Lambda: %.2f, rate: %d\n\n", weight, lambda, rate);
    	
    	
    }
    
    
}
