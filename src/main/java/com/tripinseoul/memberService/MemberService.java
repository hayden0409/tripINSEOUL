package com.tripinseoul.memberService;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tripinseoul.DAO.MemberDAO;
import com.tripinseoul.VO.MemberVO;

@Service
public class MemberService {
	
	@Autowired
	MemberDAO memberDAO;
	
	public void join(MemberVO vo){
		vo.setM_regdate(new Date());
		vo.setM_ismanager("N");
		memberDAO.insert(vo);
	}
	public void edit(MemberVO vo){
		memberDAO.update(vo);
	}
	public void delete(MemberVO vo){
		memberDAO.delete(vo);
	}
	public MemberVO login(MemberVO vo){
		return memberDAO.getMember(vo);
	}
	
	
	
}
