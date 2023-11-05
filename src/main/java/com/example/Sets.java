package com.example;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
        //A collection that contains no duplicate elements
        //and at most one null element
        //set doesn't guarantee order
        //set contains no pair of elements
        Set<Ball> balls= new HashSet<>();
        balls.add(new Ball("yellow"));
        balls.add(new Ball("blue"));
        balls.add(new Ball("red"));
        balls.forEach(System.out::println);
        //TreeSet preserves order and backed by TreeMap and HashSet backed by HashMap
    }
    static class Ball{
        public Ball(String color) {
            this.color=color;
        }
        String color;
    };
    //record Ball(String color){}
}
