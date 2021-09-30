package Maktab58_HW001_ElhamAmini;

import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number of rows = ");
        int rows = scanner.nextInt();
        System.out.print("Number of columns = ");
        int columns = scanner.nextInt();
        int[][] matrix = new int[rows][columns];
        System.out.print("Values of matrix = ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("======>");
        System.out.println("Original Matrix:");
        displayMatrix(matrix);
        System.out.println("After changing matrix:");
        for (int i = 0; i < matrix.length; i++) {
            int m = matrix[i][i];
            matrix[i][i] = matrix[i][(columns - 1) - i];
            matrix[i][(columns - 1) - i] = m;
        }
        displayMatrix(matrix);
    }

    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
