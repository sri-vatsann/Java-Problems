package Sri;

import java.util.Scanner;

public class Primenums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();

        for (int i = 2; i <= n; i++) {
            int q = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    q++;
                }

            }
            if (q == 0) {
                System.out.println(i);
            }
        }
    }
}




