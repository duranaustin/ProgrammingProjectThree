package com.project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class KnapSack {

    private int maxWeight;
    public double weightCounter = 0;
    private ArrayList knapSackByRate = new ArrayList();
    private ArrayList knapSackByWeight = new ArrayList();
    private ArrayList knapSackByLambda = new ArrayList();

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
    public static Comparator<Experiment> orderByLambda = new Comparator<Experiment>() {
        @Override
        public int compare(Experiment o1, Experiment o2) {
            return Double.compare(o2.getLambda(),o1.getLambda());
        }
    };



    KnapSack(int maxWeight, ExperimentData weight, ExperimentData rate, ExperimentData lambda){
        this.maxWeight = maxWeight;
        System.out.println("Rate Sort");
        getRate(rate);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Weight Sort");
        getWeight(weight);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Lamda Sort");
        getLambda(lambda);
    }

    private void getWeight(ExperimentData weight) {
        Collections.sort(weight.experiments, orderByWeight);
        weight.experiments.forEach((n) -> System.out.println(n));

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
        rate.experiments.forEach((n) -> System.out.println(n));

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
        lambda.experiments.forEach((n) -> System.out.println(n));

        for(int i = 0; weightCounter <= maxWeight; i++){
            weightCounter += lambda.experiments.get(i).getWeight();
            if(weightCounter <= maxWeight){
                knapSackByLambda.add(lambda.experiments.get(i));
            }
        }
        weightCounter = 0;
    }




}
