package com.company.methodreference;

import java.util.function.Consumer;

// test static method reference
class  Message{
    public  static  void printMess(String mess){
        System.out.println(mess);
    }
}
public class StaticMethodRefExample {
    public static void main(String[] args) {
        // lambda
        Consumer<String> print = s-> Message.printMess(s);
        print.accept("Hello 123");
        //method reference
        Consumer<String> print_ref=Message::printMess;
        print_ref.accept("Hello 124");


    }
}
