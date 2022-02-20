package com.tripinseoul.tripinseoul;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.example.dto.MemberVO;
import com.example.service.MemberService;

@Controller
public class Controller1 {
	
	@Inject
    private MemberService service;
	
	@Inject
	private ServletContext context;
	
	
	
	@RequestMapping("/test2")
	public String indexPage(Model model) throws Exception{
		List<MemberVO> ml = service.selectMember();
		System.out.println(ml);
		model.addAttribute("ml",ml);
		return "test2";
	}
	@RequestMapping(value="/test1",method=RequestMethod.GET)
	public String testPage() {
		
		return "folder1/test1";
	}
	
	@RequestMapping(value="/test1",method=RequestMethod.POST)
	public String testPage(@RequestParam(value="file") MultipartFile file,HttpServletRequest request,Model model) {
		if(!file.isEmpty()){
			String fileName = file.getOriginalFilename();
			//file separator를 쓸것
			String imgs = context.getRealPath("\\resources\\imgs\\"+fileName);
			System.out.println(imgs);
			model.addAttribute("path",imgs);
			try {
				file.transferTo(new File(imgs));
			} catch (IllegalStateException | IOException e) {
				e.printStackTrace();
			}
		}
		return "folder1/file_uploaded";
	}
}
