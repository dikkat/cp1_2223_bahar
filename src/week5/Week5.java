package week5;

public class Week5 {
    public static void main(String[] args) {
        /*int i;
        for (i = 0; i <= 100; i += 5) {
            System.out.println(i);
        }*/
        
        /*
        Print even numbers between 1 and 20.
        */
        /*
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0)
                System.out.println(i);
        }
        
        for (int i = 0; i <= 20; i += 2) {
            if (i == 0)
                continue;
            else
                System.out.println(i);
        }
        
        /* Print multiples of 7 between 1 and 200 */
        /*
        for (int i = 0; i <= 200; i += 7) {
            if (i != 0)
                System.out.println(i);
        }
        */
        
        /*
        Write a program that calculates the value n! for a given number n.
        */
        
        /*
        int n = 6, result = 1;
        
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        
        System.out.println(result);
        */
        
        /*
        int n = 6, result = 1;
        int i = 1;
        while (i <= n) {
            result *= i;
            i++;
        }
        
        System.out.println(result);
        */
        
        /*
        Print the factorial values of numbers from 1 to 10.
        */
        
        /*
        int n = 10;
        
        for (int i = 1; i <= 10; i++) {
            int result = 1;
            for (int j = 1; j <= i; j++ ) {
                result *= j;
            }
            System.out.println(result);
        }
        */
        
        
        
        /*
        int result = 1;
        for (int i = 1; i <= 10; i++) {
            System.out.println(result);
            result *= i;
        }
        */
        
        /*
        Sum numbers from 1 to 100 until you reach 3000. Print at which iteration did you reach this value.
        */
        
        /*
        int sum = 0;
        int i;
        for (i = 1; i <= 100; i++) {
            sum += i;
            if (sum >= 3000)
                break;
        }
        
        System.out.println(sum);
        System.out.println(i);
        */
        
        /*
        Write the program that prints the following output.
        */
        
        /*
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
        */
        for (int i = 9; i >= 1; i--) { // number for a row
            /*
            for (int j = 0; j < 10 - i; j++) { // # of underscores
                System.out.print("_");
            }
            for (int k = 0; k < i; k++) { // # of i values
                System.out.print(i);
            }
            */
            for (int l = 0; l < 10; l++) {
                if (l < 10 - i) {
                    System.out.print("_");
                } else {
                    System.out.print(i);
                }
            }
            System.out.println("");
        }
    }
}
