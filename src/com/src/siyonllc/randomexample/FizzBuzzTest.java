package com.src.siyonllc.randomexample;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FizzBuzzTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testFizzBuzz() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		assertEquals("Fizz", fizzBuzz.fizzBuzz(3));
		assertEquals("Buzz", fizzBuzz.fizzBuzz(5));
		assertEquals("FizzBuzz", fizzBuzz.fizzBuzz(15));
		assertEquals("2", fizzBuzz.fizzBuzz(2));
		assertEquals("Buzz", fizzBuzz.fizzBuzz(100));
	}

}
