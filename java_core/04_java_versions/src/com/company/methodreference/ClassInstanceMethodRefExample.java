package com.company.methodreference;

import java.util.function.Function;

public class ClassInstanceMethodRefExample {
    public static void main(String[] args) {
        // lambda
        Function<String, String> toLowerLambda = s -> s.toLowerCase();
        System.out.println(toLowerLambda.apply("HELLO LAMBDA"));

        // method reference
        Function<String, String> toLower = String::toLowerCase;

        System.out.println(toLower.apply("HELLO METHOD REFERENCE"));

    }
}
