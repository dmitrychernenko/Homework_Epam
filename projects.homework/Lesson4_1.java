package com.homeworks;
import java.util.Scanner;
public class Lesson4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write something : ");
        String str = sc.nextLine();
        System.out.println("Unique characters : " + sepCharachter(str));
    }

    static String sepCharachter(String str) {
        String sepStr = "";
        for (char ch : str.toCharArray()) {
            if (sepStr.indexOf(ch) == -1 ) {
                sepStr += ch + ", ";
            }
        } return sepStr;
    }
}