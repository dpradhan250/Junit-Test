package com.dpradhan;

public class Calculator {
	
	public Integer add(Integer a, Integer b) {
		return a+b;
	}
	
	public Integer mul(Integer a, Integer b) {
		return a*b;
	}
	
	public Integer div(Integer a, Integer b) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return a/b;
	}

}
