package com.tripinseoul.DAO;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tripinseoul.VO.Cat2VO;

@Repository
public class Cat2DAO {  
	
	@Autowired
	private SqlSession session;
	
	public void insert(Cat2VO vo) {
		
		session.insert("CAT2.insert",vo);
	}
	public void update(Cat2VO vo) {
		
		session.update("CAT2.update", vo);
	}
	public void delete(Cat2VO vo) {
		
		session.delete("CAT2.delete",vo);
	}
	public Cat2VO getCat(Cat2VO vo) {
		
		return (Cat2VO) session.selectOne("CAT2.getC2", vo);
	}
	public List<Cat2VO> getCatList(Cat2VO vo){
		
		return session.selectList("CAT2.getC2List", vo);
	}
}
