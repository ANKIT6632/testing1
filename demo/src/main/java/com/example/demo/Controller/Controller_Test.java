package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller_Test {

	String name = " Ankit Kumar Ranjan";
	
	@GetMapping("/test1")
	public String test1() {
		return " testing 1 successful "+name;
	}
	
	@GetMapping("/test2")
	public String test2() {
		return " testing 2 successful ";
	}
	
	@GetMapping("/test3")
	public String test3() {
		return " testing 3 successful ";
	}
	
	@GetMapping("/test4")
	public String test4() {
		return " testing 7 successful ";
	}
	
	@GetMapping("/test5")
	public String test5() {
		int a =13;
		if(a>11) {
			String test = "my name is ankit kumar ranjan ";
			test=test.toUpperCase();
			test=test.toLowerCase();
			return test;
		}
		return "condition failed";
		
	}
}
