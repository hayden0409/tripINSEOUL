package com.tripinseoul.LocationService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tripinseoul.DAO.LocationDAO;
import com.tripinseoul.VO.LocationVO;

@Service
public class LocationService {
	@Autowired
	LocationDAO locationDAO;
	
	public void register(LocationVO vo){
		locationDAO.insert(vo);
	}
	public void edit(LocationVO vo){
		locationDAO.update(vo);
	}
	public void delete(LocationVO vo){
		locationDAO.delete(vo);
	}
	public LocationVO getLocation(LocationVO vo){
		return locationDAO.getLocation(vo);
	}
	public List<LocationVO> getLocationList(LocationVO vo){
		return locationDAO.getLocationList(vo);
	}
	public List<LocationVO> searchLocationByName(LocationVO vo){
		return locationDAO.searchLocationByName(vo);
	}
	
}
