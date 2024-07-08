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
	
	@AfterClass
	public static void destroy1() {
		calc=null;
	}
	

}
