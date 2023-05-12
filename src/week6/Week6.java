/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week6;

import java.util.Scanner;

/**
 *
 * @author eislamoglu
 */
public class Week6 {
    /*
    public static int sum(int a, int b) {
        //int sum = a + b;
        //return sum;
        return a + b;
    }
    */
    public static void main(String[] args) {
        // Print the multiplication table.
        // 3 x 4 = 12
        // 3 x 5
        // 3 x 10
        // 4 x 1

        /*
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + i * j);
            }
        }
         */
        // Google: output formatter
        /*
        for (int i = 1; i < 6; i++) {
            System.out.print("\t" + i);
        }

        System.out.println("");
        for (int k = 1; k <= 5; k++) {
            System.out.print(k);
            for (int j = 1; j <= 5; j++) {
                System.out.print("\t" + k * j);
            }
            System.out.println();
        }
        */
        
        /*Print if a number taken from the user contains a digit given by the user.*/
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = scanner.nextInt();
        System.out.println("Enter the digit:");
        int digit = scanner.nextInt();
        while (true) {
            if (digit / 10 == 0)
                break;
            System.out.println("Enter a single digit please.");
            System.out.println("Enter the digit:");
            digit = scanner.nextInt();
        }
        
        //123456
        //4
        
        boolean contains = false;
        int operand = number;
        while (operand != 0) {
            if (digit == operand % 10) { // current_digit = 6 != given_digit= 4 -> current_digit = 5 != given_digit = 4 -> current_digit = 4 == given_digit = 4 END
                System.out.println("Given number " + number + " contains given digit " + digit);
                contains = true;
                break;
            }
            operand /= 10;
        }
        if (!contains) {
            System.out.println("Given number " + number + " doesn't contain given digit " + digit);
        }
        */
        
        /*
        int summed = sum(10,5);
        System.out.println(summed);
        summed = sum(101231,52342);
        System.out.println(summed);
        summed = sum(11230,45435);
        System.out.println(summed);
        */
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = scanner.nextInt();
        System.out.println("Enter the digit:");
        int digit = scanner.nextInt();
        while (true) {
            if (digit / 10 == 0)
                break;
            System.out.println("Enter a single digit please.");
            System.out.println("Enter the digit:");
            digit = scanner.nextInt();
        }
        
        f(number, digit);
        */
        
        // Design an algorithm that finds out the digits that are not present in a given number
        
        /*
        int number = 235134605;
        
        f2(number);
        */
    }
    /*
    public static void f2(int number) {
        for (int i = 0; i <= 9; i++) {
            int temp = number;
            boolean contains = false;
            
            while(temp != 0) {
                if (temp % 10 == i) {
                    contains = true;
                    break;
                }
                temp /= 10;
            }
            if (!contains) {
                System.out.println(i);
            }
        }
    }
    
    public static void f(int number, int digit) {
        boolean contains = false;
        int operand = number;
        while (operand != 0) {
            if (digit == operand % 10) { // current_digit = 6 != given_digit= 4 -> current_digit = 5 != given_digit = 4 -> current_digit = 4 == given_digit = 4 END
                System.out.println("Given number " + number + " contains given digit " + digit);
                contains = true;
                break;
            }
            operand /= 10;
        }
        if (!contains) {
            System.out.println("Given number " + number + " doesn't contain given digit " + digit);
        }
    }
    */
}
