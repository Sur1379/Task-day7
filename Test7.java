package com.company.TaskDay7;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number");
        int inputNum = scanner.nextInt();
        int j = 1;
        for (int i = inputNum; i >= j; j++) {
            if (i % j == 0) {
                System.out.print(j +" ");
            }
        }
    }
}
