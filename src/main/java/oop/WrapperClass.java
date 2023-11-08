package oop;

import java.beans.Introspector;

public class WrapperClass {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        //swap(a, b);
        //System.out.println(a+" "+b);
        A hamza = new A("Hamza Iqbal");
        hamza.name="Muhammad Hamza Iqbal";
        System.out.println(hamza);


    }
    //final is a keyword, that prevent our contain to be modified.
    //final keyword will be all caps
    //final int CONSTANT = 9.8;
    //always initialize while declaring

//    static void swap(int a, int b){
//        int temp = a;
//        a=b;
//        b = temp;
//    }
public static void message() {
    System.out.println("Welcome to Java programming classes!");
}
    static class  A{
        final int num =10;
        String name;
        public A(String name){
            this.name = name;
        }
    }

}

//Packages:
//Packages are containers for classes
