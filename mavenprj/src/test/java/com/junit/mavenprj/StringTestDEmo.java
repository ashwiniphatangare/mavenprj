package com.junit.mavenprj;

import static org.junit.Assert.assertEquals;

public class StringTestDEmo {
	public static void mail(String[] args) {
		String s2="INDIA";
		assertEquals(true,checkString("IND"));
	}
	static boolean checkString(String s) {
		// TODO Auto-generated method stub
		String s2="INDIA";
		if(s2.contains(s))
		{
			return true;
		}
		return false;
	}

}
