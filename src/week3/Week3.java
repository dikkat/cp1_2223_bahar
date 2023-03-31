package week3;

import java.util.Scanner;

public class Week3 {
    
    public static void main(String[] args) {
        /*Reverse the digits of a two digit integer.
        With modulo operator.
        Without modulo operator.*/
        /*int x = 36; // -> 51
        
        // int firstDigit = x % 10;
        int secondDigit = x / 10; // 1
        int firstDigit = x - secondDigit * 10; // 5
        int reversed = firstDigit * 10 + secondDigit;
        System.out.println(reversed);
        */
        
        /*
        int x = 3012342;
        
        if (x % 2 == 0) {
            System.out.println("number is even");
        }
        else {
            System.out.println("number is odd");
        }
        */
        
        /*
        Divide an integer by 100 and print the fractional part of the result.

        2005 / 100 = 20.05 -> 0.05
        */
        
        /*
        int num = 1005;
        double div = (double)num / 100; // 10.05
        double frac = div % 1;
        System.out.println(frac);
        if (frac - 0.05 < 0.000001) // floating number comparison
            System.out.println("true");
        */
        
        /*
        double x = 2005;
        int temp = (int)x; // 2005.0 / 100 = 20.05 
        // 2005 / 100 = 20
        // 20.05 - 20 = 0.05
        System.out.println(x / 100 - temp / 100); // 0.05000000000000071 floating point representation
        */
        /*
        int a = 10, b = 25, c = 17, d = 2312;
        double e;
        e=((double)a / (b + 1)) * (c / (double)d);
        System.out.println(e);
        //Find out the result of the operation above without any loss.
        /*
        Find the maximum distance between three numbers x,y,z.
        */
        
        /*
        int x = 12, y = 11, z = 5;
        int xy = Math.abs(x - y);
        int xz = Math.abs(x - z);
        int yz = Math.abs(z - y);
        
        if (xy > xz && xy > yz) {
            System.out.println("x-y distance is max: " + xy);
        } else if (xz > yz) {
            System.out.println("x-z distance is max: " + xz);
        } else {
            System.out.println("y-z distance is max: " + yz);
        }
        */
        
        /*
        Write a program that calculates the letter grade of a student from his final number grade. 
        100-85 for AA
        84-75 for BB
        74-65 for CC
        64-55 for DD
        <=54 for FF
        Error for negative and >100
        Use scanner
        */
        
        /*
        Scanner input = new Scanner(System.in);
        int grade = input.nextInt();
        if (grade <= 100 && grade >= 0) {
            if (grade >= 85) {
                System.out.println("AA");
            } else if (grade >= 75) {
                System.out.println("BB");
            } else if (grade >= 65) {
                System.out.println("CC");
            } else if (grade >= 55) {
                System.out.println("DD");
            } else {
                System.out.println("FF");
            } 
        } else {
            System.out.println("Good bye");
        }
        */
    }
}
