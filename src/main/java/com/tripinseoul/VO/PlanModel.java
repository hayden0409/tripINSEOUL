package com.tripinseoul.VO;

import java.util.List;

public class PlanModel {
	private String st_date;
	private String ed_date;
	List<DetailPlanModel> detailPlan;
	
	public String getSt_date() {
		return st_date;
	}
	public void setSt_date(String st_date) {
		this.st_date = st_date;
	}
	public String getEd_date() {
		return ed_date;
	}
	public void setEd_date(String ed_date) {
		this.ed_date = ed_date;
	}
	public List<DetailPlanModel> getDetailPlan() {
		return detailPlan;
	}
	public void setDetailPlan(List<DetailPlanModel> detailPlan) {
		this.detailPlan = detailPlan;
	}
	@Override
	public String toString() {
		return "PlanModel [st_date=" + st_date + ", ed_date=" + ed_date + ", detailPlan=" + detailPlan + "]";
	}
	
	
	
}
