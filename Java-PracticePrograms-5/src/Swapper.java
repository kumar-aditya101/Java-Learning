import java.util.Scanner;

public class Swapper {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first integer:");
		int first= scan.nextInt();
		System.out.println("Enetr the second integer:");
		int second = scan.nextInt();
		swapUsingBitwise(first,second);
		

	}
	
	public static void swapUsingBitwise(int first, int second) {
		int temp= first;
		first = second;
		second = temp;
		System.out.print("After swapping:");
		System.out.println("First= "+first+","+"Second= "+second);
		
	}

}
