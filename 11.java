import java.util.*;
class Eleven {
public static void main(String[] args) {
Scanner sc =  new Scanner(System.in);
int y,z,x;
System.out.print("Enter a natural number: ");
int n = sc.nextInt();
z = 1;
x = 1;
y = 1;
for(int i = 1; i <= n; i++){
  z = x;
  x = y;
  y = z+x;
  System.out.print(z+ " ");
    }
  }
}