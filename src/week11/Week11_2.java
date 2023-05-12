/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week11;

/**
 *
 * @author eislamoglu
 */
public class Week11_2 {
    public static void main(String[] args) {
        /*
        int number = 30;
        
        if (number % 2 == 0) {
            System.out.print("2");
        }
        if (number % 3 == 0) {
            if (number % 2 == 0)
                System.out.print(" - ");
            System.out.print("3");
        }
        if (number % 5 == 0) {
            if (number % 2 == 0 || number % 3 == 0)
                System.out.print(" - ");
            System.out.print("5");
        }
        System.out.println("");
        */
        /*
        int d1, d2, d3, d4;
        int x = 1221;
        
        d1 = x % 10; // 1
        d2 = (x / 10) % 10; // 2
        d3 = (x / 100) % 10; // 2
        d4 = (x / 1000) % 10; // 1
        
        if (d1 == d4 && d2 == d3) {
            System.out.println("it is palindrome");
        }
        */
        
        /*
        for (int i = 0; i < 20; i++) {
            System.out.println((int)(Math.random() * 100));
        } // 0.****
        */
        /*
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(j + " ");
            System.out.println("");
        }
        */
        /*
        int sum = 0;
        int counter = 10;
        while (counter <= 20) {
            sum += counter++;
        }
        System.out.println(sum);
        */
        // System.out.println(areaOfCircle(5));
        // byte var = 127;
        // System.out.println((int)++var);

        // int array with size 10
        // [0][0][0][[0][0][0][0][0][0][0]
        // ARRAYS ALWAYS START AT 
        // first index = 0, last index = array.length - 1
        // Object array, String size 10
        // [null][null][null][null][null][null][null][null][null][null]
        /*int[] array = new int[4];
        int[] array_alt = {3, 5, 4, 2, 2, 1, 7, 9, 2345, 1, 5};
        int[] array_alt2 = new int[]{3, 5, 4, 2};
        
        int number = 5;
        for (int i = 0; i < array_alt.length; i++) {
            if (array_alt[i] == number) {
                System.out.println("number is in array");
                break;
            }
        }*/
        
        /*
        int number = 5;
        int[] array = {3, 5, 4, 2, 5, 1, 7, 5, 15, 1, 5};
        int[] matches = new int[array.length];
        
        for (int i = 0; i < matches.length; i++) {
            if (array[i] == number) {
                matches[i] = 1;
            }
            System.out.print(matches[i] + " ");
        }
        */
        
        // { { 1, 5, 7 }, { 2, 4, 1 } }
        // matrix
        // [ 1  5  7 ]
        // [ 2  4  1 ]
        
        int number = 5;
        int[][] matrix = { { 1, 5, 7 }, { 2, 4, 1 }, { 2, 5 }, { 5, 8, 7, 4 } };
        int[][] matches = new int[matrix.length][];
        for (int i = 0; i < matrix.length; i++) {
            matches[i] = new int[matrix[i].length];
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == number)
                    matches[i][j] = 1;
                System.out.print(matches[i][j] + " ");
            }
            System.out.println("");
        }
        
        
        // System.out.println(array_alt[array_alt.length]);
    }
    /*public static double areaOfCircle(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }*/
}
