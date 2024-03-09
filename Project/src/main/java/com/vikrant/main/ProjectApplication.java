package com.vikrant.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectApplication {

	public static void main(String[] args) {
		System.out.println("Server is starting");
		SpringApplication.run(ProjectApplication.class, args);
		System.out.println("Hello World");
		System.out.println("Server started");
		
	}

}
