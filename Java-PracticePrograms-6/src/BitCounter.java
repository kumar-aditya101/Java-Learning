import java.util.Scanner;

public class BitCounter {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter an integer: ");
        int num = scan.nextInt();
        
        
        int count = countSetBits(num);
        System.out.println("Number of set bits: " + count);
    }
    
    public static int countSetBits(int num) {
        int count = 0;
        while (num > 0) {
            // Check the least significant bit using bitwise AND with 1
            if ((num & 1) == 1) {
                count++;
            }
            // Right shift the number to check the next bit
            num >>= 1;
        }
        return count;
	}

}
