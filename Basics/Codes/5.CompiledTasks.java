Problem Statement: Build a complete Java program

Create one Java file named Main.java that:
      Defines all the methods from other 4 problem statements.
      Creates test data inside main().
      Calls every method.
      Prints readable labels for every result.

  
    ----------------------------------------------------------------------------------------------------------------------------------------------------
Code Solution:


import java.util.Scanner;
import java.util.Arrays;

public class CombinedTests {
    //Number Analyzer
    public static void numberAnalyzer(int num) {
        // positive, negative, zero
        if (num > 0) {
            System.out.println("Positive");
        } else if (num == 0) {
            System.out.println("Zero");
        } else {
            System.out.println("Negative");
        }
        // even, odd
        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
        //square
        long square = (long) num * num;
        System.out.println(square);
    }

    //String Analyzer
    public static void stringAnalyzer(String sentence) {
        System.out.println("Length: " + sentence.length());

        if (sentence.isEmpty()) {
            System.out.println("First: N/A");
            System.out.println("Last: N/A");
        } else {
            System.out.println("First " + sentence.charAt(0));
            System.out.println("Last " + sentence.charAt(sentence.length() - 1));
        }

        int count = 0;
        for (int i = 0; i < sentence.length(); i++) {
            char ch = Character.toLowerCase(sentence.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        System.out.println("Count: " + count);

        char[] reverse = new char[sentence.length()];
        for (int i = 0; i < sentence.length(); i++) {
            reverse[i] = sentence.charAt(sentence.length() - 1 - i);
        }
        System.out.println("Reverse String: " + new String(reverse));
    }

    //Array Statistics
    public static int findMin(int[] nums) {
        int min = nums[0];
        for (int i : nums) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    public static int findMax(int[] nums) {
        int max = nums[0];
        for (int i : nums) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public static long sumArray(int[] nums) {
        long sum = 0;
        for (int i : nums) {
            sum += i;
        }
        return sum;
    }

    public static double avg(int[] nums) {
        if (nums.length == 0) {
            throw new IllegalArgumentException(
                    "Array must not be empty"
            );
        }
        return (double) sumArray(nums) / nums.length;
    }

    //FizzBuzz
    public static void fizzbuzz(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Number Analyzer
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println("Number Analyzer:");
        numberAnalyzer(number);

        // String Analyzer
        sc.nextLine(); // Consume the leftover newline

        System.out.print("Enter a string: ");
        String sentence = sc.nextLine();

        System.out.println("String Analyzer:");
        stringAnalyzer(sentence);

        // Array Statistics
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Array size must be positive.");
            sc.close();
            return;
        }

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Minimum: " + findMin(arr));
        System.out.println("Maximum: " + findMax(arr));
        System.out.println("Sum: " + sumArray(arr));
        System.out.println("Average: " + avg(arr));

        // FizzBuzz
        System.out.print("Enter FizzBuzz limit: ");
        int n1 = sc.nextInt();

        System.out.println("FizzBuzz Series:");
        fizzbuzz(n1);

        sc.close();
    }
}
