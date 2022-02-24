package com.tripinseoul.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tripinseoul.DAO.Cat1DAO;
import com.tripinseoul.VO.Cat1VO;

@Controller
public class HCTestController {
	@Autowired
	Cat1DAO c1dao;
	
	@RequestMapping("/hc")
	public void hc() {
		System.out.println("hchc");
		Cat1VO c = new Cat1VO();
		c.setId("명동11");
		Cat1VO c2 = c1dao.getCat1(c);
		
		System.out.println(c2);
		
		
		
		
		
		
		
		
	}
}
