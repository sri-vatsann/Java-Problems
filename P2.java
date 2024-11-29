package week1;
/*Prob 2: Write a program to check whether a triangle can be formed with the given values for the angles.*/

import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the 3 angles");

        System.out.print("Enter angle A :");
        float a = in.nextFloat();

        System.out.print("Enter angle B :");
        float b = in.nextFloat();

        System.out.print("Enter angle C :");
        float c = in.nextFloat();

        float angle = a+b+c;
        if (angle == 180){
            System.out.println("Triangle can be formed");
        }else {
            System.out.println("Triangle cannot be formed");
        }
    }
}
