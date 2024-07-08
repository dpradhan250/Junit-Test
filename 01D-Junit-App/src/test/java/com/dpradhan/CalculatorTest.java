package com.dpradhan;

import static org.junit.Assert.assertEquals;


import org.junit.*;

public class CalculatorTest {
	
	private static Calculator calc=null;
	
	@BeforeClass
	public static void init1() {
		calc=new Calculator();
	}
	
	@Test
	public void testAdd_01() {
//		Calculator c = new Calculator();
		Integer actualResult=calc.add(10, 20);
		Integer expectedResult=30;
		
		assertEquals(expectedResult,actualResult);	
				
	}
	
	@Test
	@Ignore
	public void testAdd_02() {
		Integer actual = calc.add(50,100);
		Integer expected= 150;
		
		assertEquals(expected,actual);
	}
	
	@Test
	public void testAdd_03() {
		Integer actual = calc.add(100,200);
		Integer expected= 300;
		
		assertEquals(expected,actual);
	}
	
	@Test
	public void testMul_01() {
		Integer actual =calc.mul(10, 20);
		Integer expected = 200;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testDiv_01() {
		Integer actual = calc.div(10, 4);
		Integer expected = 2;
		assertEquals(expected,actual);
	}
	
	@Test(expected = ArithmeticException.class)
	public void testDiv_02() {
		calc.div(10, 0);
//		Integer actual = calc.div(10, 0);
//		Integer expected = 2;
//		assertEquals(expected,actual);
	}
	
	@Test(timeout=100)
	public void testDev_03() {
		calc.div(12,6);
	}
	
	@AfterClass
	public static void destroy1() {
		calc=null;
	}
	

}
