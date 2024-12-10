// Count the number of digits in the given number
package Sri;

import java.util.Scanner;

public class P11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int q = 0;
        while(n>0){
            n = n/10;
            q++;
        }
        System.out.println(q);
    }
}
