package com.company.TaskDay7;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input min range a");
        int a = scanner.nextInt();
        System.out.println("Input max range b");
        int b = scanner.nextInt();
        for (; a > b; ) {
            System.out.println("Input min range a");
            a = scanner.nextInt();
            System.out.println("Input max range b");
            b = scanner.nextInt();
        }
        for (int n = a; n <= b; n++) {
            if (n % 2 == 0) {
                System.out.print(n + " ");
            }
        }

    }
}
