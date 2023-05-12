/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week11;

import java.util.Scanner;

public class Week11 {
    public static void main(String[] args) {
        /*
        Write a program that asks the user to input a number and then it will read the number and print if it is a multiple of 2, 3 or 5. The output should be like this:-

        Enter a number: 10 (Enter)

        2 – 5

        Enter a number: 15 (Enter)
        
        3 – 5
            
        Enter a number: 30 (Enter)
        2 – 3 – 5
        */
        /*
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        
        int x = scanner.nextInt();
        
        if (x % 2 == 0) {
            System.out.print("2");
        }
        if (x % 3 == 0) {
            if (x % 2 == 0) {
                System.out.print(" - ");
            }
            System.out.print("3");
        }
        if (x % 5 == 0) {
            if (x % 2 == 0 || x % 3 == 0)
                System.out.print(" - ");
            System.out.print("5");
        }
        */
        /*
        Write a program that prompts the user to enter a four-digit integer and determines whether it is a palindrome number. A number is a palindrome

        if it reads the same from right to left and from left to right. Here is a sample run of this program:


        Enter a four-digit integer: 1221 (Enter)
        
        1221 is a palindrome
        */
        
        /*
        int x = 1221;
        
        int d1, d2, d3, d4;
        
        d1 = x % 10;
        x /= 10;
        d2 = x % 10;
        x /= 10;
        d3 = x % 10;
        x /= 10;
        d4 = x % 10;
        
        if (d1 == d4 && d2 == d3) {
            System.out.println("it is palindrome");
        }
        */
        /*
        Write a program to print 20 random numbers in range from 0 to 100 (use for loops and random() function) 
        */
        /*for (int i = 0; i < 20; i++) {
            int x = (int)(Math.random() * 100);
            System.out.println(x);
        }*/
        
        /*
        1

        1   2

        1   2   3

        1   2   3   4

        1   2   3   4   5
            
        1   2   3   4   5   6
        */
        /*
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
        */
        
        /*
        Write a method that finds out if the given number is in a given array.
        */
        /*
        int number = 9;
	int[] array = {1,3,23512235,7,8,5, 3, 1, 3, 4, 6, 8, 9}; //6 array[6-1]
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                System.out.println("Number is in");
                break;
            }
        }
        
        for (int i : array) {
            if (i == number) {
                System.out.println("Number is in");
                break;
            }
        }
        */
        
        /*
        If there are multiple matches in the array, return another array of the same size, 
        containing 1 at the indices of the matches, 0 at the rest.
        Array to return : {0,0,1,0,0,1};
        */
        
        /*
        int number = 3;
	int[] array = {1,3,2,7,8,5, 3, 1, 3, 4, 6, 8, 9};
        int[] anotherArray = new int[array.length];
        
        for (int i = 0; i < anotherArray.length; i++) {
            if (array[i] == number)
                anotherArray[i] = 1;
            System.out.print(anotherArray[i] + " ");
        }
        */
        /*
        [ 1   3 ]
        [ 4   5 ]
        a = { {1, 4}, {3, 5} } a[1]
        */
        /*
        int number = 2;
        int[][] matrix = {{1, 2, 3}, {3, 5, 2}, {2, 6, 8}};
        
        int[][] anotherMatrix = new int[matrix.length][matrix[0].length];
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == number)
                    anotherMatrix[i][j] = 1;
                System.out.print(anotherMatrix[i][j] + " ");
            } // row-order, column-order
            System.out.println("");
        }*/
        /*
        int number = 6;
	int[] array = {1,3,5,7,8};
        System.out.println(getClosest(array, number));
        */
    }
    
    /*
        Write a method to compute the area of a circle and return it. 
        it should take the radius of the circle as an input parameter. 
    */
    
    /*double areaOfCircle(double radius) {
        return radius * radius * Math.PI;
    }*/
    
    /*
    Write a method that returns the element closest to the given number in a given array.  
    */
    /*
    static int getClosest(int[] array, int number) {
        int minimum = Math.abs(array[0] - number);
        int minimumIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (Math.abs(array[i] - number) < minimum) {
                minimum = Math.abs(array[i] - number);
                minimumIndex = i;
            }
        }
        return array[minimumIndex];
    }
    */
    
}
