package com.company.functioninterface;

import java.util.function.Consumer;

//làm gì đó với dữ liệu (in ra, lưu...)
public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> print = s -> System.out.println(s);
        print.accept("Hello");

    }
}
