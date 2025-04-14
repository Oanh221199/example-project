package com.company;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Hello");
        // Print Hello
        System.out.println("StringBuffer before append: " + stringBuffer);

        stringBuffer.append(" StringBuffer");

        // Print Hello StringBuffer
        System.out.println("StringBuffer after append: " + stringBuffer);
    }
}
