package com.project;
/**
 * @Authors: Jorge Jimenez, Pauline Makoma, Christian Makoma, Austin Duran
 * @Project Programming Project3
 * @Course CSIS-2430
 */
import java.util.ArrayList;

public class PayLoad implements Comparable<PayLoad>{
	
	ArrayList<Experiment> subset = new ArrayList();
	int rating = 0;
	int weight = 0;
	
	
	PayLoad(ArrayList<Experiment> subset){
		this.subset = subset;
		for(Experiment e: subset){
			rating += e.getRate();
			weight += e.getWeight();
		}
		
	}

	@Override
	public int compareTo(PayLoad o) {
		// TODO Auto-generated method stub
		return Integer.compare(o.rating, this.rating);
	}

}
