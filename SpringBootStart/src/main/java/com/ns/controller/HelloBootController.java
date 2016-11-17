package com.ns.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HelloBootController {
	@RequestMapping("/")
	public ModelAndView helloPage() {
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("name", "ken");
		return mav;
	}

	@RequestMapping("/hello/{name}")
	public @ResponseBody String hello(@PathVariable("name") String name) {
		return "Hello " + name;
	}
}