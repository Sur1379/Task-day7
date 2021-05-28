package com.company.TaskDay7;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number from 2 to 30000 range");
        int inputNum = scanner.nextInt();
        int j = 2;
        while (inputNum <= 1 || inputNum > 30000) {
            System.out.println("Input number from 2 to 30000 range");
            inputNum = scanner.nextInt();
        }
        for (int i = inputNum; i > 1; j++) {
            if (i % j == 0) {
                System.out.println(j);
                break;
            }
        }
    }
}
