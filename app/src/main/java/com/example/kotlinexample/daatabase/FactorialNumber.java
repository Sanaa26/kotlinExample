package com.example.kotlinexample.daatabase;

public class FactorialNumber {
    public static void main(String[] args){

        int num =5;
        printFactorial(num);
    }
    public static void printFactorial(int a){
        if (a<0){
            System.out.print("Invalid");
            return;
        }
        int factorial =1;
        for(int i =a;i>=1;i--){
            factorial= factorial*i;
        }
        System.out.println("Factorial number is "+factorial);
        return;
    }
}
