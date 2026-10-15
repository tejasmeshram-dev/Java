Problem Statement: String analyzer

Write a method: public static void analyzeString(String s)
It should print: The string length.
                 The first character, if the string is nonempty.
                 The last character, if the string is nonempty.
                 The number of vowels.
                 The string reversed.

Example input:    Hello
Expected output:  Length: 5
                  First: H
                  Last: o
                  Vowels: 2
                  Reversed: olleH

For an empty string, your method should not attempt to access charAt(0) or charAt(s.length() - 1).
You may assume the input is non-null and contains ordinary English letters and spaces.


    --------------------------------------------------------------------------------------------------------------------------------------------------------
Code Solution:



import java.util.Scanner;
public class StringAnalyzer {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        String sentence = sc.nextLine();

        System.out.println("Length: "+sentence.length());   // string length is calculated using .length() method whereas array length using .length only

        if(sentence.isEmpty()){  // checks if the string is empty
            System.out.println("First: N/A");
            System.out.println("Last: N/A");
        }else{
            System.out.println("First: "+sentence.charAt(0));  // sentence.charAt(i) shows the character at position i in string sentence
            System.out.println("Last: "+sentence.charAt(sentence.length()-1));
        }
        
        int count = 0;
        for(int i=0; i<sentence.length(); i++){
            char ch = Character.toLowerCase(sentence.charAt(i)); // Character.toLowerCase(A) converts the character into lower case = 'a'
            if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){  // checks the condition, if either one is true, count is increased by 1
                count++;
            }
        }
        System.out.println("Count: "+count);
        
        char[] reverse = new char[sentence.length()];
        for(int i=0;i<sentence.length();i++){
            reverse[i] = sentence.charAt(sentence.length()-1-i);
        } 
        System.out.println("Reverse String: "+new String(reverse));  // new String(reverse) converts the array 'reverse' with character elements into a string before printing
    }
}

