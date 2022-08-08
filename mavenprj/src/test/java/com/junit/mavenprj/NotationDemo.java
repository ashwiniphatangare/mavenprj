package com.junit.mavenprj;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import junit.framework.Assert;

public class NotationDemo {

//	public static void main(String[] args) {
//		
//	}
	
	
	@BeforeClass
	public static void m1() 
	{
		System.out.println("Using BeforeClass ,excuted before all test");
	}
	@Before
	public  void m2() 
	{
		System.out.println("Using Before ,excuted before all test");
	}
	@After
	public  void m3() 
	{
		System.out.println("Using After ,excuted before all test");
	}
	@AfterClass
	public static void m4() 
	{
		System.out.println("Using @AfterClass ,excuted before all test");
	}
	@Ignore
	public static void m5() 
	{
		System.out.println("Using @Ignore");
	}
//
	@Test
	public void testMethod() {
	System.out.println("test case1");

	}
	@Test(timeout=100)
	public void testMethod1() {
	System.out.println("test case");

	}

}
