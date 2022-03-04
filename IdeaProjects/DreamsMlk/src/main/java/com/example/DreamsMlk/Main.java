package com.example.DreamsMlk;

import java.util.function.IntPredicate;

public class Main {
    public static void main(String[] args) {

        IntPredicate predicate = x -> x < 10;
        boolean test = predicate.test(15);
        System.out.println(test);


    }
}

