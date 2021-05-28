package com.company.TaskDay7;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a");
        int a = scanner.nextInt();
        System.out.println("Input b");
        int b = scanner.nextInt();
        int i = 1;
        for (; a > b; ) {
            System.out.println("Input a");
            a = scanner.nextInt();
            System.out.println("Input b");
            b = scanner.nextInt();
        }
        for (; i * i < b; i++) {
            if (i * i > a && i * i < b) {
                System.out.println(i * i);
            }
        }
    }
}



