package com.homeworks;

import java.util.Scanner;

public class Triangle4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int row = sc.nextInt();
        int rowmax = row * 2 - 1;
        int i = 1;
        while (i <= row) {
            int j = 0;
            while (j < row - i) {
                System.out.print(" ");
                j++;
            }
            i++;
            int k = i - 1;
            while (k > 0) {
                System.out.print("*");
                k--;
            }
            System.out.println();
        }

        while (i <= rowmax) {
            int j = row;
            while (j <= rowmax) {
                if (j < i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
                j++;
            }
            System.out.println();
            i++;


        }
    }
}
