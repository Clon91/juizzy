package com.villagomez.juizzy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.villagomez.juizzy.constants.*;

@Controller
@RequestMapping("/example")
public class HelloRodrigoController {
	
	@GetMapping("/MAV")
	public ModelAndView exampleMAV() {
		return new ModelAndView(Constants.VIEW_EXAMPLE);
	}

}
