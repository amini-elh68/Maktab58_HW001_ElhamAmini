package Maktab58_HW001_ElhamAmini;

import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] numbers = new int[count];
        for (int i = 0; i < count; i++) {
            numbers[i] = scanner.nextInt();
        }
        numbers = removeDuplicates(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            System.out.print(" ");
        }
        System.out.println();
    }

    public static int[] removeDuplicates(int[] array) {
        int[] copy = new int[array.length];
        int countOfUniq = 0;
        for (int i = 0; i < array.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < copy.length; j++) {
                if (array[i] == copy[j]) {
                    isDuplicate = true;
                }
            }
            if (!isDuplicate) {
                copy[countOfUniq] = array[i];
                countOfUniq++;
            }
        }
        int[] deletedArray = new int[countOfUniq];
        for (int i = 0; i < countOfUniq; i++) {
            deletedArray[i] = copy[i];
        }
        return deletedArray;
    }
}
