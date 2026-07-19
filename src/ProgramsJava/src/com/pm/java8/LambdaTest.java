package com.pm.java8;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;
@FunctionalInterface
interface AddOperation {
    int add(int a, int b);
    default void sum()
    {
    	System.out.println("jj");
    }
    
}

public class LambdaTest {
    public static void main(String[] args) {
        AddOperation addition = (a, b) -> a + b;
        System.out.println("Sum: " + addition.add(5, 7));
        Integer[] a = {1,2,3,4};
        List<Integer> l =  Stream.of(a).filter(n->n%2==0).collect(Collectors.toList());
        int[] aaa = {1,2,3,4};

        List<Integer> ld =  Arrays.stream(aaa).filter(aa->aa%2==0).boxed()
        		.collect(Collectors.toList());
        
        
        Integer[] d = {1,2,3,4};
        List<Integer> f = Arrays.asList(d);
        List<Integer> j = f.stream().distinct().collect(Collectors.toList());
        System.out.println("jjj"+j);
        
        
        System.out.println(ld);
        
    }
}

