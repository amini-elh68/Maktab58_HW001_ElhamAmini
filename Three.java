package Maktab58_HW001_ElhamAmini;

import java.util.Scanner;

public class Three {
    public static void main(String[] args) {

        System.out.println("مجموعه را وارد کنید:");
        Scanner input = new Scanner(System.in);
        String j = input.next();
        String[] array = j.split(",");

        for (int i = 0; i < array.length; i++) {

            if (array[i].contains("-")) {

                String[] arr = array[i].split("-");
                int a = Integer.valueOf(arr[1]);
                int b = Integer.valueOf(arr[0]);
                int[] array2 = new int[a - b - 1];

                for (int k = 0; k < array2.length; k++) {
                    if (k == 0) {
                        array2[k] = b + 1;
                    } else {
                        array2[k] = array2[k - 1] + 1;
                    }
                    if (k == 0) {
                        System.out.print(b);
                        System.out.print(",");
                        System.out.print(array2[k]);
                        System.out.print(",");
                    } else {
                        System.out.print(array2[k]);
                        System.out.print(",");
                    }
                }
                System.out.print(a);
                System.out.print(",");
            } else {
                System.out.print(array[i]);
                System.out.print(",");
            }
        }
    }
}


