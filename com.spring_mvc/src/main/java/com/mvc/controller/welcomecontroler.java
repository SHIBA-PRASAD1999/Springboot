package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.method.support.ModelAndViewContainer;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class welcomecontroler {
	@GetMapping("/welcome")
	public ModelAndView getwelcomemsg() {

		ModelAndView mav = new ModelAndView();

		mav.addObject("msg", "welcome to Bijaya automotive");
		mav.setViewName("index");

		return mav;

	}

	@GetMapping("/greet")
	public ModelAndView get() {

		ModelAndView mav = new ModelAndView();

		mav.addObject("msg", "good evening");
		mav.setViewName("index");

		return mav;

	}
}
