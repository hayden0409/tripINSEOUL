package com.tripinseoul.VO;

import java.util.Date;

public class BoardVO {
	
	private int b_id;
	private String m_id;
	private String b_title;
	private String b_content;
	private String b_img;
	private Date b_regdate;
	private String b_cat;
	private int b_goodcnt;
	private int b_commentcnt;
	private int b_viewcnt;
	
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
	public String getB_title() {
		return b_title;
	}
	public void setB_title(String b_title) {
		this.b_title = b_title;
	}
	public String getB_content() {
		return b_content;
	}
	public void setB_content(String b_content) {
		this.b_content = b_content;
	}
	public String getB_img() {
		return b_img;
	}
	public void setB_img(String b_img) {
		this.b_img = b_img;
	}
	public Date getB_regdate() {
		return b_regdate;
	}
	public void setB_regdate(Date b_regdate) {
		this.b_regdate = b_regdate;
	}
	public String getB_cat() {
		return b_cat;
	}
	public void setB_cat(String b_cat) {
		this.b_cat = b_cat;
	}
	public int getB_goodcnt() {
		return b_goodcnt;
	}
	public void setB_goodcnt(int b_goodcnt) {
		this.b_goodcnt = b_goodcnt;
	}
	public int getB_commentcnt() {
		return b_commentcnt;
	}
	public void setB_commentcnt(int b_commentcnt) {
		this.b_commentcnt = b_commentcnt;
	}
	public int getB_viewcnt() {
		return b_viewcnt;
	}
	public void setB_viewcnt(int b_viewcnt) {
		this.b_viewcnt = b_viewcnt;
	}
	@Override
	public String toString() {
		return "BoardVO [b_id=" + b_id + ", m_id=" + m_id + ", b_title=" + b_title + ", b_content=" + b_content
				+ ", b_img=" + b_img + ", b_regdate=" + b_regdate + ", b_cat=" + b_cat + ", b_goodcnt=" + b_goodcnt
				+ ", b_commentcnt=" + b_commentcnt + ", b_viewcnt=" + b_viewcnt + "]";
	}
	
	
	
	
}
