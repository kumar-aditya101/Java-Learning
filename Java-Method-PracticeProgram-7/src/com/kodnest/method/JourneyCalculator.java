package com.kodnest.method;

import java.util.Scanner;

public class JourneyCalculator {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		 System.out.println("Enter the value of speed and time : ");
		 double speed= scan.nextDouble();
		 double time= scan.nextDouble();
		double res= calculateDistance(speed,time);
		 System.out.println(res);
		 
			
		}
		
		public static double calculateDistance(double speed, double time) {
			double distance = speed * time;
			return distance;
		}

}
