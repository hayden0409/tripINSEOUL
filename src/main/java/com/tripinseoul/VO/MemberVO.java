package com.tripinseoul.VO;

import java.util.Date;

public class MemberVO {
	
	private String m_id;
	private String m_password;
	private String m_email;
	private String m_name;
	private String m_gender;
	private Date m_regdate;
	private String m_ismanager;
	private String m_nickname;
	
	public String getM_id() {
		return m_id;
	}
	public void setM_id(String m_id) {
		this.m_id = m_id;
	}
	public String getM_password() {
		return m_password;
	}
	public void setM_password(String m_password) {
		this.m_password = m_password;
	}
	public String getM_email() {
		return m_email;
	}
	public void setM_email(String m_email) {
		this.m_email = m_email;
	}
	public String getM_name() {
		return m_name;
	}
	public void setM_name(String m_name) {
		this.m_name = m_name;
	}
	public String getM_gender() {
		return m_gender;
	}
	public void setM_gender(String m_gender) {
		this.m_gender = m_gender;
	}
	public Date getM_regdate() {
		return m_regdate;
	}
	public void setM_regdate(Date m_regdate) {
		this.m_regdate = m_regdate;
	}
	public String getM_ismanager() {
		return m_ismanager;
	}
	public void setM_ismanager(String m_ismanager) {
		this.m_ismanager = m_ismanager;
	}
	public String getM_nickname() {
		return m_nickname;
	}
	public void setM_nickname(String m_nickname) {
		this.m_nickname = m_nickname;
	}
	@Override
	public String toString() {
		return "MemberVO [m_id=" + m_id + ", m_password=" + m_password + ", m_email=" + m_email + ", m_name=" + m_name
				+ ", m_gender=" + m_gender + ", m_regdate=" + m_regdate + ", m_ismanager=" + m_ismanager
				+ ", m_nickname=" + m_nickname + "]";
	}
	
	
	
	
	
	
}
