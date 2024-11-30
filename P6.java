package week1;

import java.util.Scanner;

public class P6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter X: ");
        int x = input.nextInt();
        int a = 0;
        int b = 1;

        for (int i = 1; a<1000 ; i++) {
            a= x*i;
            System.out.println(a);
        }
    }
}
// With While loop //
//        while (a<1000){
//            a= x*b;
//            System.out.println(a);
//            ++b;
//        }
