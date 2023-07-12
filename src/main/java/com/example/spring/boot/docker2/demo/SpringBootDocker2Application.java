package com.example.spring.boot.docker2.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController 
public class SpringBootDocker2Application {

	@GetMapping(value = "/messages")
	public String getMessage() {
		
		return "Welcome to my second Springboot Application!";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDocker2Application.class, args);
	}

}
