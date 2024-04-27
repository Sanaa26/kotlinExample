package com.example.kotlinexample.daatabase;

public class SelectionSorting {

    public static void PrintArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Selection Sort
    // Time Complexity
    public static void main(String[] args) {
        // Selection Sort
        // Time Complexity = 0(n^2)
        int arr[] = {7, 8, 9, 1, 2};
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        PrintArray(arr);
    }
}
