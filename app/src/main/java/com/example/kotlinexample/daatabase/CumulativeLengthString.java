package com.example.kotlinexample.daatabase;

public class CumulativeLengthString {

    public static void main(String[] args) {
        String[] StringsName = {"Sana", "Abhi", "Sanaa", "Kareena"};


        int cumulativeLength = 0;
        for (int i = 0; i < StringsName.length; i++) {
            cumulativeLength += StringsName.length;

            System.out.println(cumulativeLength);
        }
    }
}
