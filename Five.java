package Maktab58_HW001_ElhamAmini;

import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("رشته ای از حروف را وارد کنید:");
        String a = input.next();
        String b = a.toLowerCase();
        char c = b.charAt(0);

        switch (c) {
            case 'a':
            case 'i':
            case 'e':
            case 'o':
            case 'u':
                System.out.println("حرف صدادار است");
                break;
            default:
                System.out.println("حرف صدادار نیست");

        }
    }
}
