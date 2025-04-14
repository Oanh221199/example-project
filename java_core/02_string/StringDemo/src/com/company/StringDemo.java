package com.company;

public class StringDemo {
    public static void main(String[] args) {
        String stringTest = "Hello";
        // Print Hello
        System.out.println("String before add: " + stringTest);

        stringTest = stringTest + " Oanh";

        // Print Hello String
        System.out.println("String after add: " + stringTest);

        //  Tạo ra một chuỗi mới bằng cách ghép stringTest và "Oanh".
        //  Gán lại kết quả vào stringTest.
        //  Chuỗi gốc ban đầu sẽ không bị thay đổi, nhưng được thay thế bằng chuỗi mới.
    }
}
