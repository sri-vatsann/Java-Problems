package Sri;

import java.util.Scanner;

public class P12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter N:");
        int  n = in.nextInt();
        int c =0;
        while (n > 0) {
            int rem = n % 10;
            c = (c * 10) + rem;

            n = n / 10;
        }
        System.out.println(c);
    }
}
