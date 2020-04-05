package com.ust.wa;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
//	@RequestMapping("home")
//	public void home() {
//		System.out.println("Athithi devo bhava!!!!");
//	}
	
	@RequestMapping("home")
	public String home() {
		return "home.jsp";
	}
}
