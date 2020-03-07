/**
 * 17
 */
import java.util.*;
class Seventeen {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number:");
        String inp = sc.next();
        int out = 0;
       
      
        for (int i = 0;i < inp.length(); i++){
            Character check = inp.charAt(i);
            int number = check;
            number = number - 48;
            //System.out.println(inp.charAt(i));
            //System.out.println(number);
            if (number == 0){
                out++;
                //System.out.println(out);
            }else{
                ;
            }
        }
        System.out.println(inp +" has "+ out + " zero.");
    }
}