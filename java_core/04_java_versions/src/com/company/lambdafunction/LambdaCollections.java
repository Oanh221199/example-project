package com.company.lambdafunction;

import java.util.ArrayList;

public class LambdaCollections {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        //Before java 8
        System.out.println("Before java 8:");
        for (Integer i:arr){
            System.out.println(i);

        }
        //Java 8
        System.out.println("Java 8+:");
        arr.forEach(i -> System.out.println(i));
    }
}
