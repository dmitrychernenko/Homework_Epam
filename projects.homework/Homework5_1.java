package com.homeworks;

public class Homework5_1 {
    public static void main(String[] args) {
        int[] arr = new int[]{8, -2, 22, 4, 28};

        int index1= 0;
        while (index1 < arr.length)
        {
            System.out.print(arr[index1]);
            index1++;
        }


        int index2 = arr.length - 1;
        while (index2 >= 0) {
            System.out.print(arr[index2]);
            index2--;
        }
    }
}

