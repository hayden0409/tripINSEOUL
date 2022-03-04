package com.tripinseoul.memberService;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

import com.tripinseoul.VO.MemberVO;


public class LoginHelper {
	
	
	MemberService memberService;
	
	private HashMap<String,String> errorMap;
	
	public boolean login(MemberVO vo,HttpServletRequest request,Model model) {
		HttpSession session = request.getSession();
		MemberVO login = memberService.login(vo);
		
		if(login==null){
			System.out.println("id not exist");
			
			model.addAttribute("error","id not exist");
			return false;
		}else if(!login.getM_password().equals(vo.getM_password())){
			System.out.println("password not correct");
			
			model.addAttribute("error","password not correct");
			return false;
		}
		
//		session.setAttribute("auth",login);
		return true;
		
		
	
	}
}
