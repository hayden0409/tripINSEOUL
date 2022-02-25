package com.tripinseoul.DAO;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tripinseoul.VO.DetailPlanVO;

@Repository
public class DetailPlanDAO {
	
	@Autowired
	SqlSession session;
	
	public void insert(DetailPlanVO vo) {
		session.insert("DetailPlan.insert",vo);
	}
	public void update(DetailPlanVO vo){
		session.update("DetailPlan.update",vo);
	}
	public void delete(DetailPlanVO vo){
		session.delete("DetailPlan.delete",vo);
	}
	public DetailPlanVO getDetailPlan(DetailPlanVO vo){
		return (DetailPlanVO) session.selectOne("DetailPlan.getDetailPlan",vo);
	}
	public List<DetailPlanVO> getDetailPlanList(DetailPlanVO vo){
		return session.selectList("DetailPlan.getDetailPlanList",vo);
	}
}
