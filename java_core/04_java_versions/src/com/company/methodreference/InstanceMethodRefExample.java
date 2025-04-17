package com.company.methodreference;

import java.sql.SQLOutput;
import java.util.ArrayList;

// Sử dụng method reference với System.out
public class InstanceMethodRefExample {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("a");
        arr.add("b");
        arr.add("c");
        arr.add("d");
        // lambda
        System.out.println("Lambda:");
        arr.forEach(i -> System.out.println(i));
        System.out.println("Method reference");
        // method reference
        arr.forEach(System.out::println);
    }
}
