package com.tripinseoul.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tripinseoul.VO.InquiryBoardVO;
import com.tripinseoul.boardService.InquiryBoardService;
import com.tripinseoul.boardService.Pagination;

@Controller
public class FAQController {
	
	@Autowired
	InquiryBoardService inquiryBoardService;
	
	@RequestMapping("/FAQ")
	public String faq(HttpServletRequest req,Model model) {
		System.out.println("faq");
		String search = req.getParameter("search");
		String keyword = req.getParameter("keyword");
		System.out.println(search+" "+keyword);
		
		int page;
		if(req.getParameter("p")==null || req.getParameter("p").equals("")){
			page = 1;
		}else{
			page = Integer.parseInt(req.getParameter("p"));
		}
		
		System.out.println("[p]"+page);
		
		
		InquiryBoardVO vo = new InquiryBoardVO();
		//set keyword
		vo.setKeyword(keyword);
		vo.setSearch(search);
	
		//paging
		Pagination.setTOTALCOUNT(inquiryBoardService.getCount(vo));
		Pagination.setCURPAGE(page);
	
		vo.setFrom(Pagination.calculateFrom());
		vo.setHowMany(Pagination.getCOUNTPERPAGE());
		
		List<InquiryBoardVO> ibList =
				inquiryBoardService.getInquiryBoardList(vo);
		
		model.addAttribute("ibList",ibList);
		model.addAttribute("totalPage",Pagination.calculateTotalPage());
		model.addAttribute("keyword",keyword);
		model.addAttribute("search",search);		
		return "FAQ/faq_main";
	}
}
