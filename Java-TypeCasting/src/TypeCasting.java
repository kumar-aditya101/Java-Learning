
public class TypeCasting {

	public static void main(String[] args) {
//		float a = 3.147;   Error as 3.147 is treated as double.
		float a = (float)3.147; //No Error
//		float a = 3.147f;  No Error
		System.out.println(a);

		System.out.println("-------------------------------------------");
		
		/* below decleration is Error becoz the literal 2147483649 of type int is out of range */
		
//		long d= 2147483649;  Error 
		long d= 2147483649l;  // (l or L)
		System.out.println(d);
		
		long e = 217483647;
		System.out.println(e);
		
		long f = 2211;
		System.out.println(f);
	}

}
