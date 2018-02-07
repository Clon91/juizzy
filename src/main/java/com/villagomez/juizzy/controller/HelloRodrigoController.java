package com.villagomez.juizzy.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.villagomez.juizzy.constants.Constants;
import com.villagomez.juizzy.model.Person;

@Controller
@RequestMapping("/example")
public class HelloRodrigoController {
	
	@GetMapping("/MAV")
	public ModelAndView exampleMAV() {
		ModelAndView mav = new ModelAndView(Constants.VIEW_EXAMPLE);
		mav.addObject("name", "Diana");
		mav.addObject("person", new Person("Rodrigo", 26));
		mav.addObject("people", getPeople());
		return mav;
	}
	
	private List<Person> getPeople(){
		List<Person> people = new ArrayList<>();
		people.add(new Person("Diana", 2));
		people.add(new Person("Rodrigo", 7));
		people.add(new Person("Ivana", 3));
		people.add(new Person("Emanuel", 1));
		return people;
	}

}
