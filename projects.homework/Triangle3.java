package com.homeworks;


import java.util.Scanner;

public class Triangle3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int i = 0;
        while (i <= n) {
            int j = 0;
            while (j < n-i) {
                System.out.print(" ");
                j++;
            }
            i++;
            int k = i;
            while (k > 0) {
                System.out.print("*");
                k--;
            }
            System.out.println();
        }
    }
}