package com.spring.mvc;

import org.springframework.stereotype.Controller;  
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller  
public class Hello {
	@ResponseBody
	@RequestMapping("/index")
    public String query(Model model) {  
        model.addAttribute("user", "ddd");  
        return "home";
    }
	
	@RequestMapping("/query")
    public String query1(Model model) {
        model.addAttribute("user", "ddd---");
        return "home1";
    }
}