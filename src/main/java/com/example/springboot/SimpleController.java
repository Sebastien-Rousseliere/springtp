package com.example.springboot;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.Calendar;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SimpleController {

	@Value("${spring.application.name}")

		String appName;
	
	@GetMapping("/")

	public String homePage(Model model) {
		model.addAttribute("appName", appName);
		return "home";
	}
	
	@GetMapping("/time")
	public String hoursPage(Model model) {
		model.addAttribute("localDateTime", LocalDateTime.now());
		
		return "hours";
	}
	
	
	
}
