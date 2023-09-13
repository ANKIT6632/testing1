package com.example.demo;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(OrderAnnotation.class)
public class Testtesting {
	
	@BeforeAll
	public static void testBeforeAll() {
		System.out.println("Hello i will run first only once");	
	}
	
	@AfterAll
	public static void testAfterAll() {
		System.out.println("Hello i will run last only once");	
	}
	
	@BeforeEach
	public void testSetup() {
		System.out.println("Hello i will run before every test method to do pre-requisite things");	
	}
	
	@AfterEach
	public void testCleanup() {
		System.out.println("Hello i will run after every test method to do clean up ");
	}
	
	@Test
	@Order(3)
	public void test() {
		System.out.println("i am here 1");	
	}
	
	@Test
	@Order(2)
	public void test2() {
		System.out.println("i am here 2");	
	}
	
	@Test
	@Order(1)
	public void test3() {
		System.out.println("i am here 3");	
	}
}
