package com.vvitu.junit_test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

//Assertions
//Annotations
public class AppTest {
	@Test
	
	public void testFindMax() {
		
	assertEquals(9,App.findMax(9,4));
	}
	@Test
	
	public void testFindMax2() {
		
	assertEquals(9,App.findMax(9,4));

}
}
