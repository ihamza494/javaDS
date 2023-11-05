package com.example;

import java.util.LinkedList;
import java.util.ListIterator;

public class QueueAndLinkedList {
    public static void main(String[] args) {
        //Follows FIFO
        //Designed for holding elements prior to processing
        //Queue in a shopping mall or anywhere
        //Queue Extends Collections
        //Queues();

        LinkedList<Person> linkedlist = new LinkedList<>();
        linkedlist.add(new Person("Hamza",24));
        linkedlist.add(new Person("Osama", 22));
        linkedlist.add(new Person("Arsalan", 27));
        ListIterator<Person> personListIterator = linkedlist.listIterator();
        while(personListIterator.hasNext()){
            System.out.println(personListIterator.next());
        }
        System.out.println();
        while(personListIterator.hasPrevious()){
            System.out.println(personListIterator.previous());
        }

    }

    private static void Queues() {
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
