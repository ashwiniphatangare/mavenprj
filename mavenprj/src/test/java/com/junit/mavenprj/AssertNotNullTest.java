package com.junit.mavenprj;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class AssertNotNullTest {
public String getPropValue(final String key) {
	Map<String,String> ap=new HashMap <String,String> ();
	ap.put("key1", "value1");
	ap.put("key2", null);
	ap.put("key3", "value3");
	ap.put("key4", "value4");
	return ap.get(key);
}
@Test
public void test() {
	AssertNotNullTest ant=new AssertNotNullTest();
	//assertNotNull(ant.getPropValue("key1"));
	//assertNull(ant.getPropValue("key2"));
	//assertNotSame(ant.getPropValue("key1"),ant.getPropValue("key2"));
	assertSame(ant.getPropValue("key1"),ant.getPropValue("key2"));


}
}
