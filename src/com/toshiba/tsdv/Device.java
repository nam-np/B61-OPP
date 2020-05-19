package com.toshiba.tsdv;

public class Device {
	
	int id;
	
	Location location;
	
	public Device (int id, Location location) {
		this.id = id;
		this.location = location;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}
	
	public void showLocationEachHour(Location start, Location end, double time, double speed, double distance) throws InterruptedException {
		
		double x0 = start.getLatitude();
		double y0 = start.getLongtitude();
		double x1 = end.getLatitude();
		double y1 = end.getLongtitude();
		
		printLocation(start);
		
		if (time >=1) {
			for (int i = 1; i <= time; i ++) {
				Thread.sleep(1000);
				printLocation(updateLocation(start, end, i, speed, distance));
			}			
		}
		setLocation(end);
		printLocation(end);
	}
	
	public Location updateLocation(Location start, Location end, double time, double speed, double distance) {
		double x0 = start.getLatitude();
		double y0 = start.getLongtitude();
		double x1 = end.getLatitude();
		double y1 = end.getLongtitude();
         
		Location location_up = new Location();
		location_up.setLatitude((1 - time*speed/distance)*x0 + time*speed/distance*x1);
		location_up.setLongtitude((1 - time*speed/distance)*y0 + time*speed/distance*y1);
		
		setLocation(location_up);
		return location; 
	}
	
	public void printLocation(Location location) {
		
		System.out.println("(" +location.getLatitude() + ", " +location.getLongtitude() + ")");
		
	}

}
