package com.tripinseoul.tripinseoul;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.tripinseoul.DAO.Cat1DAO;
import com.tripinseoul.VO.Cat1VO;

public class DAOTest {
	private String path;
	public static void main(String[] args) {
		
		ApplicationContext context = 
				new GenericXmlApplicationContext("root-context.xml");

		
		Cat1DAO c1dao =(Cat1DAO) context.getBean("c1dao");
		Cat1VO c = new Cat1VO();
		c.setC1_id("신림");
		c1dao.insert(c);
		
		
		
	}
}	
