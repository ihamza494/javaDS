package com.example;

import java.util.ArrayList;
import java.util.List;

public class listAndArrayList {
    public static void main(String[] args) {
        //An ordered collection aka sequence
        //Allow duplicates
        //not fixed in size like arrays
        //fast for data retrievals
        //various implementations( ArrayList, Vector, Stack, Others)
        List<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("d0");
        System.out.println(colors);

//        for (int i = 0; i < colors.size(); i++) {
//            System.out.println(colors.get(i));
//        }
//
//        for (String color :  colors){
//            System.out.println(color);
//        }
//
//        colors.forEach(System.out::println);

        //unmodifiable list
        List<String> unmodifiableListOfColors = List.of("blue","red");
//        unmodifiableListOfColors.add("black");
    }
}
