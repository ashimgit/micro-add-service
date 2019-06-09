package com.add.microaddservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.add.controller")
public class MicroAddServiceApplication {

	public static void main(String[] args) {
		System.out.println("Spring boot started ...");
		SpringApplication.run(MicroAddServiceApplication.class, args);
		System.out.println("Spring boot Ended ...");
	}

}
