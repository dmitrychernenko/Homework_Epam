package com.homeworks;
import java.util.Scanner;

public class Triangle1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int maxrow = sc.nextInt();
        int row = 1;
        while (row <= maxrow) {
            int number = row;
            while (number >= 1) {
                System.out.print("*");
                number--;
            }
            row++;
            System.out.println();
        }
        while (row > 1) {
            int number = row - 1;
            while (number > 1) {
                System.out.print("*");
                number--;
            }
            row--;
            System.out.println();
        }
        }
}




