import java.util.*;

/**
 * 7
 */
class Seven {
    public static void main(String[] args) {
        int num0 = 1;
        int num1 = 1;
        String out = "";
        while (num0 < 10 && num1 < 10) {
            out = "";
            while (num0 < 10) {
                if (num0 * num1 > 9) {
                    out = out + num0 + "x" + num1 + "=" + (num0 * num1) + "    ";
                } else {
                    out = out + num0 + "x" + num1 + "=" + (num0 * num1) + "     ";
                }
                num0 += 1;
            }
            if (num0 == 10 && num1 == 10) {
                ;
            } else {
                num0 = 1;
                num1 += 1;
            }
            System.out.println(out);
        }
    }

}