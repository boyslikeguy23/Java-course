package com.devmaster.lesson01.lambda_expression;

@FunctionalInterface
interface SayHello2{
    public void sayHello(String name);
}
public class LambdaExpression2 {
    public static void main(String[] args) {
        //Lambda su dung 1 tham so
        SayHello2 say1 = (name) ->{System.out.println("Hello" + name);
        };
        say1.sayHello("Devmaster");

        //Ngan gon
        SayHello2 say2 = name->{System.out.println("Hello" + name);
        };
        say2.sayHello("Devmaster2");

        //Ngan gon hon
        SayHello2 say3 = name->System.out.println("Hello" + name);
        say3.sayHello("Devmaster");
    }
}

