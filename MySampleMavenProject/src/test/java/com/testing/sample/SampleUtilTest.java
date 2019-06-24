package com.testing.sample;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

//import static org.junit.Assert.assertEquals;

public class SampleUtilTest {
	
	@Test
	public void testAdd() {
		Integer a = 10;
		Integer b = 20;
		Integer expResult = 30;
		
		Integer result = SampleUtil.sum(a,b);
		
		assertEquals(expResult, result);
//		assertEquals(null, SampleUtil.sum(15, null));
//		assertEquals(null, SampleUtil.sum(null, 15));
//		assertEquals(null, SampleUtil.sum(null, null));
	}
	
	@Test
	public void testAdd1() {
		assertEquals(null, SampleUtil.sum(15, null));
	}
	
	@Test
	public void testAdd2() {
		assertEquals(null, SampleUtil.sum(null, 15));
	}
	
	@Test
	public void testAdd3() {
		assertEquals(null, SampleUtil.sum(null, null));
	}
}
