package com.example.kotlinexample.daatabase;
import java.util.*;
public class StringExample {
    public static void main(String[] args){
        String name= "Sana Khan";
        String name2="Sana Khan";
        String sentence ="My name is Sana";

        String nameIndex= sentence.substring(0,5);
        System.out.println(nameIndex);


        if (name.compareTo(name2)==0){
            System.out.println("String are equal");
        } else {
            System.out.println("String are not equal ");
        }

        for (int i =0;i<name.length();i++){
            System.out.println(name.charAt(i));
        }
    }
}
