package com.tripinseoul.VO;

import java.util.Date;

public class PlanVO {
	private int planID;
	private String writer;
	private Date regDate;
	private String planTitle;
	private Date planStartDate;
	private Date planEndDate;
	
	public int getPlanID() {
		return planID;
	}
	public void setPlanID(int planID) {
		this.planID = planID;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public String getPlanTitle() {
		return planTitle;
	}
	public void setPlanTitle(String planTitle) {
		this.planTitle = planTitle;
	}
	public Date getPlanStartDate() {
		return planStartDate;
	}
	public void setPlanStartDate(Date planStartDate) {
		this.planStartDate = planStartDate;
	}
	public Date getPlanEndDate() {
		return planEndDate;
	}
	public void setPlanEndDate(Date planEndDate) {
		this.planEndDate = planEndDate;
	}
	
	@Override
	public String toString() {
		return "PlanVO [planID=" + planID + ", writer=" + writer + ", regDate=" + regDate + ", planTitle=" + planTitle
				+ ", planStartDate=" + planStartDate + ", planEndDate=" + planEndDate + "]";
	}
	
	
	
}
