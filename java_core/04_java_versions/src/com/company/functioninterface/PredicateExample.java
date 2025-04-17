package com.company.functioninterface;

import java.util.function.Predicate;
//kiểm tra điều kiện (đúng/sai)
public class PredicateExample {
    public static void main(String[] args) {
        Predicate<String> is_int = s -> s.length()>5;
        System.out.println(is_int.test("java"));
    }
}
