package com.program.practice;
import java.util.HashMap;
import java.util.Map;
public class ReplaceExample {

	
		// TODO Auto-generated constructor stub
		    public static void main(String[] args) {
		        Map<Integer, String> map = new HashMap<>();
		        map.put(1, "Java");
		        map.put(2, "Python");

		        map.replace(2, "C++"); // replaces value at key 2
		        System.out.println(map); // {1=Java, 2=C++}
		        
		        
		        
		        StringBuilder sb = new StringBuilder("Hello World");

		        sb.replace(6, 11, "Java"); // replace "World" with "Java"
		        System.out.println(sb);    // "Hello Java"
		        
		        
		        
		        String str = "I like Java, Java is powerful";

		        String result = str.replace("Java", "Python");
		        System.out.println(result); // "I like Python, Python is powerful"
		        
		        
		        String strr = "java is fun";

		        String results = strr.replace('a', 'o');
		        System.out.println(results); // "jovo is fun"
		    }
		

	

}
