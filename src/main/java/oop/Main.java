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
        Student zayn = new Student(1067, "Zayn Ali", 82.0f);
        zayn.Greetings();
        hamza.Greetings();

        Student Ali = new Student(zayn);
        Ali.name = Ali.name + " Shykh";





        System.out.println(Ali.name);
        System.out.println(hamza.rno);
        System.out.println(Ali.marks);


    }

    static class Student{
        int rno;
        String name;
        float marks;
        Student(){
            this(1007, "Jaffar", 70.0f);
        }

        Student(Student other){
            this.name= other.name;
            this.rno= other.rno;
            this.marks= other.marks;
        }

        Student( int rno, String name,float marks){
            this.rno=rno;
            this.name=name;
            this.marks= marks;
        }

        void Greetings(){
            System.out.println("Hey "+this.name+", Welcome to the programming class!");
        }
    }
}
