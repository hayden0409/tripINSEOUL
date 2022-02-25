package com.tripinseoul.VO;

import java.util.Date;

public class InquiryBoardVO {
	private int ib_id;
	private String m_id;
	private String ib_title;
	private String ib_content;
	private Date ib_regdate;
	
	public int getIb_id() {
		return ib_id;
	}
	public void setIb_id(int ib_id) {
		this.ib_id = ib_id;
	}
	public String getM_id() {
		return m_id;
	}
	public void setM_id(String m_id) {
		this.m_id = m_id;
	}
	public String getIb_title() {
		return ib_title;
	}
	public void setIb_title(String ib_title) {
		this.ib_title = ib_title;
	}
	public String getIb_content() {
		return ib_content;
	}
	public void setIb_content(String ib_content) {
		this.ib_content = ib_content;
	}
	public Date getIb_regdate() {
		return ib_regdate;
	}
	public void setIb_regdate(Date ib_regdate) {
		this.ib_regdate = ib_regdate;
	}
	@Override
	public String toString() {
		return "InquiryBoardVO [ib_id=" + ib_id + ", m_id=" + m_id + ", ib_title=" + ib_title + ", ib_content="
				+ ib_content + ", ib_regdate=" + ib_regdate + "]";
	}
	
	
	
	
}
