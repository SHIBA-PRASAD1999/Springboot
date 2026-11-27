package com.mvc.controller.quearyparam;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Queryparam {
@GetMapping("/msg")
	public ModelAndView getmsg(@RequestParam ("name") String uname) {

		String msgtet = uname + " good morning";
		ModelAndView mv = new ModelAndView();
		mv.addObject("msg", msgtet);
		mv.setViewName("index");
		return mv;

	}

}
