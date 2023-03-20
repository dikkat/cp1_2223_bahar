package week2;

import java.util.Scanner;

public class Week2 {

    public static void main(String[] args) {
        /*
        int radius; //declared, not initialized
        System.out.println("Input the radius: ");
        Scanner scanner = new Scanner(System.in);
        radius = scanner.nextInt();
        final double PI = 3.1415;
        double area = Math.pow(radius, 2) * PI;
        System.out.println(area);
        */
        // Calculate the area of a rectangle.
        // Take the edges of the rectangle as input using Scanner.
        /*
        int length;
        int width;
        
        System.out.println("Input the length value: ");
        Scanner scanner = new Scanner(System.in);
        length = scanner.nextInt();
        
        System.out.println("Input the width value: ");
        width = scanner.nextInt();
        
        int area = length * width;
        
        System.out.println("Rectangle area = " + area);
        */
        
        /*Scanner scanner = new Scanner(System.in);
        
        // learn about whitespace in java (in programming in general)
        
        int x, y, z;
        System.out.println("Input three integers");
        x = scanner.nextInt();
        y = scanner.nextInt();
        z = scanner.nextInt();
        double avg = (x + y + z) / 3.0;
        System.out.println("Average of these numbers: " + avg);*/
        
        //Swap the value of two variables without using a third variable.
        
        /*
        int a = 5;
        int b = 10;
        b = b + a; // 15
        a = b - a; // 10
        b = b - a; // 5
        System.out.println(a + "," + b);
        */
        /*
        int a = 12359;
        System.out.println(a / 10.0);
        int lastDigit = a % 10; // modulo operator google it!
        System.out.println(lastDigit);
        */
        
        /*
        int num = 146;
        int reversed_num = 641;
     
        int hundredDigit = num % 10;  // 6
        int tenDigit = (num / 10) % 10; // 4 
        int finalDigit = num / 100;  // 1   146 / 100 = 1.46 => 1
        
        int reversed = (hundredDigit * 100) + (tenDigit * 10) + finalDigit * 1;
        // 600 + 40 + 1 = 641
        System.out.println(reversed);
        */
        
        /*
        Scanner s = new Scanner(System.in);
        int input_count = 3;
        int i1, i2, i3;
        System.out.println("Give numbers: ");
        i1 = s.nextInt();
        i2 = s.nextInt();
        i3 = s.nextInt();
        
        int not_divisable_count = 0;
        not_divisable_count += i1 % 2; // 1
        not_divisable_count += i2 % 2; // 1
        not_divisable_count += i3 % 2; // 2
        
        int divisable_count = 0;
        divisable_count += i1 % 2; // 1
        divisable_count += i2 % 2; // 1
        divisable_count += i3 % 2; // 2
        
        System.out.println(input_count - not_divisable_count);
        System.out.println((divisable_count - input_count) * -1);
        */
    }
    
}
