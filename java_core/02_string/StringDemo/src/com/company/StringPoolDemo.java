package com.company;

public class StringPoolDemo {
    public static void main(String[] args) {
        // "abc" được tạo trong String pool (nếu chưa tồn tại).
        // s1 và s2 cùng trỏ đến một đối tượng "abc" duy nhất trong  StringPool( 1 phần của heap).
        String s1 = "abc";
        String s2 = "abc";
        // s3: sẽ được tạo ở heap space( 1 phần của heap)
        String s3 = new String("abc");
        System.out.println(s1 == s2); // true
        System.out.println(s1 == s3); // false (so sánh xem 2 cái có trỏ đến 1 object trong heap không)
        System.out.println(s1.equals(s3)); // true ( kiểm tra giá trị k kể vùng nhớ)

        // s4: sẽ được tạo ở heap space
        String s4 = new String("abc");
        System.out.println(s3 == s4); // false

        // Ép chuỗi về string pool
        String s5 = new String("abc").intern();
        System.out.println(s1 == s5); // true





    }
}
