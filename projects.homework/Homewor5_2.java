package com.homeworks;

public class Homewor5_2 {
    public static void main(String[] args) {
        int[] arr = new int[]{8, -2, 22, 4, 28};
        int index1 = 0;
        int sum1 = 0;
        int number = 0;
        while (index1 < arr.length) {
            if (arr[index1] % 2 == 0) {
                sum1 += arr[index1];
                number++;

            }
            index1++;
        }
        System.out.println("Number of elements is:\t" + number + "\n" + "Sum of elements is:\t" + sum1);
    }
}
