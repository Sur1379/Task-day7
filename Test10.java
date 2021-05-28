package com.company.TaskDay7;

import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        int decimalNum = 0;
        int result = 1;
        for (int count = 0; count < 16; count++) {
            if (count == 0) {
                if (a % 10 == 0) {
                    a /= 10;
                    continue;
                }
                a /= 10;
                decimalNum = result;
                continue;
            }
            if (a % 10 == 0 && count != 0) {
                a /= 10;
                result = result * 2;
                continue;
            }
            if (a % 10 == 1 && count != 0) {
                a /= 10;
                result = result * 2;
            }
            decimalNum = decimalNum + result;
        }
        System.out.println(decimalNum);
    }
}

