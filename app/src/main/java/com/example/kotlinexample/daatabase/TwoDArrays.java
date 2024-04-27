package com.example.kotlinexample.daatabase;

public class TwoDArrays {

    public static void main(String[] args) {

        //Print 2d Array
        int[][] marks = new int[3][3];
        marks[0][0] = 10;
        marks[0][1] =20;
        marks[0][2] =30;
        marks[1][0] =40;
        marks[1][1] =50;
        marks[1][2]=60;

        for (int i =0; i<marks.length;i++){
            for (int j =0;j<marks.length;j++){
                System.out.print(marks[i][j]+" ,");
            }
            System.out.println();
        }

         // Find X position in 2d Array
        int[][] number = new int[3][3];
        number[0][0] = 5;
        number[0][1] = 10;
        number[1][2] = 15;
        number[2][0] = 20;

        int x = 15;
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++) {
                if (number[i][j] == x) {
                    System.out.print("number x position is " + i + ", " + j); // Print each element

                }
                System.out.println();
            }
        }
    }
}
