package com.gov.nglfm.demo.view;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {
	
	@RequestMapping("/light")
	public String lightView(Model model) {
		model.addAttribute("size", "light");
		System.out.println("ligth is called.");
		return "index";
	}

}
