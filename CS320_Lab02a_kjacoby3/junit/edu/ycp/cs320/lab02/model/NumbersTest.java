package edu.ycp.cs320.lab02.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.ycp.cs320.lab02a_kjacoby3.model.Numbers;

public class NumbersTest {
	private Numbers model;
	
	@Before
	public void setUp() {
		model = new Numbers();
	}
	
	@Test
	public void testSetFirst() {
		model.setFirst(10.0);
		assertTrue(model.getFirst() == 10.0);
	}
	
	@Test
	public void testSetSecond() {
		model.setSecond(20);
		assertTrue(model.getSecond() == 20.0);
	}
	
	@Test
	public void testSetThird() {
		model.setThird(30.0);
		assertTrue(model.getThird() == 30.0);
	}
}
