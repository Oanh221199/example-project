package com.company.stack;

public class StackExample {
    public static void main(String[] args) {
        // Khi phương thức add được gọi, một khung sẽ được tạo trong Stack để lưu trữ các giá trị của biến a và b.
        int result = add(5, 10);
        // Khi phương thức add hoàn thành, khung này sẽ bị xóa khỏi Stack.
        System.out.println(result);
    }

    public static int add(int a, int b) {
        return a + b;  // Biến a và b là biến cục bộ trong phương thức add
    }
}

