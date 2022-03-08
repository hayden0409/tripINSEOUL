package com.tripinseoul.boardService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tripinseoul.DAO.BoardDAO;
import com.tripinseoul.DAO.CommentDAO;
import com.tripinseoul.DAO.GoodDAO;
import com.tripinseoul.VO.BoardVO;
import com.tripinseoul.VO.CommentVO;
import com.tripinseoul.VO.GoodVO;

@Service
public class BoardService {
	
	@Autowired
	private BoardDAO boardDAO;
	@Autowired
	private CommentDAO commentDAO;
	@Autowired
	private GoodDAO goodDAO;
	
	public void write(BoardVO vo){
		boardDAO.insert(vo);
	}
	public void update(BoardVO vo){
		boardDAO.update(vo);
	}
	public void delete(BoardVO vo){
		boardDAO.delete(vo);
	}
	public BoardVO getBoard(BoardVO vo){
		return boardDAO.getBoard(vo);
	}
	public List<BoardVO> getBoardList(BoardVO vo){
		return boardDAO.getBoardList(vo);
	}
	public List<CommentVO> getCommentListByB_id(CommentVO vo){
		return commentDAO.getCommentList(vo);
	}
	public int getGoodCntByB_id(GoodVO vo){
		return goodDAO.getCount(vo);
	}
}
