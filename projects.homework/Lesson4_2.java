package com.homeworks;
import java.util.Scanner;
public class Lesson4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        System.out.println("Binary value : " + strBinary(num));
    }

    static String strBinary(int num) {
        String binary = Integer.toBinaryString(num);
        return binary;
    }
}

