package week7;

public class Week7_2 {
    
    
    public static void main(String[] args) {
        /*
        int[] array1D = { 0, 1, 5, 7 };
        int[][] array2D = { { 0, 5, 1, 3 }, { 0, 1, 3 } };
        
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                System.out.print(array2D[i][j] + " ");
            } 
            System.out.println("");
        }
        */
        /*
        int[][] array = new int[5][5];
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (i + 1) * (j + 1);
                System.out.print(array[i][j] + "\t");
            } 
            System.out.println("");
        }
        */
        // Populate a 5x5 matrix with random values between
        // 0-100
        
        // create 2 matrices with random values (50-80) 
        // and add them elementwise
        
        /*
        int[][] matrix1 = new int[5][5];
        int[][] matrix2 = new int[5][5];
        int[][] matrix3 = new int[5][5];
        // int[][][] matrices = new int[3][5][5]; try this if you want BUT not necessary for our class do it if you want to improve yourself and become a real programmer
        
        
        populate(matrix1, 30, 50);
        populate(matrix2, 30, 50);
        
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
            } 
        }
        
        System.out.println("MATRIX 1");
        
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.print(matrix1[i][j] + "\t");
            } 
            System.out.println("");
        }
        
        System.out.println("MATRIX 2");
        
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.print(matrix2[i][j] + "\t");
            } 
            System.out.println("");
        }
        
        System.out.println("SUM OF MATRIX 1 AND 2");
        
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.print(matrix3[i][j] + "\t");
            } 
            System.out.println("");
        }
        */
        
        int[][] matrix = new int[5][5];
        populate(matrix, 7, 0);
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            } 
            System.out.println("");
        }
        
        search(matrix, 2);
    }
    
    static void populate(int[][] matrix, int range, int offset) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int)(Math.random() * range) + offset; // 0.xxxxx, 0.913518359 91.3518
            } 
        }
    }
    
    static void search(int[][] matrix, int searched_val) {
        for (int i = 0; i < matrix.length; i++) {
            // int count = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != searched_val) {
                    System.out.println("row " + i + " has 2");
                    break;
                    // count += 1;
                }
            }
            // System.out.println("row " + i + " has " + count + " many " + searched_val);
        }
    }
}
    // MATRICES ARE CRUCIAL IN PROGRAMMING
    // WEB, DATA, MOBILE
    // LINEAR ALGEBRA
    //    c1 c2
    // r1[ 1 0 ]
    // r2[ 3 5 ] 2x2
