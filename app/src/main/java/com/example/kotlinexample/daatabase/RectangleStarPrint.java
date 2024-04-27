package com.example.kotlinexample.daatabase;

import java.util.*;

public class RectangleStarPrint {

    public static void main(String[] args) {


        int n = 4;
        int m = 6;
        for (int i = 0; i<n; i++) {
            // inner loop
            for (int j = 0; j <m; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }

}
