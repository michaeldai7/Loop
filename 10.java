import java.util.*;
class Ten {
public static void main(String[] args) {
Scanner sc =  new Scanner(System.in);
System.out.print("Enter a number:");
int num = sc.nextInt();
int fac = 1;
System.out.print(num + " factorial (" + num + "!) means ");
for (int i = num; i >1; i--){
  fac = fac*i;
  System.out.print(i +" x ");
}
if (num == 1)
 System.out.print(1 + ".");
else
  System.out.print(1+" or "+ fac+".");
  }
}