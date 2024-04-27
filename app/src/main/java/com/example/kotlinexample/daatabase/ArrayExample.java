package com.example.kotlinexample.daatabase;

import java.util.Scanner;

public class ArrayExample {

    public static void main(String[] args) {


        //Simple Example
        int[] number = {1, 3, 5, 9};
        //input
        int x = 5;

        for (int i = 0; i < number.length; i++) {
            if (number[i] == x) {
                System.out.println("Found number of x  " + x);
            }
        }

        String[] name= {"Sana","Kareena","Afzal"};
        String Sana ="Sana";
        for(int i=0;i<name.length;i++){
            System.out.println("Name of people  "+(i+1)+ "  is name " +name[i]);
            if (name[i]==Sana){
                System.out.println("Found name "+Sana);
            }
        }


    }
}
