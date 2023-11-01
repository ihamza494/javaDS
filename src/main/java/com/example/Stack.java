package com.example;

public class Stack {
    public static void main(String[] args) {
        //Stack class represents LIFO stack of object
        //it extends class vector with five operations that allow vectors to be treated as a Stack
        //the usual push and pop operations are provided
        //peek gives us the top value in stack
        //stack like stack of plates or pringles
        //stack extends vectors and vetor implements List

        java.util.Stack<Integer> stack = new java.util.Stack<>();
        stack.push(1);
        stack.push(2);
        System.out.println(stack.peek());
    }
}
