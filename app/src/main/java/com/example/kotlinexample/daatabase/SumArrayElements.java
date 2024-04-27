package com.example.kotlinexample.daatabase;

public class SumArrayElements {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4};
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i];
        }
        System.out.println(sum);


    }
}