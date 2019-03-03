package com.homeworks;

public class Triangle2 {
    public static void main(String[] args) {
        int row = 5;
        int i = 1;
        while (i <= row) {
            int j = 1;
            while (j <= row) {
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