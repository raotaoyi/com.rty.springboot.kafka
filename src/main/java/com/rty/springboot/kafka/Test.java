package com.rty.springboot.kafka;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test {


    public static void main(String[] args) {
        Test test1 = new Test();
        Test test2 = new Test();
        Test test3 = test2;
        System.out.println(test3 == test2);
        int[] array={1,2};

        long b = 025;
        double a = 0x12345678;
        System.out.println(a);
        System.out.println(b);


    }
}
