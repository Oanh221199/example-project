package com.company.functioninterface;

import java.util.function.Function;

// Test Function<T, R> – chuyển đổi dữ liệu
public class FunctionExample {
    public static void main(String[] args) {
        Function<String, Integer> lenght_func = s -> s.length();
        int len = lenght_func.apply("Hello");
        System.out.println("Length: "+ len);
    }
}
