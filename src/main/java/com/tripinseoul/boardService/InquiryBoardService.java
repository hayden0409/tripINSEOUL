package com.tripinseoul.boardService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tripinseoul.DAO.InquiryBoardDAO;
import com.tripinseoul.VO.InquiryBoardVO;

@Service
public class InquiryBoardService {
	
	@Autowired
	InquiryBoardDAO inquiryBoardDAO;
	
	public void register(InquiryBoardVO vo){
		inquiryBoardDAO.insert(vo);
	}
	public void edit(InquiryBoardVO vo){
		inquiryBoardDAO.update(vo);
	}
	public void delete(InquiryBoardVO vo){
		inquiryBoardDAO.delete(vo);
	}
	public InquiryBoardVO getInquriyBoard(InquiryBoardVO vo){
		return inquiryBoardDAO.getInquiryBoard(vo);
	}
	public int getCount(InquiryBoardVO vo){
		return inquiryBoardDAO.getCount(vo);
	}
	public List<InquiryBoardVO> getInquiryBoardList(InquiryBoardVO vo){
		return inquiryBoardDAO.getInquiryBoardList(vo);
	}
}
