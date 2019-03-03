package com.homeworks;

import java.util.Scanner;

public class Triangle5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int row = sc.nextInt();
        int maxrow = 2 * row;
        int i = 1;
        while (i <= row) {
            int j = 0;
            while (j < row - i) {
                System.out.print(" ");
                j++;
            }
            i++;
            int k = i-1;
            while (k > 0) {
                System.out.print(" *");
                k--;
            }
            System.out.println();
        }

        while (i <= maxrow) {
            int j = 0;
            while (j < maxrow - i) {
                System.out.print(" ");
                j++;
            }
            i++;
            int k = i-1;
            while (k > row) {
                System.out.print(" *");
                k--;
            }
            System.out.println();
        }
    }
}
