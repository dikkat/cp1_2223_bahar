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
public class Week6_2 {
    
    public static void main(String[] args) {
        /*
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + i * j); // 1x1 = 1
            }
        }
        */
        
        /*
        for (int i = 0; i < 6; i++) {
            if (i == 0){
                System.out.print("\t");
            } else {
                System.out.print(i + "\t");
            }
        }
        
        System.out.println("");
        for (int i = 1; i <= 5; i++) { // row
            System.out.print(i + "\t");
            for (int j = 1; j <= 5; j++) { // column
                System.out.print(i * j + "\t"); // 1x1 = 1
            }
            System.out.println("");
        }
        */
        
        /*
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number");
        int number = scanner.nextInt(); // 34523514
        
        System.out.println("Enter the digit value");
        int digit = scanner.nextInt(); // 4 / 10 = 0
        while (true) {
            if (digit / 10 != 0) {
                System.out.println("Enter a single digit please...");
                digit = scanner.nextInt(); 
            } else {
                break;
            }
        }
        
        int temp = number;
        boolean contains = false;
        //124124 - 4
        while (temp != 0) {
            if (temp % 10 == digit) {
                System.out.println("Given number " + number + " contains given digit " + digit);
                contains = true;
                break;
            }
            temp /= 10;
        }
        if (!contains) {
            System.out.println("Given number " + number + " doesn't contain given digit " + digit);
        }
        */
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number");
        int number = scanner.nextInt(); // 34523514
        
        System.out.println("Enter the digit value");
        int digit = scanner.nextInt(); // 4 / 10 = 0
        while (true) {
            if (digit / 10 != 0) {
                System.out.println("Enter a single digit please...");
                digit = scanner.nextInt(); 
            } else {
                break;
            }
        }
        
        boolean containss = contains(number, digit);
        
        printing(containss, number, digit);
        
    }
    
    public static int sum(int a, int b) { // arguments, parameters
        return a + b;
    }
    
    public static void printing(boolean contains, int number, int digit) {
        if (contains) {
            System.out.println("Given number " + number + " contains given digit " + digit);
        } else {
            System.out.println("Given number " + number + " doesn't contain given digit " + digit);
        }
    }
    
    public static boolean contains(int number, int digit) {
        int temp = number;
        boolean contains = false;
        while (temp != 0) {
            if (temp % 10 == digit) {
                contains = true;
                break;
            }
            temp /= 10;
        }
        return contains;
    }
}
