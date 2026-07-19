package main.java.com.example.java8.streams;
import java.util.*;
public class Program14_FirstNonRepeatedChar {
    public static void main(String[] args) {
        String s = "swiss";
        Optional<Character> ch = s.chars()
            .mapToObj(c->(char)c)
            .filter(c->s.indexOf(c)==s.lastIndexOf(c))
            .findFirst();
        System.out.println(ch.orElse(null));
    }
}

/*Step 1: s.chars()

Converts the string "swiss" into an IntStream of Unicode code points:

['s', 'w', 'i', 's', 's']


→ Internally as ints: [115, 119, 105, 115, 115]

🔹 Step 2: .mapToObj(c -> (char) c)

Converts each int back to a Character object:

Stream<Character> → ['s', 'w', 'i', 's', 's']

🔹 Step 3: .filter(c -> s.indexOf(c) == s.lastIndexOf(c))

Keeps only characters that occur once in the string.

How?

indexOf(c) → position of first occurrence

lastIndexOf(c) → position of last occurrence
If both are same ⇒ that character appears only once.

Let’s see for "swiss":

Character	indexOf	lastIndexOf	Match?
's'	0	4	❌
'w'	1	1	✅
'i'	2	2	✅
's'	0	4	❌
's'	0	4	❌

After filtering ⇒ Stream becomes ['w', 'i']

🔹 Step 4: .findFirst()

Finds the first element that passed the filter.

So it picks 'w'.

The result is an Optional<Character> containing 'w'.

🔹 Step 5: ch.orElse(null)

If no non-repeated char is found, returns null.

Otherwise returns the character found.

✅ Output:

w */