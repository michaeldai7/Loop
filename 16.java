import java.util.*;
class Sixteen {
public static void main(String[] args) {
Scanner sc =  new Scanner(System.in);
double sum = 2;
for (int i = 2 ; i <= 10 ; i++){
	sum = sum + Math.pow (factorial (i), -1);
}
	System.out.println ("The sum of 2+(2!)^-1+(3!)^-1..10 terms is " + sum);
}
public static int factorial (int n){
int product = 1;
for (int i = 1 ; i <= n ; i++)
	product = product * i;
	return product;
  }
}