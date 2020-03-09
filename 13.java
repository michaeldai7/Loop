import java.util.*;
class Thirdteen {
public static void main(String[] args) {
Scanner sc =  new Scanner(System.in);
Random rand = new Random();
int randInt = rand.nextInt(50);
int num;
int time = 0;
boolean a = true;
for(int n = 1; n<=3; n++) {
  System.out.println("Enter a number between 1 and 50 to guess.");
  num = sc.nextInt();
  time++;
  if (num > randInt) {
    a = false;
    System.out.println("Your guess is too high. Try again.");
    }
  else if (num < randInt) {
    a = false;
    System.out.println("Your guess is too low. Try again.");
    }
  else if (num == randInt) {
    a = true;
   if (time == 1) {
    System.out.println("You've got it at the first attempt!");
        }
   else if (time == 2) {
    System.out.println("You've got it at the scecond attempt!");
        }
   else if (time == 3) {
    System.out.println("You've got it at the third attempt!");
        }
  break;
  }
  }
  if (a == false) {
    System.out.println("You didn't get the right number.");
    }
  }
}