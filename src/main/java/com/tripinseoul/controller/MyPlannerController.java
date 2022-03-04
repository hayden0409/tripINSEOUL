package com.tripinseoul.controller;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.tripinseoul.LocationService.LocationService;
import com.tripinseoul.VO.LocationVO;

@SessionAttributes("addedLoc")
@Controller
public class MyPlannerController {
	
	@Autowired
	LocationService locationService;
	
	@RequestMapping("/myplanner")
	public String myplanner_main(Model model) {
		System.out.println("myplanner main");
		
		HashMap<String,List<LocationVO>> addedLoc = new LinkedHashMap<>();
		model.addAttribute("addedLoc",addedLoc);
		return "/myplanner/myplanner_main";
	}
	
	@RequestMapping(value="/myplanner/make",method=RequestMethod.GET)
	public String myplanner_make_GET(HttpServletRequest req,Model model,
			@ModelAttribute("addedLoc") LinkedHashMap<String,List<LocationVO>> addedLoc
			) throws ParseException {
		System.out.println("myplanner make get");
		String stdate = req.getParameter("stdate");
		String eddate = req.getParameter("eddate");
		String searchKeyword = req.getParameter("searchKeyword");
		String index = req.getParameter("index");
		
		//initiate only for the first time
		if(addedLoc.isEmpty()){
			String[] ps = req.getParameterValues("date");
			if(ps!=null){
				for(String s : ps){
					addedLoc.put(s, new ArrayList<LocationVO>());
				}
			}
		}
		
		//when search button pushed
		if(req.getParameter("searchBtn")!=null){
			System.out.println(req.getParameter("searchBtn"));
			
			LocationVO vo = new LocationVO();
			vo.setL_name(searchKeyword);
			List<LocationVO> foundLoc=
			locationService.searchLocationByName(vo);
			
			model.addAttribute("foundLoc",foundLoc);
			
		}
		//when location button pushed
		if(req.getParameter("choice")!=null){
			String choice = req.getParameter("choice");
			System.out.println(choice);
			
			LocationVO vo = new LocationVO();
			vo.setL_id(Integer.parseInt(choice));
			LocationVO selectedLoc = locationService.getLocation(vo);
			
			addedLoc.get(index).add(selectedLoc);	
		}
		
		model.addAttribute("stdate",stdate);
		model.addAttribute("eddate",eddate);
		model.addAttribute("addedLoc",addedLoc);
		return "/myplanner/myplanner_make";
	}
	@RequestMapping(value="/myplanner/make",method=RequestMethod.POST)
	public String myplanner_make_POST(
			@ModelAttribute("addedLoc") LinkedHashMap<String,List<LocationVO>> addedLoc) {
		System.out.println("myplanner make post");
		
		Set<String> ks = addedLoc.keySet();
		
		
		System.out.println(ks);
		for(String k:ks){
			List<LocationVO> l1 = addedLoc.get(k);
			for(LocationVO l:l1){
				System.out.println(l.getL_name());
			}
			System.out.println("----------");
		}
		
		
		return "/myplanner/myplanner_complete";
	}
	
}
