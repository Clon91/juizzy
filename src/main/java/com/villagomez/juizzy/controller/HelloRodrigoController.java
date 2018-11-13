package com.villagomez.juizzy.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.villagomez.juizzy.constants.Constants;
import com.villagomez.juizzy.model.Person;
import com.villagomez.juizzy.util.Util;

@Controller
@RequestMapping("/example")
public class HelloRodrigoController {
	
	@Autowired Util util;
	
	@GetMapping("/MAV")
	public ModelAndView exampleMAV() throws NoSuchMethodException, SecurityException, IOException {
		ModelAndView mav = new ModelAndView(Constants.VIEW_EXAMPLE);
		mav.addObject("name", "Diana");
		mav.addObject("person", new Person("Rodrigo", 26));
		mav.addObject("people", getPeople());
		Constants.TYPES type = Constants.TYPES.INFO;
		util.logAdd(HelloRodrigoController.class, Thread.currentThread().getStackTrace()[1].getMethodName(), "Ejecucion exitosa", type);
		return mav;
	}
	
	private List<Person> getPeople() throws NoSuchMethodException, SecurityException, IOException{
		List<Person> people = new ArrayList<>();
		people.add(new Person("Irving", 2));
		people.add(new Person("Victor", 7));
		people.add(new Person("Jose", 3));
		people.add(new Person("Ivan", 1));
		people.add(new Person("Rodrigo", 26));
		Constants.TYPES type = Constants.TYPES.ERROR;
		util.logAdd(HelloRodrigoController.class, Thread.currentThread().getStackTrace()[1].getMethodName(), "Metodo para enlistar los nombres", type);
		return people;
	}

}
