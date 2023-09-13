package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestAssert {
	
	@Test
	public void test1() {
		String actual ="Ankita";
		String expected ="Ankit";
		Assertions.assertEquals(expected,actual);
		
	}

	
	@Test
	public void test2() {
		String actual ="Ankita";
		String expected ="Ankit";
		Assertions.assertEquals(expected,actual,"The results are not equal");
		
	}
}
