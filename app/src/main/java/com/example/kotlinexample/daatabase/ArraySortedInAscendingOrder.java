package com.example.kotlinexample.daatabase;

public class ArraySortedInAscendingOrder {
    public static void main(String[] args){

        int number[] = {21,4,5,7,9};

        boolean isAscending = true;
        for (int i =0; i<number.length -1;i++){

            if (number[i]> number[i+1]){
                isAscending = false;
            }
        }
        if (isAscending){
            System.out.println("The array is sorted in ascending order ");
        } else {
            System.out.println("The array is not sorted in ascending order ");
        }
    }
}
