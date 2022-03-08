package com.tripinseoul.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tripinseoul.VO.BoardVO;
import com.tripinseoul.VO.CommentVO;
import com.tripinseoul.VO.GoodVO;
import com.tripinseoul.boardService.BoardService;

@Controller
public class CommunityController {
	
	@Autowired
	BoardService boardService;
	
	@RequestMapping("/community")
	public String community(HttpServletRequest req,Model model) {
		System.out.println("community");
		String cat = req.getParameter("cat");
		String searchType = req.getParameter("searchType");
		String keyword = req.getParameter("keyword");
		System.out.println(cat);
		System.out.println(searchType);
		System.out.println(keyword);
		
		BoardVO vo = new BoardVO();
		vo.setB_cat(cat);
		vo.setSearchType(searchType);
		vo.setKeyword(keyword);
		
		List<BoardVO> boardList =
				boardService.getBoardList(vo);
		
		model.addAttribute("boardList",boardList);
		return "community/community_main";
	}
	@RequestMapping("/community/detail")
	public String community_detail(Model model,HttpServletRequest req) {
		System.out.println("comm detail");
		String b_id = req.getParameter("id");
		int b_id_int = Integer.parseInt(b_id);
		//b_id == null -> 500 page
	
		//get board
		BoardVO b_vo = new BoardVO();
		b_vo.setB_id(b_id_int);
		BoardVO	board = boardService.getBoard(b_vo);
		
		//get comment
		CommentVO c_vo = new CommentVO();
		c_vo.setB_id(b_id_int);
		List<CommentVO> commentList = 
				boardService.getCommentListByB_id(c_vo);
		
		//get good count
		GoodVO g_vo = new GoodVO();
		g_vo.setB_id(b_id_int);
		int goodCnt = boardService.getGoodCntByB_id(g_vo);
 		
		model.addAttribute("goodCnt",goodCnt);
		
		model.addAttribute("board",board);
		model.addAttribute("commentList",commentList);
		
		return "community/community_detail";
	}
}
