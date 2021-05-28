package com.company.TaskDay7;

import java.util.Scanner;

public class Test13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int j = 0;
        int i = 0;
        while (i < N * N) {
            i++;
            j++;
            System.out.print(" * ");
            if (j == N) {
                j = 0;
                System.out.println("");
            }
        }
    }
}

