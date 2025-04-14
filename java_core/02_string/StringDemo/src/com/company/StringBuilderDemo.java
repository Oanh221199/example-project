package com.company;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Hello");
        // Print Hello
        System.out.println("StringBuilder before append: " + stringBuilder);

        stringBuilder.append(" StringBuilder"); // Thể hiện tính mutable

        // Print Hello StringBuilder
        System.out.println("StringBuilder after append: " + stringBuilder);
    }
}
