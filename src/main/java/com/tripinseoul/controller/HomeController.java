package com.tripinseoul.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.tripinseoul.DAO.TestDAO;
import com.tripinseoul.LocationService.LocationService;
import com.tripinseoul.VO.LocationVO;
import com.tripinseoul.VO.TestVO;

@Controller
public class HomeController {
	
	@Inject
    private TestDAO test;
	
	@Inject
	private ServletContext context;
	@Autowired
	LocationService locationService;
	
	@RequestMapping("/")
	public String home() {
		return "index";
	}

	@RequestMapping(value="/test1",method=RequestMethod.GET)
	public String testPage() {
		return "folder1/test1";
	}
	
	@RequestMapping(value="/test1",method=RequestMethod.POST)
	public String testPage(@RequestParam(value="file") MultipartFile file,HttpServletRequest request,Model model) {
		if(!file.isEmpty()){
			
			String fileName = file.getOriginalFilename();
		
			String imgs = context.getRealPath(File.separator+"resources"+File.separator+"imgs"+File.separator+fileName);
			System.out.println("img path>>> "+imgs);
			model.addAttribute("path",imgs);
			try {
				file.transferTo(new File(imgs));
			} catch (IllegalStateException | IOException e) {
				e.printStackTrace();
			}
		}
		return "folder1/file_uploaded";
	}
	@RequestMapping("/testjson")
	public String test_json() {
		
		return "test_page";
	}
	
	@RequestMapping("/getjson")
	@ResponseBody
	public List<LocationVO> test(@RequestParam("name") String name){
		LocationVO vo = new LocationVO();
		vo.setL_name(name);
		List<LocationVO> locationList = 
				locationService.searchLocationByName(vo);
		System.out.println(locationList);
		return locationList;
	}
	
	
}
