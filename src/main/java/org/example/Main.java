package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,4,6,2,6,3,7,9, 10);
        Integer sum =0;
        System.out.println(list.stream().filter(num -> num%2==0).mapToInt(a -> a));


        //reduce((a, b) -> a + b);


    }

}