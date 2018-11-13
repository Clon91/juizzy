package com.villagomez.juizzy.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.villagomez.juizzy.constants.Constants;
import com.villagomez.juizzy.util.Util;

@Controller
@RequestMapping("/say")
public class HelloWorldController {
	
	@Autowired Util util;
	
	@GetMapping("/hello")
	public String helloWorld() throws NoSuchMethodException, SecurityException, IOException {
		Constants.TYPES type = Constants.TYPES.DEBUG;
		util.logAdd(HelloWorldController.class, Thread.currentThread().getStackTrace()[1].getMethodName(), "Ejecucion exitosa", type);
		return "helloworld";
	}
}
