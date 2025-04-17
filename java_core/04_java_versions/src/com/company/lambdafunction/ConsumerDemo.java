package com.company.lambdafunction;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        // Code before java 8
        System.out.println("--------------Code before java 8---------------");
        for (Integer i : arr){
            System.out.println(i);
        }
        // Code java 8 + after
        System.out.println("--------------Code java 8---------------");
        Consumer<Integer> method = (n) -> {
            System.out.println(n);
        };
        arr.forEach(method);
    }
}
