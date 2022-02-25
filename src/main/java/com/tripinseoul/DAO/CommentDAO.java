package com.tripinseoul.DAO;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tripinseoul.VO.CommentVO;

@Repository
public class CommentDAO {
	
	@Autowired
	private SqlSession session;
	
	public void insert(CommentVO vo){
		session.insert("Comment.insert",vo);
	}
	public void update(CommentVO vo){
		session.update("Comment.update",vo);
	}
	public void delete(CommentVO vo){
		session.delete("Comment.delete",vo);
	}
	public CommentVO getComment(CommentVO vo){
		return (CommentVO) session.selectOne("Comment.getComment",vo);
	}
	public List<CommentVO> getCommentList(CommentVO vo){
		return session.selectList("Comment.getCommentList",vo);
	}
}
