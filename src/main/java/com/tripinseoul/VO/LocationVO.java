package com.tripinseoul.VO;

import java.util.Date;

public class LocationVO {
	private int locationID;
	private String C1ID;
	private String C2ID;
	private String locationName;
	private String locationImg;
	private String locationLatitude;
	private String locationLongitude;
	private String locationZoomLevel;
	private String locationTel;
	private String locationAddress;
	private Date locationLastModified;
	
	public int getLocationID() {
		return locationID;
	}
	public void setLocationID(int locationID) {
		this.locationID = locationID;
	}
	public String getC1ID() {
		return C1ID;
	}
	public void setC1ID(String c1id) {
		C1ID = c1id;
	}
	public String getC2ID() {
		return C2ID;
	}
	public void setC2ID(String c2id) {
		C2ID = c2id;
	}
	public String getLocationName() {
		return locationName;
	}
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
	public String getLocationImg() {
		return locationImg;
	}
	public void setLocationImg(String locationImg) {
		this.locationImg = locationImg;
	}
	public String getLocationLatitude() {
		return locationLatitude;
	}
	public void setLocationLatitude(String locationLatitude) {
		this.locationLatitude = locationLatitude;
	}
	public String getLocationLongitude() {
		return locationLongitude;
	}
	public void setLocationLongitude(String locationLongitude) {
		this.locationLongitude = locationLongitude;
	}
	public String getLocationZoomLevel() {
		return locationZoomLevel;
	}
	public void setLocationZoomLevel(String locationZoomLevel) {
		this.locationZoomLevel = locationZoomLevel;
	}
	public String getLocationTel() {
		return locationTel;
	}
	public void setLocationTel(String locationTel) {
		this.locationTel = locationTel;
	}
	public String getLocationAddress() {
		return locationAddress;
	}
	public void setLocationAddress(String locationAddress) {
		this.locationAddress = locationAddress;
	}
	public Date getLocationLastModified() {
		return locationLastModified;
	}
	public void setLocationLastModified(Date locationLastModified) {
		this.locationLastModified = locationLastModified;
	}
	@Override
	public String toString() {
		return "LocationVO [locationID=" + locationID + ", C1ID=" + C1ID + ", C2ID=" + C2ID + ", locationName="
				+ locationName + ", locationImg=" + locationImg + ", locationLatitude=" + locationLatitude
				+ ", locationLongitude=" + locationLongitude + ", locationZoomLevel=" + locationZoomLevel
				+ ", locationTel=" + locationTel + ", locationAddress=" + locationAddress + ", locationLastModified="
				+ locationLastModified + "]";
	}
	
	
	
	
	
	
	
}
