package com.example;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map<Person, Diamond> map = new HashMap<>();
        map.put(new Person("Hamza"), new Diamond("kohinoor"));
    }

    public static void maps() {
        Map<Integer, Person> map = new HashMap<>();
        map.put(1, new Person("Hamza"));
        map.put(2, new Person("Ali"));
        map.put(3, new Person("mekayel"));
        System.out.println(map.keySet());

        map.entrySet().forEach(x-> System.out.println(x.getKey()+" "+ x.getValue().name));
    }
    record Person(String name){}
    record Diamond(String name){}
}
