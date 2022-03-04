package com.tripinseoul.DAO;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tripinseoul.VO.InquiryBoardVO;

@Repository
public class InquiryBoardDAO {
	
	@Autowired
	SqlSession session;
	
	public void insert(InquiryBoardVO vo){
		session.insert("InquiryBoard.insert",vo);
	}
	public void update(InquiryBoardVO vo){
		session.update("InquiryBoard.update",vo);
	}
	public void delete(InquiryBoardVO vo){
		session.delete("InquiryBoard.delete",vo);
	}
	public int getCount(InquiryBoardVO vo){
		return session.selectOne("InquiryBoard.getCount",vo);
	}
	public InquiryBoardVO getInquiryBoard(InquiryBoardVO vo){
		return (InquiryBoardVO) session.selectOne("InquiryBoard.getInquiryBoard",vo);
	}
	
	public List<InquiryBoardVO> getInquiryBoardList(InquiryBoardVO vo){
		return session.selectList("InquiryBoard.getInquiryBoardList",vo);
	}
	
}
