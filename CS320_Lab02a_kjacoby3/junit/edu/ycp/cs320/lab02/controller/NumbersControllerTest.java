package edu.ycp.cs320.lab02.controller;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import edu.ycp.cs320.lab02a_kjacoby3.controller.NumbersController;
import edu.ycp.cs320.lab02a_kjacoby3.model.Numbers;

public class NumbersControllerTest {
	private Numbers model;
	private NumbersController controller;
	
	@Before
	public void setUp() {
		model = new Numbers();
		controller = new NumbersController();
		
		model.setFirst(1);
		model.setSecond(2);
		model.setThird(3);
		
		controller.setModel(model);
	}
	
	@Test
	public void testAdd() {
		assertTrue(controller.add() == 6.0);
	}
	
	@Test
	public void testMultiply() {
		assertTrue(controller.multiply() == 2.0);
	}
}
