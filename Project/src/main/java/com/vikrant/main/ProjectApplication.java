package com.vikrant.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Main class
@SpringBootApplication
@RestController
public class ProjectApplication {

	public static void main(String[] args) {
		System.out.println("Server is starting");
		SpringApplication.run(ProjectApplication.class, args);
		System.out.println("Hello World");
		System.out.println("Server started");
		
		
	}
	
	@GetMapping("/basic")
	public String basicAPI() {
		return "Hello from basic API";
	}

}
