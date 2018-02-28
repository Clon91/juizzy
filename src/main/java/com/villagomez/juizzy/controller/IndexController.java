package com.villagomez.juizzy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/aplication")
public class IndexController {

	@GetMapping("/index")
	public ModelAndView indexAplication() {
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("name","Rodrigo");
		mav.addObject("age", 26);
		return mav;
	}
}
