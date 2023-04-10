/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5;

/**
 *
 * @author eislamoglu
 */
public class Week5_2 {
    public static void main(String[] args) {
        /*
        Print numbers from 0 to 100 incremented by 5.
        iterable
        iterator
        */
        /*
        for (int i = 0; i <= 100; i += 5) { //step
            System.out.println(i);
        }
        */
        /*Print even numbers between 1 and 20.*/
        
        /*
        for (int i = 0; i <= 20; i += 2) {
            if (i == 0)
                continue;
            System.out.println(i);
        }
        
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        */
        /*
        Write a program that calculates the value n! for a given number n.
        */
        /*
        int n = 10;
        int factorial = 1;
        for (int i = 1; i <= 10; i++) { // integers in java has a max value of 2^31+1 -> -2^31
            factorial *= i;
        }
        System.out.println(factorial);
        */
        
        /*
        int n = 13;
        
        for (int i = 1; i <= n; i++) {
            int factorial = 1;
            for (int j = 1; j <= i; j++) {
                factorial *= j;
            }
            System.out.println("Factorial value of " + i + " = " + factorial);
        }
        */
        /*
        int n = 10;
        int factorial = 1;
        for (int i = 1; i <= n; i++) { // integers in java has a max value of 2^31+1 -> -2^31
            factorial *= i;
            System.out.println("Factorial value of " + i + " = " + factorial);
        }
        */
        
        /*
        Sum numbers from 1 to 100 until you reach or exceed 3000. 
        Print at which iteration did you reach this value.
        */
        /*
        int sum = 0;
        int i;
        for (i = 1; i <= 100; i++) {
            sum += i;
            if (sum >= 3000) {
               break;
            }
        }
        System.out.println(i);
        System.out.println(sum);
        */
        /*
        for (int i = 1; i <= 10; i++) { //rows
            for (int j = 0; j < i; j++) { //columns
                System.out.print("*");
            }
            System.out.println("");
        }
        */
        
        /*
        for (int i = 9; i >= 1; i--) { // line value
            
            for (int l = 0; l < 10; l++) {
                if (l < 10 - i)
                    System.out.print("_");
                else
                    System.out.print(i);
            }
            System.out.println("");
        }
        */
    }
}
