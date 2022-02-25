package com.tripinseoul.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tripinseoul.DAO.BoardDAO;
import com.tripinseoul.DAO.Cat2DAO;
import com.tripinseoul.DAO.CommentDAO;
import com.tripinseoul.DAO.DetailPlanDAO;
import com.tripinseoul.DAO.GoodDAO;
import com.tripinseoul.DAO.InquiryBoardDAO;
import com.tripinseoul.DAO.LocationDAO;
import com.tripinseoul.DAO.MemberDAO;
import com.tripinseoul.DAO.PlanDAO;
import com.tripinseoul.VO.LocationVO;

@Controller
public class HCTestController {
	@Autowired
	Cat2DAO cdao;
	@Autowired
	MemberDAO md;
	@Autowired
	BoardDAO bd;
	@Autowired
	CommentDAO cd;
	@Autowired
	DetailPlanDAO dpd;
	@Autowired
	PlanDAO pd;
	@Autowired
	GoodDAO gd;
	@Autowired
	InquiryBoardDAO ibd;
	@Autowired
	LocationDAO ld;
	

	
	@RequestMapping("/hc")
	public void hc() {
		System.out.println("--hchc--");
		
		LocationVO l = new LocationVO();
		l.setL_id(1);
		System.out.println(ld.getLocation(l));
		
		
		
		
		

		
		
	}
}
