package com.company.lambdafunction;

// Func interface
interface  SayInterface{
    void say();
}
public class LambdaSimpleExample {
    public static void main(String[] args) {
        // before  java 8
        SayInterface si = new SayInterface() {
            @Override
            public void say() {
                System.out.println("Hello java old");
            }
        };
        si.say();
        // java 8
        SayInterface s = ()-> System.out.println("Hello java 8");
        s.say();

    }
}
