package com.example.kotlinexample.daatabase;

public class BitExample {
    public static void main(String[] args) {

        int n = 5;
        int pos = 3;
        int bitMask = 1 << pos;
        if ((bitMask & n) == 0) {
            System.out.println("Bit was zero");
        } else {
            System.out.println("bit was one");
        }
    }
}