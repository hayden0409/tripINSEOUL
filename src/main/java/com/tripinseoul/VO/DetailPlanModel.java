package com.tripinseoul.VO;

public class DetailPlanModel {
	String date;
	String location;
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "DetailPlanModel [date=" + date + ", location=" + location + "]";
	}
	
	
}
