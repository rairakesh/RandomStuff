/**
 * 
 */
package com.src.siyonllc.randomexample.mycollection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Rakesh Rai
 * 
 *         Refer to :https://www.youtube.com/watch?v=GYtt29ZoNw8 for creating
 *         JUNit tests in eclipse
 */
public class MyCustomMapTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testStandardMap() {
		// Standard Map
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Abc", 1);
		map.put("Abc", 2);
		map.put("Abc", 1);

		Integer val1 = map.get("Abc");
		assert (val1 == 1);
		for (int i = 0; i < 100; i++) {
			map.put(String.valueOf(i), i);
		}
		assertEquals(map.size(), 101);

		Integer val2 = map.get("51");
		assert (val2 == 51);
		map.keySet();
	}

	@Test
	public void testMyCustomMap() {

		// MyMap
		MyCustomMap<String, Integer> map = new MyCustomMap<String, Integer>();
		map.put("Abc", 1);
		map.put("Abc", 2);
		map.put("Abc", 1);
		Integer val1 = map.get("Abc");
		assert (val1 == 1);
		for (int i = 0; i < 100; i++) {
			map.put(String.valueOf(i), i);
		}
		assertEquals(map.size(), 101);

	}

}
