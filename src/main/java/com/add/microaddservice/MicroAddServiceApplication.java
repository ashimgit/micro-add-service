package com.add.microaddservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@EnableEurekaClient
@SpringBootApplication
@ComponentScan("com.add.controller.**")
public class MicroAddServiceApplication {

	public static void main(String[] args) {
		System.out.println("Spring boot started ...");
		SpringApplication.run(MicroAddServiceApplication.class, args);
		System.out.println("Spring boot Ended ...");
	}

}
