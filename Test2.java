package com.company.TaskDay7;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a");
        int a = scanner.nextInt();
        System.out.println("Input b");
        int b = scanner.nextInt();
        for (; a > b; ) {
            System.out.println("Input a");
            a = scanner.nextInt();
            System.out.println("Input b");
            b = scanner.nextInt();
            System.out.println("Input c");
            int c = scanner.nextInt();
            System.out.println("Input d");
            int d = scanner.nextInt();
        }
        System.out.println("Input c");
        int c = scanner.nextInt();
        System.out.println("Input d");
        int d = scanner.nextInt();

        for (int n = a; n <= b; n++) {
            if (n % d == c) {
                System.out.println(n);
            }
        }
    }
}
