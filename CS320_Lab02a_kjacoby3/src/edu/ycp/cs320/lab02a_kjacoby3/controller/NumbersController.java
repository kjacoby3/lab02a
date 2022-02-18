package edu.ycp.cs320.lab02a_kjacoby3.controller;

import edu.ycp.cs320.lab02a_kjacoby3.model.Numbers;

public class NumbersController {
	private Numbers model;
	
	public void setModel(Numbers model) {
		this.model = model;
	}
	
	public double add() {
		return model.getFirst() + model.getSecond() + model.getThird();
	}
	
	public double multiply() {
		return model.getFirst() * model.getSecond();
	}
//	public Double add(Double first, Double second, Double third) {
//		return first + second + third;
//	}
//	
//	public Double multiply(Double first, Double second) {
//		return first * second;
//	}
}
