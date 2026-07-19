package com.pm.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		//extract digits--0,1,1,2,3
		int n = Arrays.asList(1,2,3).stream().reduce(0, (a,b)->a+b);
		System.out.println(n);
	}
	    }
   

