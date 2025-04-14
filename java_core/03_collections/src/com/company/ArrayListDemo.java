package com.company;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        // Tạo một ArrayList để lưu trữ các tên
        ArrayList<String> names = new ArrayList<String>();

        // Thêm các phần tử vào ArrayList
        names.add("An");
        names.add("Nguyen");
        names.add("Minh");
        names.add("Chi");

        // In ra ArrayList
        System.out.println("Danh sách tên: " + names);

        // Truy cập phần tử ở chỉ số cụ thể
        System.out.println("Phần tử tại chỉ số 2: " + names.get(2));  // Minh

        // Thay đổi phần tử tại chỉ số 1
        names.set(1, "My");
        System.out.println("Danh sách sau khi thay đổi: " + names);

        // Xóa phần tử tại chỉ số 3
        names.remove(3);
        System.out.println("Danh sách sau khi xóa: " + names);

        // Kiểm tra kích thước của ArrayList
        System.out.println("Kích thước danh sách: " + names.size());

        // Duyệt qua ArrayList và in từng phần tử
        System.out.println("Duyệt qua danh sách:");
        for (String name : names) {
            System.out.println(name);
        }

        // Kiểm tra phần tử có tồn tại trong ArrayList hay không
        if (names.contains("An")) {
            System.out.println("An có trong danh sách.");
        } else {
            System.out.println("An không có trong danh sách.");
        }

    }
}
