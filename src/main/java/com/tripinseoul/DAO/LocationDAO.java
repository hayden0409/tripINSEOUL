package com.tripinseoul.DAO;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tripinseoul.VO.LocationVO;

@Repository
public class LocationDAO {

	@Autowired
	SqlSession session;
	
	public void insert(LocationVO vo){
		session.insert("Location.insert",vo);
	}
	public void update(LocationVO vo){
		session.update("Location.update",vo);
	}
	public void delete(LocationVO vo){
		session.delete("Location.delete",vo);
	}
	public LocationVO getLocation(LocationVO vo){
		return (LocationVO) session.selectOne("Location.getLocation",vo);
	}
	public List<LocationVO> getLocationList(LocationVO vo){
		return session.selectList("Location.getLocationList",vo);
	}
}
