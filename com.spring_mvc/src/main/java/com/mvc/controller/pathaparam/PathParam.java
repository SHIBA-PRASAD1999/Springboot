package com.mvc.controller.pathaparam;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class PathParam {

    @GetMapping("/car/{carid}/location/{location}/carname/{name}")
    public ModelAndView getDetails(
            @PathVariable int carid,
            @PathVariable String location,
            @PathVariable String name) {

        ModelAndView mv = new ModelAndView();

        if (carid > 10) {
            mv.addObject("msg",
                    "The car " + name + " is available in " + location);
        } else {
            mv.addObject("msg",
                    "The car " + name + " is not available in " + location);
        }

        mv.setViewName("index");

        return mv;
    }
}
