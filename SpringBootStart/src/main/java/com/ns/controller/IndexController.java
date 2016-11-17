package com.ns.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String helloPage(Model model) {
		return "index";
	}

	@RequestMapping("/hello/{name}")
	public ModelAndView hello(@PathVariable("name") String name) {
		return new ModelAndView("index").addObject("name", name);
	}
}