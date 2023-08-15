import java.util.Scanner;

public class TemperatureConverterApp {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the value of fahrenheit: ");
		double fahrenheit= scan.nextDouble();
		scan.close();
		TemperatureConverter temperatureConverter = new TemperatureConverter();
		double celsius = temperatureConverter.convertFahrenheitToCelsius(fahrenheit);
		System.out.println(celsius);
	}

}
