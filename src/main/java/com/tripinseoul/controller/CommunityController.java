package com.tripinseoul.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CommunityController {
	@RequestMapping("/community")
	public String community() {
		System.out.println("community");
		
		return "community/community_main";
	}
	@RequestMapping("/community/detail")
	public String community_detail() {
		System.out.println("comm detail");
		
		return "community/community_detail";
	}
}
