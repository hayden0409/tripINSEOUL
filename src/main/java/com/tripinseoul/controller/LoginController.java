package com.tripinseoul.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tripinseoul.VO.MemberVO;
import com.tripinseoul.memberService.MemberService;

@Controller
public class LoginController {
	@Autowired
	MemberService memberService;
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String login_get() {
		System.out.println("login get");
		
		return "login/login";
	}
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login_post(MemberVO vo,HttpServletRequest request,Model model) {
		System.out.println("login post");
		HttpSession session = request.getSession();
		MemberVO login = memberService.login(vo);
		
		if(login==null){
			System.out.println("id not exist");
			
			model.addAttribute("id_error","id not exist");
			return "login/login";
		}else if(!login.getM_password().equals(vo.getM_password())){
			System.out.println("password not correct");
			
			model.addAttribute("pw_error","password not correct");
			return "login/login";
		}
		
		session.setAttribute("auth",login);
		return "index";
		
	}
	
	@RequestMapping(value="/join",method=RequestMethod.GET)
	public String join() {
		
		return "login/join";
	}
	@RequestMapping(value="/join",method=RequestMethod.POST)
	public String join_complete(MemberVO vo) {
//		if(problem){
//			return "login/join";
//		}
		memberService.join(vo);
		return "login/join_complete";
	}
}
