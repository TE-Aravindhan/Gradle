package com.smartek.springbootdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloGradle {
	
	@GetMapping("/hello")
	public String hello() {
		
		return "spring Boot with Gradle is super easy";
		
	}

}
