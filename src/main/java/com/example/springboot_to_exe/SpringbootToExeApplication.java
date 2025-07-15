package com.example.springboot_to_exe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootToExeApplication {

	public static void main(String[] args) {
		 System.out.println(" Starting MySpringApp on port 8080...");
        SpringApplication.run(SpringbootToExeApplication.class, args);
        System.out.println(" MySpringApp started successfully!");
	}

}
