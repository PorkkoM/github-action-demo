package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GitDemo1Application {

	public static void main(String[] args) {
		SpringApplication.run(GitDemo1Application.class, args);
	}
	
	@GetMapping("/hello")
	public String test() {
		return "Test EndPoint";
	}

}
