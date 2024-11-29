package week1;

/*Prob 4: Write a program using switch case which takes a value and prints the respective Size.
If size is 29 then its small
If size is 30 then its Medium
If size is 38 then its Large
If size is 42 then its XLarge
If size is not any of the above then Invalid.*/

import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Size: ");
        int a = in.nextInt();
        switch (a){
            case 20:
                System.out.println("Small");
                break;
            case 30:
                System.out.println("Medium");
                break;
            case 38:
                System.out.println("Large");
                break;
            case 42:
                System.out.println("X-large");
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
