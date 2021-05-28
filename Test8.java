package com.company.TaskDay7;

import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number");
        int inputNum = scanner.nextInt();
        int j = 1;
        int count = 0;
        while (inputNum > 2 * 109) {
            System.out.println("Input number after 219");
            inputNum = scanner.nextInt();
        }
        for (int i = inputNum; i >= j || inputNum < 0; j++) {
            if (i % j == 0) {
                count++;
                if (j == -i) {
                    inputNum = -inputNum;
                }
            }
        }
        System.out.println(count);
    }
}
