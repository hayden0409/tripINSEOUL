package com.tripinseoul.VO;

import java.util.Date;

public class PlanVO {
	
	private int p_id;
	private String m_id;
	private Date p_regdate;
	private String p_title;
	private Date p_stdate;
	private Date p_eddate;
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public String getM_id() {
		return m_id;
	}
	public void setM_id(String m_id) {
		this.m_id = m_id;
	}
	public Date getP_regdate() {
		return p_regdate;
	}
	public void setP_regdate(Date p_regdate) {
		this.p_regdate = p_regdate;
	}
	public String getP_title() {
		return p_title;
	}
	public void setP_title(String p_title) {
		this.p_title = p_title;
	}
	public Date getP_stdate() {
		return p_stdate;
	}
	public void setP_stdate(Date p_stdate) {
		this.p_stdate = p_stdate;
	}
	public Date getP_eddate() {
		return p_eddate;
	}
	public void setP_eddate(Date p_eddate) {
		this.p_eddate = p_eddate;
	}
	@Override
	public String toString() {
		return "PlanVO [p_id=" + p_id + ", m_id=" + m_id + ", p_regdate=" + p_regdate + ", p_title=" + p_title
				+ ", p_stdate=" + p_stdate + ", p_eddate=" + p_eddate + "]";
	}
	
	
	
	
	
}
