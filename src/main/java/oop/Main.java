package oop;

public class Main {
    public static void main(String[] args) {
        //stores five roll nos
        int[] roll_nos = new int[5];

        //store name of five students
        String[] name = new String[5];

        //store data of 5 students, roll number, name , marks
        Student[] students= new Student[5];
        //Student[] students ->memory allocated in compile time
        //new Student[5] ->mem allocated in  run time

        Student hamza = new Student();
        //Student() is a constructor


        hamza.marks=88.4f;
        hamza.name="Hamza";
        hamza.rno= 1068;
        System.out.println(hamza.name);


    }

    static class Student{
        int rno;
        String name;
        float marks;
    }
}
