package com.tripinseoul.VO;

import java.util.Date;


public class InquiryBoardVO {
	private int ib_id;
	private String m_id;
	private String ib_title;
	private String ib_content;
	private Date ib_regdate;
	private String ib_reply;
	private int from;
	private int howMany;
	private String search;
	private String keyword;
	
	public int getFrom() {
		return from;
	}
	public void setFrom(int from) {
		this.from = from;
	}
	public int getHowMany() {
		return howMany;
	}
	public void setHowMany(int howMany) {
		this.howMany = howMany;
	}
	public String getIb_reply() {
		return ib_reply;
	}
	public void setIb_reply(String ib_reply) {
		this.ib_reply = ib_reply;
	}
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
	
	public String getSearch() {
		return search;
	}
	public void setSearch(String search) {
		this.search = search;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	@Override
	public String toString() {
		return "InquiryBoardVO [ib_id=" + ib_id + ", m_id=" + m_id + ", ib_title=" + ib_title + ", ib_content="
				+ ib_content + ", ib_regdate=" + ib_regdate + ", ib_reply=" + ib_reply +  "]";
	}
	
	

	
	
	
	
}
