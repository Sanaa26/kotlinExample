package com.example.kotlinexample.daatabase;

public class HalfPyramidNumber {
    public static void main(String[] args){

        int n = 5;
        // Print N number pyramid in increments
        for (int i =1; i<=n;i++){
            for (int j=1; j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        // increments Pyramid
        for(int i = 1; i<=n;i++){
            for (int j = 1; j <= n - i + j; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
