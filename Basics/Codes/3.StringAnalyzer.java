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

        System.out.println("Length: "+sentence.length());

        if(sentence.isEmpty()){
            System.out.println("First: N/A");
            System.out.println("Last: N/A");
        }else{
            System.out.println("First: "+sentence.charAt(0));
            System.out.println("Last: "+sentence.charAt(sentence.length()-1));
        }
        
        int count = 0;
        for(int i=0; i<sentence.length(); i++){
            char ch = Character.toLowerCase(sentence.charAt(i));
            if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
                count++;
            }
        }
        System.out.println("Count: "+count);
        
        char[] reverse = new char[sentence.length()];
        for(int i=0;i<sentence.length();i++){
            reverse[i] = sentence.charAt(sentence.length()-1-i);
        } 
        System.out.println("Reverse String: "+new String(reverse));
    }
}

