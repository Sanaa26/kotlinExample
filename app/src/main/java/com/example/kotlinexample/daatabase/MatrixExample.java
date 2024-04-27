package com.example.kotlinexample.daatabase;

public class MatrixExample {
    public static void main(String[] args) {

        int n = 3;
        int m = 3;


        int[][] matrix = new int[n][m];

        matrix[0][0] =1;
        matrix[0][1]=3;
        matrix[0][2]=5;
        matrix[1][0]=7;
        matrix[1][1]=9;
        matrix[1][2]=11;


        System.out.println("The transpose is : ");
        //To print transpose
        for(int j=0; j<m ;j++) {
            for(int i=0; i<n; i++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

}
