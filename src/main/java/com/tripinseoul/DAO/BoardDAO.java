package com.tripinseoul.DAO;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tripinseoul.VO.BoardVO;
import com.tripinseoul.VO.MemberVO;

@Repository
public class BoardDAO {
	
	@Autowired
	private SqlSession session;
	
	public void insert(BoardVO vo){
		session.insert("Board.insert",vo);
	}
	public void update(BoardVO vo){
		session.update("Board.update",vo);
	}
	public void delete(BoardVO vo){
		session.delete("Board.delete",vo);
	}
	public BoardVO getBoard(BoardVO vo){
		return (BoardVO) session.selectOne("Board.getBoard",vo);
	}
	
	public List<BoardVO> getBoardList(BoardVO vo){
		return session.selectList("Board.getBoardList",vo);
	}
}
