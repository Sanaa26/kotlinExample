package com.example.kotlinexample.daatabase;

public class AverageNumber {

    public static void main(String[] args){

        int a=3;
        int b=4;
        int c=2;
        int avr= findAvg(a,b,c);
        System.out.println(avr);
    }

    public static int findAvg(int a,int b, int c){

        return (a+b+c)/3;
    }
}

