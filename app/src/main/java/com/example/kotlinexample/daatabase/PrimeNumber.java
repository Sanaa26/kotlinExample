package com.example.kotlinexample.daatabase;

public class PrimeNumber {

    public static void main(String[] args){

        int n =4;
        if (primNumber(n)){
            System.out.println(n+" number is prime");
        } else {
            System.out.println(n+" is not a prime number");
        }
    }
    public static boolean primNumber(int number){
        if (number < 2) {
            return false;
        }
        for (int i=2;i<=Math.sqrt(number);i++){
            if (number%i==0){
                return false;
            }
        }
        return true;

    }
}
