package com.tripinseoul.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TripInSeoulController {
	
	@RequestMapping("intro")
	public String intro() {
		System.out.println("intro");
		
		return "tripinseoul/tripINSEOUL";
	}
}

