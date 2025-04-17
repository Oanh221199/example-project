package com.company.streamapi;

import java.util.Arrays;
import java.util.List;

public class StreamExample {

    List<Integer> numbers = Arrays.asList(7, 2, 5, 4, 2, 1);
    // use before java 8
    public void withoutStream() {
        long count = 0;
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                count++;
            }
        }

        System.out.printf("Count without Stream: %d%n", count);
    }
    // stream in java 8
    public void withStream() {
        long count = numbers.stream().filter(num -> num % 2 == 0).count();
        System.out.printf("Count with Stream: %d%n", count);
    }

    public static void main(String[] args) {
        StreamExample example = new StreamExample();
        example.withoutStream();
        example.withStream();
    }

}