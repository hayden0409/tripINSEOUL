package com.tripinseoul.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tripinseoul.LocationService.CatService;
import com.tripinseoul.LocationService.LocationService;
import com.tripinseoul.VO.Cat1VO;
import com.tripinseoul.VO.Cat2VO;
import com.tripinseoul.VO.LocationVO;

@Controller
public class TripInSeoulController {
	
	@Autowired
	CatService catService;
	@Autowired
	LocationService locationService;
	
	@RequestMapping("/tripinseoul")
	public String tripinseoul_main(Model model) {
		System.out.println("tripinseoul");
		
		model.addAttribute("cat1List",catService.getCat1List(new Cat1VO()));
		
		return "tripinseoul/tripinseoul_main";
	}
	
	@RequestMapping("/tripinseoul/select1")
	public String tripinseoul_select1(Model model,HttpServletRequest req) {
		
		model.addAttribute("cat2List",catService.getCat2List(new Cat2VO()));
		model.addAttribute("c1",req.getParameter("c1"));
		return "tripinseoul/tripinseoul_select1";
	}
	
	@RequestMapping("/tripinseoul/select2")
	public String tripinseoul_select2(Model model,HttpServletRequest req) {
		
		int c1 = Integer.parseInt(req.getParameter("c1"));
		int c2 = Integer.parseInt(req.getParameter("c2"));
		
		LocationVO vo = new LocationVO();
		vo.setC1_id(c1);
		vo.setC2_id(c2);
		
		model.addAttribute("locationList",
				locationService.getLocationList(vo));
		
		return "tripinseoul/tripinseoul_select2";
	}
	@RequestMapping("/tripinseoul/detail")
	public String tripinseoul_detail(Model model,HttpServletRequest req) {
			
		int l_id = Integer.parseInt(req.getParameter("id"));
		LocationVO vo = new LocationVO();
		
		vo.setL_id(l_id);
		model.addAttribute("loc",locationService.getLocation(vo));
		return "tripinseoul/tripinseoul_detail";
	}
}

