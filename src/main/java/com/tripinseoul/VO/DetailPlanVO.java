package com.tripinseoul.VO;

import java.util.Date;

public class DetailPlanVO {
	private int detailPlanID;
	private int planID;
	private int locationID;
	private Date day;
	
	public int getDetailPlanID() {
		return detailPlanID;
	}
	public void setDetailPlanID(int detailPlanID) {
		this.detailPlanID = detailPlanID;
	}
	public int getPlanID() {
		return planID;
	}
	public void setPlanID(int planID) {
		this.planID = planID;
	}
	public int getLocationID() {
		return locationID;
	}
	public void setLocationID(int locationID) {
		this.locationID = locationID;
	}
	public Date getDay() {
		return day;
	}
	public void setDay(Date day) {
		this.day = day;
	}
	
	@Override
	public String toString() {
		return "DetailPlanVO [detailPlanID=" + detailPlanID + ", planID=" + planID + ", locationID=" + locationID
				+ ", day=" + day + "]";
	}
	
	
}
