package com.example.kotlinexample.daatabase;

public class returnLargeNumber {
    public static void main(String[] args){

        int a= 10;
        int b=20;
        int num = returnLargeNumber(a,b);
        System.out.println(num);
    }

    public static int returnLargeNumber(int a, int b){

        return (a>b) ?a:b;
    }
}
