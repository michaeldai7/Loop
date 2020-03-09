import java.util.*;
class Fifteen {
public static void main(String[] args) {
Scanner sc =  new Scanner(System.in);
double sum = 0;
for (int n = 1; n <= 20; n++) {
  sum = sum + n * n;
}
System.out.println("The sum is: " + sum);
  } 
}