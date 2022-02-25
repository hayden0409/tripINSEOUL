package com.tripinseoul.VO;

import java.util.Date;

public class DetailPlanVO {
	
	private int dp_id;
	private int p_id;
	private int l_id;
	private Date dp_day;
	
	public int getDp_id() {
		return dp_id;
	}
	public void setDp_id(int dp_id) {
		this.dp_id = dp_id;
	}
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public int getL_id() {
		return l_id;
	}
	public void setL_id(int l_id) {
		this.l_id = l_id;
	}
	public Date getDp_day() {
		return dp_day;
	}
	public void setDp_day(Date dp_day) {
		this.dp_day = dp_day;
	}
	@Override
	public String toString() {
		return "DetailPlanVO [dp_id=" + dp_id + ", p_id=" + p_id + ", l_id=" + l_id + ", dp_day=" + dp_day + "]";
	}
	
	
	
}
