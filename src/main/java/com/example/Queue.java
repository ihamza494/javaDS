package com.example;

import java.util.LinkedList;

public class Queue {
    public static void main(String[] args) {
        //Follows FIFO
        //Designed for holding elements prior to processing
        //Queue in a shopping mall or anywhere
        //Queue Extends Collections
        java.util.Queue<Person> supermarket = new LinkedList<>();
        supermarket.add(new Person("Ali", 22));
        supermarket.add(new Person("Hamza", 26));
        supermarket.add(new Person("Babar", 24));

        System.out.println(supermarket.peek());
        System.out.println(supermarket.size());
        System.out.println(supermarket.poll());
        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());

    }

    static record Person( String name, int age){}
}
