package com.example.kotlinexample.daatabase;

public class SumOddNumber {

    public static void main(String[] args){

        int n= 10;
        int sum= sumOddNum(n);
        System.out.println(sum);

    }
    public static int sumOddNum(int n){
        int sum=0;
        for (int i=1;i<=n;i++){
            if (i%2!=0){
                sum+=i;
            }
        }
        return sum;
    }
}
