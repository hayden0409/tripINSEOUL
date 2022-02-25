package com.tripinseoul.VO;

public class GoodVO {
	
	private int g_id;
	private int b_id;
	private String m_id;
	
	public int getG_id() {
		return g_id;
	}
	public void setG_id(int g_id) {
		this.g_id = g_id;
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
	@Override
	public String toString() {
		return "GoodVO [g_id=" + g_id + ", b_id=" + b_id + ", m_id=" + m_id + "]";
	}
	
	
}
