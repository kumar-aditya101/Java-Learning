
public class Variable {

	public static void main(String[] args) {
		
		int help = 10;
		int help_ = 40;
		int _help = 20;
		int $help = 50;
		int help$ = 60;
		int he$1p = 70;
		int h_e$1p = 90;
//		int 2help : Error becoz variable cannot start with number
		
		int temp = 1_0;
		System.out.println(temp);
		
		int $temp = 1___0;
		System.out.println($temp);
		
		int _temp = 1__________________0;
		System.out.println(_temp);
		
		float temp2 = 3.1_47f;
		System.out.println(temp2);
		
	/*	int te_mp = _10;  //Error
		int te_mp = 10_;  //Error
		float temp3 = 33_.147f; //Error
	*/

	}

}
