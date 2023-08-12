import java.util.Scanner;

public class TakingInput {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an Integer:");
		int a = scan.nextInt();
		System.out.println("Value of a is "+a);
		System.out.println("Enter a real number:");
		float b = scan.nextFloat();
		System.out.println("Value of b is "+b);
		System.out.println("Enter a Another real number:");
		double c = scan.nextDouble();
		System.out.println("Value of c is "+c);
		System.out.println("Are you married ? say true or false");
		boolean d = scan.nextBoolean();
		System.out.println("Value in d is:"+d);
		System.out.println("Enter your Insta Id:");
		String e = scan.next();
		System.out.println("Value in e is "+e);
		System.out.println("Enter your full name:");
		scan.nextLine();
		String f = scan.nextLine();
		System.out.println("Value in f is "+f);

	}

}
