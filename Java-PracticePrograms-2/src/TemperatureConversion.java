import java.util.Scanner;

public class TemperatureConversion {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Welcome to the Temperature Conversion Tool!");
		System.out.println("Select an option:");
		System.out.println("1. Convert Celsius to Fahrenheit");
		System.out.println("2. Convert Fahrenheit to Celsius\n");
		System.out.println("Enter your choice: ");
		int choice= scan.nextInt();
		
		if (choice == 1) {
            System.out.print("Enter the temperature in Celsius: ");
            double celsius = scan.nextDouble();
            double fahrenheit = celsiusToFahrenheit(celsius);
            System.out.printf("%.1f°C is equivalent to %.1f°F%n", celsius, fahrenheit);
//            System.out.println(celsius+""+"°C is equivalent to "+fahrenheit+"°F");
        } else if (choice == 2) {
            System.out.print("Enter the temperature in Fahrenheit: ");
            double fahrenheit = scan.nextDouble();
            double celsius = fahrenheitToCelsius(fahrenheit);
            System.out.printf("%.1f°F is equivalent to %.1f°C%n", fahrenheit, celsius);
        }
	
          scan.close();
}
	
	
	
	
	public static double celsiusToFahrenheit(double celsius) {
				return (celsius * 9 / 5) + 32;
	}
	
	
	public static double fahrenheitToCelsius(double fahrenheit) {
		
		return (fahrenheit - 32) * 5 / 9;
	}
	
}
