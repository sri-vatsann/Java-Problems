package week1;
/* Write a program which takes two values x and y. Prints x for y number of times.*/

import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter X: ");
        int x = input.nextInt();
        System.out.print("Enter Y: ");
        int y = input.nextInt();
        for (int i = 0; i < y ; i++) {
            System.out.println(x);
        }
    }
}
// While loop //
//int i = 0;
//        while(i<y ){
//        System.out.println(x);
//i++;
//        }
