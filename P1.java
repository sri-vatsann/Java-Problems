package week1;
//Write a program that takes an integer, then a string, then a char from the user and prints them in the screen.

import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a integer: ");
        int a = input.nextInt();

        System.out.print("Enter a String: ");
        String b = input.next();

        System.out.print("Enter a Character: ");
        char c = input.next().trim().charAt(0);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
