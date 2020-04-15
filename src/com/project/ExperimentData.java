package com.project;

import java.util.ArrayList;

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

    ArrayList<Experiment> experiments = new ArrayList();
    ArrayList experimentsPermutations = new ArrayList();

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

    }

}
