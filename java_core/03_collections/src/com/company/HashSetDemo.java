package com.company;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        // Tạo một HashSet để lưu trữ các email đã đăng ký
        HashSet<String> registeredEmails = new HashSet<String>();

        // Các email đăng ký
        String email1 = "an@example.com";
        String email2 = "binh@example.com";
        String email3 = "an@example.com"; // Email trùng với email1

        // Đăng ký email 1
        if (registeredEmails.add(email1)) {
            System.out.println("Email " + email1 + " đã được đăng ký thành công.");
        } else {
            System.out.println("Email " + email1 + " đã được đăng ký trước đó.");
        }

        // Đăng ký email 2
        if (registeredEmails.add(email2)) {
            System.out.println("Email " + email2 + " đã được đăng ký thành công.");
        } else {
            System.out.println("Email " + email2 + " đã được đăng ký trước đó.");
        }

        // Đăng ký email 3 (trùng với email1)
        if (registeredEmails.add(email3)) {
            System.out.println("Email " + email3 + " đã được đăng ký thành công.");
        } else {
            System.out.println("Email " + email3 + " đã được đăng ký trước đó.");
        }

        // In ra tất cả các email đã đăng ký
        System.out.println("\nDanh sách email đã đăng ký:");
        for (String email : registeredEmails) {
            System.out.println(email);
        }
    }
}
