package com.tripinseoul.LocationService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tripinseoul.DAO.Cat1DAO;
import com.tripinseoul.DAO.Cat2DAO;
import com.tripinseoul.VO.Cat1VO;
import com.tripinseoul.VO.Cat2VO;

@Service
public class CatService {
	
	@Autowired
	private Cat1DAO cat1DAO;
	@Autowired
	private Cat2DAO cat2DAO;
	
	public void insertCat1(Cat1VO vo) {
		cat1DAO.insert(vo);
	}
	public void insertCat2(Cat2VO vo) {
		cat2DAO.insert(vo);
	}
	public void updateCat1(Cat1VO vo) {
		cat1DAO.update(vo);
	}
	public void updateCat2(Cat2VO vo) {
		cat2DAO.update(vo);
	}
	public void deleteCat1(Cat1VO vo) {
		cat1DAO.delete(vo);
	}
	public void deleteCat2(Cat2VO vo) {
		cat2DAO.delete(vo);
	}
	public Cat1VO getCat1(Cat1VO vo){
		return cat1DAO.getCat(vo);
	}
	public Cat2VO getCat2(Cat2VO vo){
		return cat2DAO.getCat(vo);
	}
	public List<Cat1VO> getCat1List(Cat1VO vo){
		return cat1DAO.getCatList(vo);
	}
	public List<Cat2VO> getCat2List(Cat2VO vo){
		return cat2DAO.getCatList(vo);
	}
	
	
}
