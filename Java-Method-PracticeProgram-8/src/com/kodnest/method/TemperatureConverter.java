package com.kodnest.method;

import java.util.Scanner;

public class TemperatureConverter {

	public static void main(String[] args) {
		 Scanner scan= new Scanner(System.in);
			System.out.println("Enter the value of fahrenheit: ");
			double fahrenheit= scan.nextDouble();
			scan.close();
			System.out.println(convertFahrenheitToCelsius(fahrenheit));
			

		}
		
		public static double convertFahrenheitToCelsius(double fahrenheit) {
			double C=(fahrenheit-32)*5/9;
			return C ;
		}

}
