package com.junit.mavenprj;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringDemo {
	


	@Test
	public void addTest() {
		String s1="INDIA";

		boolean result=StringTestDEmo.checkString(s1);
		System.out.println("cantains result  is=" +result);
		assertEquals(true,result);
	}
	
}