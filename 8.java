import java.util.*;
class Eight {
public static void main(String[] args) {
Scanner sc =  new Scanner(System.in);
int num;
String ans;
for(;;){
  System.out.println("Enter a number");
  num = sc.nextInt();
  System.out.println("square = " + (int)Math.pow(num, 2));
  System.out.println("cube = " + (int)Math.pow(num, 3));
  System.out.println("Continue?");
  ans = sc.next();
  if (ans.equals("no")||ans.equals("No")){
    System.out.println("Program Finished.");
    break;
    }
  }
  }
}