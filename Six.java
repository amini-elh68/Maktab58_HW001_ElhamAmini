package Maktab58_HW001_ElhamAmini;

import java.util.Scanner;

public class Six {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = scanner.nextInt();
        System.out.println("Enter Symbol:");
        String symbol = scanner.next();
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
        System.out.println();
    }
}
