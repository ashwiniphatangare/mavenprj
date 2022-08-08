package com.junit.mavenprj;




import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class AsserArrayTest {

@Test
public void test() {
	char[] expected= {'j','u','n','i','t'};
	char[] actual= "junit".toCharArray();

//assertArrayEquals(new int[] {1,2,3},new int[] {1,2,3});
	assertArrayEquals(expected,actual);
}
}



