package com.tripinseoul.DAO;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tripinseoul.VO.GoodVO;

@Repository
public class GoodDAO {
	@Autowired
	SqlSession session;
	
	public void insert(GoodVO vo){
		session.insert("Good.insert",vo);
	}
	public void update(GoodVO vo){
		session.update("Good.update",vo);
	}
	public void delete(GoodVO vo){
		session.delete("Good.delete",vo);
	}
	public GoodVO getGood(GoodVO vo){
		return (GoodVO) session.selectOne("Good.getGood",vo);
	}
	public List<GoodVO> getGoodList(GoodVO vo){
		return session.selectList("Good.getGoodList",vo);
	}
	//get good count by board id
	public int getCount(GoodVO vo){
		return session.selectOne("Good.getCount",vo);
	}
	
	
}
