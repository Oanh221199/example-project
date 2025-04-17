package com.company.functioninterface;

@FunctionalInterface
interface  SayInterface{
    void say();
    // void doAnother(); // Lỗi nếu thêm method thứ 2.
}
public class FunctionInterfaceExample {
    public static void main(String[] args) {
        SayInterface s = () -> System.out.println("Hello");
        s.say();
    }
}
