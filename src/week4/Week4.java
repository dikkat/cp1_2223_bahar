package week4;

import java.util.Locale;
import java.util.Scanner;


public class Week4 {
    /*
    Write a program that prints the name of the corresponding month for a given number, using if statements.
    3 -> March
    6 -> June
    12 -> December
    1 -> January
    */
    
    
    
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
    
        int number = scanner.nextInt();
        String month = "";
    
        if (number == 1) {
            month = "January";
        } else if (number == 2) {
            month = "February";
        } else if (number == 3) {
            month = "March";
        } else if (number == 4) {
            month = "April";
        } else if (number == 5) {
            month = "May";
        } else if (number == 6) {
            month = "June";
        } else if (number == 7) {
            month = "July";
        } else if (number == 8) {
            month = "August";
        } else if (number == 9) {
            month = "September";
        } else if (number == 10) {
            month = "October";
        } else if (number == 11) {
            month = "November";
        } else if (number == 12) {
            month = "December";
        }
        
        if (number < 1 || number > 12) {
            System.out.println("Number is not allowed.");
        } else {
            System.out.println("The corresponding month is " + month);
            }
        */
        /*
        Scanner scanner = new Scanner(System.in);
    
        int number = scanner.nextInt();
        String day = "";
        
        switch (number) {
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;
            default:
                day = "not found";
                break;
        }
        System.out.println("The corresponding day of the week is " + day);
        */
        /*
        double purchaseAmount;
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);
        
        System.out.println("Enter the purchase amount:");
        purchaseAmount = scanner.nextDouble();
        
        if (purchaseAmount < 0) {
            System.out.println("Illegal amount.");
        } else if (purchaseAmount < 200) {
            purchaseAmount *= 0.9;
        } // else if (purchaseAmount >= 200 && purchaseAmount <= 400) {
          else if (purchaseAmount <= 400) {
              purchaseAmount *= 0.85;
        } else {
              purchaseAmount *= 0.80;
        }
        
        System.out.println("Final amount is " + purchaseAmount);*/
        /*
        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.next();
        
        char c = input.charAt(0);
        
        if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            System.out.println("vowel = true");
        } else
            System.out.println("vowel = false");
        */
        
        /*
        char c1 = '1';
        char c2 = '3';
        char c4 = (char)(c1 + c2);
        System.out.println(c4);
        */
        
        /*
        int grade = 90;
        String letter = grade > 0 && grade < 40 ? "FF" : grade <= 70 ? "CC" : grade < 100 ? "AA" : "illegal";
        System.out.println(letter);
        */
        
        /*
        Years that are divisible by 4 (except for years evenly divisible by 100, but not by 400) are called leap years. 
        */
        
        /*
        int year = 1900; // 300
        boolean leap = year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
       
        System.out.println(year + " is " + (leap ? "" : "not ") + "a leap year." );
        */
        
        /*
        char c = '5';
        
        boolean isUpper = c > (int)'A' && c < (int)'Z';
        boolean isLower = c > (int)'a' && c < (int)'z';
        boolean isLetter = isUpper || isLower;
        
        System.out.println("Given char is " + (isUpper ? "upper case" : isLower ? "lower case" : "not a letter"));
        */
    }
}