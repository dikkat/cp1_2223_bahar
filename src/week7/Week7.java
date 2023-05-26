package week7;

public class Week7 {
    public static void main(String[] args) {
        /*
        int[] array1D = {0, 1, 3};
        int[][] array2D = { {0, 1, 3, 4, 6}, {1, 3, 5} };
        
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++)
                System.out.print(array2D[i][j] + " "); // j th
            System.out.println("");
        */
        /*
        int[][] array = new int[5][5];
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++)
                array[i][j] = (i + 1) * (j + 1);
        }
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++)
                System.out.print(array[i][j] + " "); // j th
            System.out.println("");
        }
        */
        // Create two 2d arrays with random values 0-100 of 5x5 sizes.
        // Add them elementwise. A3 = A1 + A2
        // 0 5 3            3 4 6           3 9 9
        // 1 0 4            1 5 9           2 5 13
        //
        //
        // 0 - 1 0.****
        
        /*
        int[][] array1 = new int[5][5];
        int[][] array2 = new int[5][5];
        int[][] array3 = new int[5][5];
        // int[][][] arrays = new int[3][5][5]; try this if you want BUT not necessary for our class do it if you want to improve yourself and become a real programmer
        
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++){
                array1[i][j] = (int)(Math.random() * 100);
                array2[i][j] = (int)(Math.random() * 100);
                array3[i][j] = array1[i][j] + array2[i][j];
            }
        }
        
        System.out.println("MATRIX 1");
        
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++)
                System.out.print(array1[i][j] + "\t"); // j th
            System.out.println("");
        }
        
        System.out.println("MATRIX 2");
        
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++)
                System.out.print(array2[i][j] + "\t"); // j th
            System.out.println("");
        }
        
        System.out.println("MATRIX 3");
        
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++)
                System.out.print(array3[i][j] + "\t"); // j th
            System.out.println("");
        }
        */
        // Print the indices of the rows of a given two dimensional 
        // array that contains the number 2.
        // Print the indices of the rows that doesn't contain number 2.
        // Create an array that stores the sum of the values 
        // for each row of a two dimensional array.
        // Print the index of the column 
        // with the highest total sum value.
        int[][] matrix = { {0, 2, 3, 4, 6}, {2, 1, 2, 3, 0}, 
        {1, 3, 3, 5, 6}, {1, 4, 5, 6, 5},
        {3, 2, 6, 1, 2} };
        
        int[] sums = new int[5];
        int[] columnsSums = new int[5];
        
        for (int i = 0; i < matrix.length; i++) {
            boolean hasnt2 = true;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 2) {
                    hasnt2 = false; // has not 2 is false -> has 2 is true
                }
                sums[i] += matrix[i][j];
                columnsSums[i] += matrix[j][i];
            }
            if (hasnt2) System.out.println(i + " doesnt have 2");
            else System.out.println(i + " has 2");
            System.out.println("Sum of row " + i + " is " + sums[i]);
        }
        for (int i : columnsSums) {
            System.out.print(i + " ");
        }
    }
        
}
