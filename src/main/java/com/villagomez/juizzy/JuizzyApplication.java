package com.villagomez.juizzy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.villagomez.juizzy.constants.Constants;
import com.villagomez.juizzy.util.Util;

import java.io.IOException;

import org.apache.log4j.PropertyConfigurator;

@SpringBootApplication
public class JuizzyApplication {
	
	@Autowired Util util;
	
	public static void main(String[] args){
		
		SpringApplication.run(JuizzyApplication.class, args);
		
	}
}
