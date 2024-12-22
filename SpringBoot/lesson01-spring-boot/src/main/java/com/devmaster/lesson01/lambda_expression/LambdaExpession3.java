package com.devmaster.lesson01.lambda_expression;
@FunctionalInterface
interface Calculator1{
    int add(int a, int b);
}

@FunctionalInterface
interface Calculator2{
   void add(int a, int b);
}
public class LambdaExpession3 {
    public static void main(String[] args) {
        Calculator1 calc1 = (int a, int b) -> a + b;
        int kq = calc1.add(1, 2);
        System.out.println(kq);

        Calculator1 calc2 = (int a, int b) -> a + b;
        System.out.println(calc2.add(11, 22));

        Calculator2 calc3 = (a,  b) -> System.out.println(a+b);
        calc3.add(121, 212);

        Calculator2 calc4 = (a, b) -> {
            int sum = a + b;
            System.out.println(a + " + " + b + " = " + sum);
        };
        calc4.add(41, 55);
    }
}
