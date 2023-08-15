import java.util.Scanner;

public class MethodOverloadingCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        
        System.out.print("Enter the operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        scanner.close();
        
        double result = calculate(num1, num2, operator);
        System.out.println("Result: " + result);
    }
    
    public static double calculate(double num1, double num2, char operator) {
        double result = 0.0;
        
        switch (operator) {
            case '+':
                result = add(num1, num2);
                break;
            case '-':
                result = subtract(num1, num2);
                break;
            case '*':
                result = multiply(num1, num2);
                break;
            case '/':
                result = divide(num1, num2);
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }
        
        return result;
    }
    
    public static double add(double a, double b) {
        return a + b;
    }
    
    public static double subtract(double a, double b) {
        return a - b;
    }
    
    public static double multiply(double a, double b) {
        return a * b;
    }
    
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero");
            return 0.0;
        }
        return a / b;

	}

}
