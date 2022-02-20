//package com.tripinseoul.tripinseoul;
//
//import java.util.List;
//import java.util.Locale;
//
//import javax.inject.Inject;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import com.example.dto.MemberVO;
//import com.example.service.MemberService;
//
//
//@Controller
//public class HomeController {
//	
//	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
//	
//	@Inject
//    private MemberService service;
//
//	
//	@RequestMapping(value = "/", method = RequestMethod.GET)
//	public String home(Locale locale, Model model) throws Exception{
//		
//		logger.info("home");
//		
//		List<MemberVO> ml = service.selectMember();
//		for(MemberVO m:ml){
//			System.out.println(m);
//		}
//		
//		
//		model.addAttribute("ml", ml );
//		
//		return "home";
//	}
//	
//	@RequestMapping("/test")
//	public String testPage() {
//		return "folder1/test";
//	}
//	
//}
