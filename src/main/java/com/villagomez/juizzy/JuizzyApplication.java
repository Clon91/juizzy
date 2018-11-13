package com.villagomez.juizzy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.apache.log4j.PropertyConfigurator;

@SpringBootApplication
public class JuizzyApplication {
	
	public static void main(String[] args) {
		PropertyConfigurator.configure("log4j.properties");
		SpringApplication.run(JuizzyApplication.class, args);
	}
}
