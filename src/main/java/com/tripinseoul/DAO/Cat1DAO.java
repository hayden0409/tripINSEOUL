package com.tripinseoul.DAO;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tripinseoul.VO.Cat1VO;

@Repository
public class Cat1DAO {
	
	@Autowired
	private SqlSession session;
	
	public void insert(Cat1VO vo) {
		
		session.insert("CAT1.insert",vo);
	}
	public void update(Cat1VO vo) {
		
		session.update("CAT1.update",vo);
	}
	public void delete(Cat1VO vo) {
		
		session.delete("CAT1.delete",vo);
	}
	public Cat1VO getCat(Cat1VO vo) {
		
		return (Cat1VO) session.selectOne("CAT1.getC1", vo);
		
	}
	public List<Cat1VO> getCatList(Cat1VO vo){
		
		return session.selectList("CAT1.getC1List", vo);
	}
}
