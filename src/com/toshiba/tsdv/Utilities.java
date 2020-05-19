package com.toshiba.tsdv;

public class Utilities {
	
	Location locaion;

	public Location getLocaion() {
		return locaion;
	}

	public void setLocaion(Location locaion) {
		this.locaion = locaion;
	}
	
	public double getDistance(Location start, Location end) {
		
		return Math.sqrt(Math.pow((start.getLatitude() - end.getLatitude()),2) + Math.pow((start.getLongtitude() - end.getLongtitude()),2));
	}
	
	public double getTimeToMove(Location start, Location end, double speed) {
		
		return getDistance(start, end)/speed;
	}

}
