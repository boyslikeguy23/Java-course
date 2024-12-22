package com.devmaster.lesson01.lambda_expression;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortLambdaExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java SpringBoot", "C# NetCore", "PHP", "JavaScript");
        //Sap xep, su dung bieu thuc lambda
        Collections.sort(list, (String str1, String str2) -> str1.compareTo(str2));
        for (String str : list) {
            System.out.println(str);
        }
    }
}
