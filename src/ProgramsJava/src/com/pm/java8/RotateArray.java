package com.pm.java8;

import java.util.Arrays;
import java.util.Optional;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;

        int n = arr.length;
        k = k % n; // handle k > n

        // Reverse parts of the array
        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);

       System.out.println("Rotated Array: " + Arrays.toString(arr));
        Arrays.stream(arr).forEach(System.out::println);
    }

    // Helper function to reverse subarray
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}


/*
 * Rotate an array by K steps
Input: [1,2,3,4,5], k=2 → Output: [4,5,1,2,3]
ChatGPT said:

Got it 👍 You want to rotate an array right by k steps.
For your input [1,2,3,4,5] and k=2, the result should be [4,5,1,2,3].

Here’s a Java solution using array reversal (efficient, O(n) time, O(1) space):

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;

        int n = arr.length;
        k = k % n; // handle k > n

        // Reverse parts of the array
        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);

        System.out.println("Rotated Array: " + Arrays.toString(arr));
    }

    // Helper function to reverse subarray
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}

✅ Output:
Rotated Array: [4, 5, 1, 2, 3]


Would you like me to also show you a Java 8 Stream one-liner approach (less efficient but very readable)?

You said:
yes
ChatGPT said:

Great 👍 Here’s the Java 8 stream-based one-liner approach to rotate an array by k steps:

import java.util.*;
import java.util.stream.*;

public class RotateArrayStream {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;
        int n = arr.length;
        k = k % n; // handle k > n

        int[] rotated = IntStream.concat(
                Arrays.stream(arr, n - k, n),  // last k elements
                Arrays.stream(arr, 0, n - k)  // first n-k elements
        ).toArray();

        System.out.println("Rotated Array: " + Arrays.toString(rotated));
    }
}

✅ Output:
Rotated Array: [4, 5, 1, 2, 3]


👉 This version is more concise but creates a new array (not in-place).
Would you like me to also give you a left rotation version (e.g., [1,2,3,4,5], k=2 → [3,4,5,1,2]) using streams?

You said:
how it useful k = k % n; // handle k > n
ChatGPT said:

Good catch 👍 Let’s break down why we use

k = k % n; // handle k > n

🔹 Why is it needed?

Suppose the array length is n.

Rotating by n steps brings the array back to its original position.
Example: [1,2,3,4,5], k = 5 → [1,2,3,4,5].

Rotating by n+1 steps is the same as rotating by 1 step.
Example: [1,2,3,4,5], k = 6 → same as k = 1.

So, we only need the effective rotation, which is k % n.

🔹 Example

Array: [1,2,3,4,5], n = 5

If k = 2 → effective rotation = 2 % 5 = 2 → [4,5,1,2,3]

If k = 5 → effective rotation = 5 % 5 = 0 → [1,2,3,4,5] (no change)

If k = 7 → effective rotation = 7 % 5 = 2 → [4,5,1,2,3]

👉 Without this line, if someone passes a k larger than n, your program would either:

Do extra unnecessary rotations, or

Run into ArrayIndexOutOfBoundsException in the stream approach.

Do you want me to also explain how to extend this logic for left rotation using the same % trick?

You said:
why this reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
ChatGPT said:

Nice question 👍 — that’s the array reversal trick for rotation.

Let’s unpack it step by step.

🔹 Goal

Rotate array [1,2,3,4,5] by k=2 steps to the right → [4,5,1,2,3].

🔹 Idea Behind Reversal Method

Instead of shifting elements one by one, we can achieve rotation by reversing parts of the array.

Steps:

Reverse the entire array
[1,2,3,4,5] → [5,4,3,2,1]

Reverse the first k elements ([5,4])
[5,4,3,2,1] → [4,5,3,2,1]

Reverse the remaining n-k elements ([3,2,1])
[4,5,3,2,1] → [4,5,1,2,3]

✅ Done! We got the rotated array.

🔹 Why It Works

First reversal puts the last k elements in front, but in reverse order.

Second reversal fixes the order of those first k elements.

Third reversal fixes the order of the remaining elements.

It’s like shuffling with 3 flips.

🔹 Complexity

Time: O(n) (every element is swapped a few times)

Space: O(1) (in-place, no extra array needed)

👉 This is one of the most efficient in-place methods.

Would you like me to also show you the same trick for left rotation (e.g., [1,2,3,4,5], k=2 → [3,4,5,1,2]) so you can compare?

ChatGPT can make mistakes. Check important info. See Cookie Preferences.
 */ 
