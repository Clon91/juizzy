package com.villagomez.juizzy.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.villagomez.juizzy.constants.Constants;
import com.villagomez.juizzy.util.Util;

@Controller
@RequestMapping("/aplication")
public class IndexController {

	@Autowired Util util;
	
	@GetMapping("/index")
	public ModelAndView indexAplication() throws NoSuchMethodException, SecurityException, IOException {
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("name","Rodrigo");
		mav.addObject("age", 26);
		Constants.TYPES type = Constants.TYPES.WARN;
		util.logAdd(IndexController.class, Thread.currentThread().getStackTrace()[1].getMethodName(), "Ejecucion exitosa", type);
		return mav;
	}
}
