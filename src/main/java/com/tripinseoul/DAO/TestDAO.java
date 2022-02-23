package com.tripinseoul.DAO;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tripinseoul.VO.TestVO;

@Repository
public class TestDAO {
	
	@Autowired
	private SqlSession session;
	
	public List<TestVO> getTestList() {
		return session.selectList("test.selectTest");
	}

}
