package com.example.kotlinexample.daatabase;

public class BubbleSorting {
    public static void PrintString(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int arr[] = {4,3,2,9,7,8};
        // Bubble Sort
        // Time Complexity = 0(n^2)
        //Outer l
        for (int i=0;i<arr.length-1;i++){ //n-1
            for (int j=0;j<arr.length-i-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp= arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        PrintString(arr);
    }
}

