package com.tripinseoul.VO;

import java.util.Date;

public class CommentVO {
	
	private int c_id;
	private int b_id;
	private String m_id;
	private String c_content;
	private Date c_regdate;
	
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public int getB_id() {
		return b_id;
	}
	public void setB_id(int b_id) {
		this.b_id = b_id;
	}
	public String getM_id() {
		return m_id;
	}
	public void setM_id(String m_id) {
		this.m_id = m_id;
	}
	public String getC_content() {
		return c_content;
	}
	public void setC_content(String c_content) {
		this.c_content = c_content;
	}
	public Date getC_regdate() {
		return c_regdate;
	}
	public void setC_regdate(Date c_regdate) {
		this.c_regdate = c_regdate;
	}
	@Override
	public String toString() {
		return "CommentVO [c_id=" + c_id + ", b_id=" + b_id + ", m_id=" + m_id + ", c_content=" + c_content
				+ ", c_regdate=" + c_regdate + "]";
	}
	
	
	
	
	
	
	
}
