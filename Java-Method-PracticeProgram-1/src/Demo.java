import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Your name: ");
		String name = scan.nextLine();
		greet(name);
		
	}
	
	public static void greet(String name) {
		System.out.println("Hello "+name+" How Are You...?");
	}

}
