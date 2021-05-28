package com.company.TaskDay7;

import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number");
        int count = 10;
        int result = 0;
        for (int i = 0; i < count; i++) {
            int inputNum = scanner.nextInt();
            if (i != 9) {
                System.out.println("Input next number");
            }
            result = inputNum + result;
        }
        System.out.println("Result of amount ` " +result);
    }
}
