package week1;

/*Prob 3:

Given mark of student, Print the Grade
Grade A if mark is greater than or equal to 90
Grade B if mark is greater than or equal to 80
Grade C if mark if greater than or equal to 60
Grade D if mark if greater than or equal to 35
Fail if mark is lesser than 35
*/

import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the mark: ");
        int a = in.nextInt();

        if (a>=90){
            System.out.println("Grade A");
        } else if (a>=80) {
            System.out.println("Grade B");
        } else if (a>=60) {
            System.out.println("Grade C");
        } else if (a>=35) {
            System.out.println("Grade D");
        }else {
            System.out.println("Fail");
        }
    }
}
