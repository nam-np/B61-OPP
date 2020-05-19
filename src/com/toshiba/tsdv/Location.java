package com.toshiba.tsdv;

public class Location {
	
	double latitude;
	double longtitude;
	
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongtitude() {
		return longtitude;
	}
	public void setLongtitude(double longtitude) {
		this.longtitude = longtitude;
	}
	
	public Location(double x, double y) {
		this.latitude = x;
		this.longtitude = y;
	}
	public Location() {
		// TODO Auto-generated constructor stub
	}

}
