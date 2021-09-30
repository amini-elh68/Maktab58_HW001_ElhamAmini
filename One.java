package Maktab58_HW001_ElhamAmini;

import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("عدد را وارد کنید:");
        int b = input.nextInt();
        String a = String.valueOf(b);
        String revers = "";

        for (int i = a.length() - 1; i >= 0; i--) {
            revers += a.charAt(i);
        }

        int result = Integer.valueOf(revers);
        if (result == b) {
            System.out.println("متقارن است");
        } else
            System.out.println("متقارن نیست");
    }
}
