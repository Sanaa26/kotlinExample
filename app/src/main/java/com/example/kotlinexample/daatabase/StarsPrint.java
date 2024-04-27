package com.example.kotlinexample.daatabase;

public class StarsPrint {
    public static void main(String[] args) {
        int rows = 5; // Number of rows for the rhombus



        // Upper half of the rhombus
        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= rows; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half of the rhombus
//        for (int i = rows - 1; i >= 1; i--) {
//            // Print spaces
//            for (int j = 1; j <= rows - i; j++) {
//                System.out.print(" ");
//            }
//            // Print stars
//            for (int k = 1; k <= rows; k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
    }
}
