package com.company.lambdafunction;

// func interface
interface  MathOperation{
    int operation( int a, int b);
}
public class LambdaParams {
    public static void main(String[] args) {
        // Before java 8
        MathOperation add_op = new MathOperation() {
            @Override
            public int operation(int a, int b) {
                return  a+b;
            }
        };
        MathOperation sub_op = new MathOperation() {
            @Override
            public int operation(int a, int b) {
                return  a-b;
            }
        };
        System.out.println("Before java 8 add: " + add_op.operation(1,2));
        System.out.println("Before java 8 sub: " + sub_op.operation(1,4));
        // java 8
        MathOperation add = (a,b) -> a+b;
        MathOperation sub = (a,b) -> a-b;

        System.out.println("Add: " + add.operation(1,2));
        System.out.println("Sub: " + sub.operation(1,4) );
    }
}
