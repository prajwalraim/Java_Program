package com.pm.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparable_Epmoyee_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Comparable_Epmoyee> l = new ArrayList<>(List.of(new Comparable_Epmoyee("pm",10000), new Comparable_Epmoyee("dd",5678)));
		Collections.sort(l);
		System.out.println(l);

	}

}
