package com.example.FindDoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example.FindDoc"})
public class FindDocApplication {

	public static void main(String[] args) {
		SpringApplication.run(FindDocApplication.class, args);
	}

}
