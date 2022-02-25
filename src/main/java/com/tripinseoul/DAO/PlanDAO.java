package com.tripinseoul.DAO;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tripinseoul.VO.PlanVO;

@Repository
public class PlanDAO {
	
	@Autowired
	SqlSession session;
	
	public void insert(PlanVO vo) {
		session.insert("Plan.insert",vo);
	}
	public void update(PlanVO vo){
		session.update("Plan.update",vo);
	}
	public void delete(PlanVO vo){
		session.delete("Plan.delete",vo);
	}
	public PlanVO getPlan(PlanVO vo){
		return (PlanVO) session.selectOne("Plan.getPlan",vo);
	}
	public List<PlanVO> getPlanList(PlanVO vo){
		return session.selectList("Plan.getPlanList",vo);
	}
}
