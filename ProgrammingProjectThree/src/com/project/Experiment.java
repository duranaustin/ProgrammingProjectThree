package com.project;
/**
 * @Authors: Jorge Jimenez, Pauline Makoma, Christian Makoma, Austin Duran
 * @Project Programming Project3
 * @Course CSIS-2430
 */
public class Experiment {

    final private int number;
    final private String experiment;
    final private double weight;
    final private int rate;
    private double lambda;

    public Experiment(int number, String experiment, double weight, int rate) {
        this.number = number;
        this.experiment = experiment;
        this.weight = weight;
        this.rate = rate;
        this.lambda = this.weight/this.rate;
    }

    public int getNumber() {
        return number;
    }

    public String getExperiment() {
        return experiment;
    }

    public double getWeight() {
        return weight;
    }

    public int getRate() {
        return rate;
    }

    public double getLambda(){
        return lambda;
    }

    public String toString(){
//        return " | " + number + " | " + experiment + " | " + weight + " | " + rate + " | " + String.format("%.3f", lambda) + " | ";
        return String.format("| %2d | %25s | %5.1f | %d | %.3f", number, experiment, weight, rate, lambda);
        

    }

}
