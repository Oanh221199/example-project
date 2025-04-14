package com.company;

public class StringStringBuilderStringBufferDemo {
    public static void main(String[] args) {
        final int numberOfIterations = 10000;

        // ---------------------------
        // Test cộng chuỗi bằng String
        // ---------------------------
        long startTimeString = System.nanoTime();
        String sumOfString = "";
        for (int i = 0; i < numberOfIterations; i++) {
            sumOfString += "a"; // String là immutable
        }
        long endTimeString = System.nanoTime();
        System.out.println("String cộng chuỗi time: " + (endTimeString - startTimeString) / 1000000 + " ms");

        // -----------------------------------
        // Test cộng chuỗi bằng StringBuilder
        // -----------------------------------
        long startTimeStringBuilder = System.nanoTime();
        StringBuilder sumStringBuilder = new StringBuilder();
        for (int i = 0; i < numberOfIterations; i++) {
            sumStringBuilder.append("a"); // StringBuilder là mutable
        }
        long endTimeStringBuilder = System.nanoTime();
        System.out.println("StringBuilder cộng chuỗi time: " + (endTimeStringBuilder - startTimeStringBuilder) / 1000000 + " ms");

        // -----------------------------------
        // Test cộng chuỗi bằng StringBuffer
        // -----------------------------------
        long startTimeStringBuffer = System.nanoTime();
        StringBuffer sumStringBuffer = new StringBuffer();
        for (int i = 0; i < numberOfIterations; i++) {
            sumStringBuffer.append("a"); // StringBuffer là mutable và synchronized
        }
        long endTimeStringBuffer = System.nanoTime();
        System.out.println("StringBuffer cộng chuỗi time: " + (endTimeStringBuffer - startTimeStringBuffer) / 1000000 + " ms");
    }
}
