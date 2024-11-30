package week1;

import java.util.Scanner;

/* Write a program to get firstName and lastName and n as input and print fullName that is firstName+lastName for n times.*/
public class P7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First name: ");
        String fname = input.next();
        System.out.print("Enter Last name: ");
        String lname = input.next();
        System.out.print("Enter N: ");
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(fname+lname);
        }

    }
}
// With While loop
//        while(i<n){
//            System.out.println(fname+lname);
//            i++;
//        }