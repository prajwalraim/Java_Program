package com.program.adavanced;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImmutableClass im = new ImmutableClass("psm",10,new Date(),new ArrayList(List.of("eat","sleep")));
		String nm = im.getName();
		
		System.out.println("nm is ---"+nm);
		
		System.out.println("bith date--"+im.getBirthDate());
		Date temp = im.getBirthDate();
		List<String> hb = im.getHobbies();
		im.getHobbies().add("drink");
		System.out.println(im.getHobbies());
		hb.add("dance");
		System.out.println(im.getHobbies());
		List<String> hbs = hb;
		hbs.add("run");
		hbs.remove(0);
		System.out.println(im.getHobbies());

		

		

	}

}
