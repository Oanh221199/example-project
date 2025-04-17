package com.company.functioninterface;

import java.util.function.Supplier;

// cấp phát / cung cấp dữ liệu
public class SupplierExample {
    public static void main(String[] args) {
        Supplier supplier = () -> "Hello";
        System.out.println(supplier.get());
    }
}
