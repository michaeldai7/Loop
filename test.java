
import java.util.*;

class Test {
	public static void main(String[] args) {
		int check =0;
		int a = 1;
		int b = 4; 
		for (int i = 0; i < 90; i++) {
			check = (int) (Math.pow(a,2) * Math.pow(b,2));
			a = (int) Math.pow(a, 2);
			b = (int) Math.pow(b, 2);
			System.out.println(a);
			System.out.println(b);
            while (check > 9 && check < 100) {
                a = check / 10;
				b = check - a;
				System.out.println(10 * a + b);
				check = (int)(Math.pow(a, 2) * Math.pow(b, 2));
				//System.out.println(check);
            }
            if (check < 10 ) {
                ;
            }else{
                ;
            }
        }
	}
}