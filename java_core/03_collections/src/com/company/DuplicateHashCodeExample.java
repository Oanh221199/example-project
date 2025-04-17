package com.company;
import java.util.HashMap;

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return 1; // có hashCode giống nhau
    }

    @Override
    public boolean equals(Object obj) {
        return false; // Tất cả đều khác nhau
    }

    @Override
    public String toString() {
        return name;
    }
}

public class DuplicateHashCodeExample {
    public static void main(String[] args) {
        HashMap<Person, String> map = new HashMap<Person, String>();
        map.put(new Person("Oanh"), "Value1");
        map.put(new Person("Nguyen"), "Value2");
        map.put(new Person("Minh"), "Value3");

        System.out.println("Map size: " + map.size()); // 3
        map.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
