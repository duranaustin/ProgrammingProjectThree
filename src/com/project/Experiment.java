package com.project;

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
        return " | " + number + " | " + experiment + " | " + weight + " | " + rate + " | " + String.format("%.3f", lambda) + " | ";

    }

}
