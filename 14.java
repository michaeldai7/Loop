import java.util.*;
class Forteen {
public static void main(String[] args) {
Scanner sc =  new Scanner(System.in);
System.out.println ("Enter a number that you'd like to view the prime factors of ");
int n = sc.nextInt ();
System.out.println ("The prime factorization of " + n + " is: ");
for (int i = 2 ; i * i <= n ; i++) {
	while (n % i == 0){
		System.out.print (i + " ");
		n = (n / i);
	  }
	}
	if (n > 1){
	  System.out.println (n);
  }
	else{
	 System.out.println ();
  }
  }
}