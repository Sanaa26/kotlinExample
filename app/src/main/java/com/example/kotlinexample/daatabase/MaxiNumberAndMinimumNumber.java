package com.example.kotlinexample.daatabase;


public class MaxiNumberAndMinimumNumber {

    public static void main(String[] args) {

        int[] number = {1, 2, 3, 4, 5};

        int max = number[0];
        int min = number[0];
        for (int i = 0; i < number.length; i++) {
            if (number[i] < min) {
                min = number[i];
            }
            if (number[i] > max) {
                max = number[i];
            }
        }
        System.out.println("Maximum number is" + max);
        System.out.println("Minimum number is " + min);
    }
}
