import java.util.*;
class Nine {
public static void main(String[] args) {
Scanner sc =  new Scanner(System.in);
System.out.print("Enter a base: ");
int base = sc.nextInt();
System.out.print("Enter a exponent: ");
int exponent = sc.nextInt();
int power = 1;
for (int n = 1; n <= exponent; n++){
  power *= base;
}
System.out.println("The result is: "+ base + " power "+ exponent+ " is "+ power +".");
  }
}