package com.junit.mavenprj;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class mavenAddition {

@Test
public void addTest() {
	int result=AdditionDemo.add(2, 2);
	System.out.println("addition is=" +result);
	assertEquals(4,result);
}
@Test
public void subTest() {
	int result=AdditionDemo.sub(2, 2);
	System.out.println("substraction is=" +result);
	assertEquals(0,result);}
@Test
public void mulTest() {
	int result=AdditionDemo.mul(2, 2);
	System.out.println("mul is=" +result);
	assertEquals(4,result);}
}
