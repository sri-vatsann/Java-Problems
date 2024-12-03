/* Write a Program which takes input n and prints the below pattern and upload the code to your github repo.
Sample 1:Input:n = 4
Expected output:
****
***
**
*
*/
package week1;

import java.util.Scanner;

public class P8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int  n = in.nextInt();

       // Decrement method by renducing the outer loop i=4 and reducing till 0 we get 4,3,2,1 and inner loop
        // as till j<=i and j=1 it prints till i
        for (int i = n; i >0; i--) {
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
        System.out.println();

        // By increment and changing the condition of the inner loop say j=n+1-i
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n+1-i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
