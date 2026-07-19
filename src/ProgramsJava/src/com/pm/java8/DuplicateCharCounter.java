package com.pm.java8;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCharCounter {
	
	public static void main(String[] args) {
        String input = "hello world java";

        // Count frequency of each character
        Map<Character, Long> charCountMap = input.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));//here Function.identity()  equivalent to w->w
        
        System.out.println("jjj"+charCountMap);
        
		/*other way
		 * Map<Character, Long> charCountMap = IntStream.range(0, input.length())
		 * .mapToObj(input::charAt) .collect(Collectors.groupingBy( Function.identity(),
		 * Collectors.counting() ));
		 */

        

        // Filter duplicates and print
        charCountMap.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .forEach(entry -> {
                    String key = entry.getKey() == ' ' ? "space" : String.valueOf(entry.getKey());
                    System.out.println(key + " = " + entry.getValue());
                });
        
        
        
        
     // Count frequency of each character (as String)
        Map<String, Long> freqq = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(w -> w, Collectors.counting()));

        // Filter duplicates and print
        freqq.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .forEach(entry -> {
                    String key = entry.getKey().equals(" ") ? "space" : entry.getKey();
                    System.out.println(key + " = " + entry.getValue());
                });
    }

}

/*When you do:

input.chars()


input is a String.

.chars() returns an IntStream of Unicode values (integers) of all characters in the string.

For example:

String input = "abc";
IntStream stream = input.chars();
stream.forEach(System.out::println);


Output:

97
98
99


These are the ASCII/Unicode codes for 'a', 'b', 'c'.

So each element of the stream is an int, not a char.

2️⃣ Why .mapToObj(c -> (char) c) is needed

You want a Stream of Characters (Stream<Character>) instead of IntStream.

.mapToObj(c -> (char) c) converts each int to a Character object.*/
