package com.project;

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
