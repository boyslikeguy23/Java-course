package com.devmaster.lesson01.method_ref;

import java.util.Arrays;

public class DemoMethodRef{
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        int sum = doAction(a, b, MathUtils::sum); //
        System.out.println(a + " + " + b + " = " + sum);
        int minus = doAction(a, b, MathUtils::minus);
        System.out.println(a + " - " + b + " = " + minus);

        //Tham chieu den mot instance method cua mot doi tuong cu the

        MathUtils mathUtils = new MathUtils();
        int multiply = doAction(a, b, MathUtils::multiply);
        System.out.println(a + " * " + b + " = " + multiply);

        //Tham chieu den mot instance method cua mot doi tuong tuy y cua mot kieu cu the
        String[] stringArray = {"Java", "C++", "PHP", "C#", "Javascript"};
        Arrays.sort(stringArray, String::compareToIgnoreCase);
        for(String str : stringArray){
            System.out.println(str);
        }
    }

    public static int doAction(int a, int b, ExecuteFunction func){
        return func.execute(a, b);
    }
}