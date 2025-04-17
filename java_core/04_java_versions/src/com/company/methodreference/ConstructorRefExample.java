package com.company.methodreference;

import java.util.function.Supplier;

class Person {
    public Person() {
        System.out.println("Person created!");
    }
}
//Constructor Reference
public class ConstructorRefExample {
    public static void main(String[] args) {
        // lambda
        Supplier<Person> s = () -> new Person();
        s.get();
        // Constructor Reference
        Supplier<Person> s2 = Person::new;
        s2.get();
    }
}
