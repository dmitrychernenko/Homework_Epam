package com.homeworks;

public class Deposit {
    public static void main(String[] args) {
        double deposit = 10000;
        double percent = 0.12;
        double month = 6;
        double balans;

      balans = deposit * percent * month / 12;

      System.out.println(balans);

    }
}
