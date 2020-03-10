/**
 * 20
 */
class Twenty {
    public static void main(String[] args) {
        int num = 10;
        int a = 0, b = 0;
        int[][] matrix = new int[90][90];
        int[] property = new int[90];
        int check = 0;
        for (int i = 0; i < 90; i++) {
            a = num / 10;
            matrix[0][i] = a;
            b = num - a*10;
            matrix[1][i] = b;
            num++;
        }
        for (int i = 0; i < 90; i++) {
            check = (int) (Math.pow((double)matrix[0][i],2) * Math.pow((double)matrix[1][i],2));
            //System.out.println(check);
            while (check > 9 && check < 100) {
                a = check / 10;
                b = check - a;
                check = (int)(Math.pow(a, 2) * Math.pow(b, 2));
            }
            if (check < 10 ) {
                property[i] = matrix[0][i] * 10 + matrix[1][i];
            }else{
                ;
            }
        }
        for (int i = 0; i < property.length; i++) {
            if (property[i] == 0) {
                ;
            }else{
            System.out.print(property[i] + " ");}
        }


    }

}