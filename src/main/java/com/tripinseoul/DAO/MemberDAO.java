package com.tripinseoul.DAO;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tripinseoul.VO.MemberVO;

@Repository
public class MemberDAO {
	
	@Autowired
	private SqlSession session;
	
	public void insert(MemberVO vo){
		session.insert("Member.insert",vo);
	}
	public void update(MemberVO vo){
		session.update("Member.update",vo);
	}
	public void delete(MemberVO vo){
		session.delete("Member.delete",vo);
	}
	public MemberVO getMember(MemberVO vo){
		return (MemberVO) session.selectOne("Member.getMember",vo);
	}
	public List<MemberVO> getMemberList(MemberVO vo){
		return session.selectList("Member.getMemberList",vo);
	}
}
