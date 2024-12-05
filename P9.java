package Week2;

import java.util.Scanner;
/*Write a Program which takes input n and prints the below pattern and upload the code to your github repo.
Sample 1:
Input:
  n = 4
Expected output:
 4321
 321
 21
 1
*/
import java.util.Scanner;

public class P9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = in.nextInt();

        //Decrement operation
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
//        System.out.println("***********");
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n+1-i ; j++) {
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }

    }
}
