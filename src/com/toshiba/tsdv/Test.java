package com.toshiba.tsdv;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		
		double x1, x2, y1, y2, speed;

		Scanner input = new Scanner(System.in);

		System.out.println("====================================");
		
		System.out.println("Input start locaion: ");
		x1 = input.nextDouble();
		y1 = input.nextDouble();
		Location start = new Location (x1, y1);
		
		System.out.println("Input end locaion: ");
		x2 = input.nextDouble();
		y2 = input.nextDouble();
		Location end = new Location (x2, y2);
		
		System.out.println("====================================");
		
		Utilities utilities = new Utilities();
		
		double distance = utilities.getDistance(start, end);
		
		System.out.println("Distance from Start to End location: " + distance + "km");
		
		System.out.println("Input speed (km/h): ");
		speed = input.nextDouble();
		
		double time = utilities.getTimeToMove(start, end, speed);
		System.out.println("Time Start to End location: " + time + " h");
		
		System.out.println("Input Device ID: ");
		int id = input.nextInt();
		
		Device device = new Device(id,start);
		
		device.setLocation(start);
		
		System.out.println("ID device: " + device.getId() +"\nLocation Device: ");
		device.printLocation(device.getLocation());
		
		System.out.println("Input time want to find Location device (h): ");
		double time_to = input.nextInt();
		
		System.out.println("====================================");
		System.out.println("Location Device after " +time_to+ "h");
        device.printLocation(device.updateLocation(start, end, time_to, speed, distance));
        
        System.out.println("List location updated after 1h: ");
		device.showLocationEachHour(start, end, time, speed, distance);
		
		System.out.println("====================================");
		System.out.println("Current Location Device: ");
		device.printLocation(device.getLocation());
	}

}
