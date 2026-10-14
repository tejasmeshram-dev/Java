1: Even or odd

Problem: Given an integer, determine whether it is even or odd.

public class Main {

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        int n = 7;

        if (isEven(n)) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}

Output:

Odd

What you practiced:

int
Methods
Parameters
Return values
The remainder operator
Conditions
Solved Example 2: Find the maximum in an array

Problem: Return the largest element in an integer array.

public class Main {

    public static int findMax(int[] nums) {
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] nums = {3, 10, 2, 25, 8};

        System.out.println(findMax(nums));
    }
}

Output:

25

What you practiced:

Arrays
Indexing
Loop boundaries
Conditions
Methods
Return values

Time complexity: O(n).

Assumption: the array is nonempty.

Solved Example 3: Count vowels in a string

Problem: Count the vowels in a string containing English letters.

public class Main {

    public static int countVowels(String s) {
        int count = 0;

        s = s.toLowerCase();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == 'a' ||
                ch == 'e' ||
                ch == 'i' ||
                ch == 'o' ||
                ch == 'u') {

                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String text = "Hello World";

        System.out.println(countVowels(text));
    }
}

Output:

3

What you practiced:

Strings
toLowerCase()
charAt()
String length
Logical OR
Counting
Methods

Time complexity: O(n) for a string of length n.

Solved Example 4: Reverse a string

Problem: Return a reversed copy of a string.

public class Main {

    public static String reverseString(String s) {
        char[] chars = s.toCharArray();

        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            char temp = chars[left];

            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }

        return new String(chars);
    }

    public static void main(String[] args) {
        String s = "hello";

        System.out.println(reverseString(s));
    }
}

Output:

olleh

What you practiced:

Strings
Character arrays
Indexing
Swapping
while
Two pointers
Return values

Time complexity: O(n).

Auxiliary space complexity: O(n), because the method creates a character array.
