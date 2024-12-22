package com.devmaster.lesson01.pkg_stream_api;

import java.util.Arrays;
import java.util.List;

public class StreamExample {
    List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    //Dem cac so chan
    //Khong dung stream
    public void withoutStream(){
        int count = 0;
        for(Integer integer : integerList){
            if(integer % 2 == 0){count++;};
        }
        System.out.println("WithoutStream -> So phan tu chan: " + count);
    }

    //Dung stream
}
