package com.timbuchalka.spring.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeControl {
	
	
	@RequestMapping("/")
	public String doWelcome(Model model){
		
	}

}
