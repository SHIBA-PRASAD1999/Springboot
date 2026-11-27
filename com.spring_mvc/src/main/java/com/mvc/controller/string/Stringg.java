
package com.mvc.controller.string;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class Stringg {

    @GetMapping("/call")
    public String getmsg(@RequestParam String name, Model model) {


        model.addAttribute("msg", "Hii " + name + " good morning");

        return "index";
    }
}
