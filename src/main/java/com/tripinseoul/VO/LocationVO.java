package com.tripinseoul.VO;

import java.util.Date;

public class LocationVO {
	private int l_id;
	private String c1_id;
	private String c2_id;
	private String l_name;
	private String l_img;
	private String l_lat;
	private String l_lng;
	private String l_zoomlev;
	private String l_tel;
	private String l_address;
	private Date l_lastmodified;
	public int getL_id() {
		return l_id;
	}
	public void setL_id(int l_id) {
		this.l_id = l_id;
	}
	public String getC1_id() {
		return c1_id;
	}
	public void setC1_id(String c1_id) {
		this.c1_id = c1_id;
	}
	public String getC2_id() {
		return c2_id;
	}
	public void setC2_id(String c2_id) {
		this.c2_id = c2_id;
	}
	public String getL_name() {
		return l_name;
	}
	public void setL_name(String l_name) {
		this.l_name = l_name;
	}
	public String getL_img() {
		return l_img;
	}
	public void setL_img(String l_img) {
		this.l_img = l_img;
	}
	public String getL_lat() {
		return l_lat;
	}
	public void setL_lat(String l_lat) {
		this.l_lat = l_lat;
	}
	public String getL_lng() {
		return l_lng;
	}
	public void setL_lng(String l_lng) {
		this.l_lng = l_lng;
	}
	public String getL_zoomlev() {
		return l_zoomlev;
	}
	public void setL_zoomlev(String l_zoomlev) {
		this.l_zoomlev = l_zoomlev;
	}
	public String getL_tel() {
		return l_tel;
	}
	public void setL_tel(String l_tel) {
		this.l_tel = l_tel;
	}
	public String getL_address() {
		return l_address;
	}
	public void setL_address(String l_address) {
		this.l_address = l_address;
	}
	public Date getL_lastmodified() {
		return l_lastmodified;
	}
	public void setL_lastmodified(Date l_lastmodified) {
		this.l_lastmodified = l_lastmodified;
	}
	@Override
	public String toString() {
		return "LocationVO [l_id=" + l_id + ", c1_id=" + c1_id + ", c2_id=" + c2_id + ", l_name=" + l_name + ", l_img="
				+ l_img + ", l_lat=" + l_lat + ", l_lng=" + l_lng + ", l_zoomlev=" + l_zoomlev + ", l_tel=" + l_tel
				+ ", l_address=" + l_address + ", l_lastmodified=" + l_lastmodified + "]";
	}
	
	
	
	
}
