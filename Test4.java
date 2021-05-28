package com.company.TaskDay7;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input x");
        int x = scanner.nextInt();
        System.out.println("Input d");
        int d = scanner.nextInt();
        int count = 0;

        for (; d != 0; ) {
            if (d % 10 == x) {
                count++;
            }
            d = d / 10;
            if (d == 0) {
                System.out.println(count);
            }
        }


    }
}

