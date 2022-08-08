package com.junit.mavenprj;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AssertionTest {
@Test
public void AssertionTest() {
	String str1=new String("abs");
	String str2=new String("abs");
	String str3=null;
	String str4="abc";
	String str5="abc";
	int val1=5;
	int val2=6;
	char[] expected= {'j','u','n','i','t'};
	char[] actual= "junit".toCharArray();
	assertEquals(str1,str2);
	assertTrue(val1<val2);
	assertFalse(val1>val2);
	assertNull(str3);

	assertNotNull(str1);
	assertSame(str4,str5);
	assertNotSame(str1,str3);
	assertArrayEquals(expected,actual);

	



}

private void asserSame(String str4, String str5) {
	// TODO Auto-generated method stub
	
}
}
