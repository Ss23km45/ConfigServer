package com.codingninja.practise.leetcode.solutions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class RepeatedSubString {
    public static void main(String[] args) {
        String a = "This is the longest system under the which system this is made is remarkable system";
        String b = "system";
        repeatedSubString(a,b);
    }

    private static void repeatedSubString(String input,String traget) {
        List<String> mylist = Arrays.asList(input.split(" "));
        int a = Collections.frequency(mylist, traget);
        System.out.println("This ma " + a);
    }
}
